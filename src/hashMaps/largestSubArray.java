package hashMaps;

import java.util.HashMap;

public class largestSubArray {

    // Largest Subarray with Sum = 0
    static int zeroSumLargestSubArray(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        map.put(0, -1);        // Base Case

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {

                int length = i - map.get(prefixSum);

                maxLength = Math.max(maxLength, length);

            } else {

                map.put(prefixSum, i);      // Store First Occurrence
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println("Largest Zero Sum Subarray Length : "
                + zeroSumLargestSubArray(arr));
    }
}

/*

Largest Subarray with Sum = 0

Definition

• Aisi Longest Continuous Subarray find karni hai jiska Sum 0 ho.

Example

Input

15 -2 2 -8 1 7 10 23

Output

5

Subarray

-2 2 -8 1 7

Concept Used

• Prefix Sum
• HashMap

Prefix Sum

Formula

prefixSum += arr[i]

Main Logic

• Agar same Prefix Sum dobara milta hai,
  to un dono indices ke beech ka Sum 0 hota hai.

Algorithm

1. HashMap banao.
2. Base Case me 0 → -1 store karo.
3. Array traverse karo.
4. Prefix Sum update karo.
5. Agar Prefix Sum pehle se exist karta hai:
   • Length = Current Index − Previous Index
   • Maximum Length update karo.
6. Warna Prefix Sum ka First Occurrence store karo.
7. Maximum Length return karo.

Why 0 → -1 ?

• Index 0 se start hone wali Zero Sum Subarray ko handle karne ke liye.

Why Store First Occurrence?

• First Occurrence se sabse badi (Longest) Subarray milti hai.

Example

Prefix Sum

5 → Index 2
5 → Index 8

Length = 8 - 2 = 6

Agar value overwrite kar doge to answer chhota ho jayega.

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Single Traversal
• Efficient Solution
• Interview Favourite
• Prefix Sum + HashMap Pattern

Disadvantages

• Extra HashMap Space lagti hai.

Applications

• Zero Sum Subarray
• Longest Subarray Problems
• Prefix Sum Problems
• Competitive Programming
• Coding Interviews

*/