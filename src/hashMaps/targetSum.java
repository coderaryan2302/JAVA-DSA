package hashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class targetSum {

    // Two Sum using HashMap
    static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int partner = target - arr[i];

            if (map.containsKey(partner))
                return new int[]{map.get(partner), i};

            map.put(arr[i], i);
        }

        return new int[]{-1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}

/*

Two Sum

Definition

• Aise do Elements ke Indices find karne hain jinka Sum Target ke equal ho.

Example

Input

Array

2 7 11 15

Target

9

Output

[0, 1]

Concept Used

• HashMap

HashMap

Element → Index

Main Logic

Partner = Target - Current Element

• Agar Partner HashMap me mil jaye to Answer mil gaya.
• Warna Current Element ko HashMap me store kar do.

Algorithm

1. HashMap banao.
2. Array traverse karo.
3. Partner = Target - Current Element nikalo.
4. Agar Partner HashMap me ho to dono Indices return karo.
5. Warna Current Element aur uska Index store karo.
6. Pair na mile to {-1} return karo.

Why Search Before Store?

Example

Array

3 3

Target

6

• Pehle search karne se same Element ka same Index use nahi hota.
• Do alag Indices milte hain.

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Single Traversal
• Fast Solution
• Simple Logic
• Interview Favourite

Disadvantages

• Extra HashMap Space use hoti hai.

Applications

• Pair Sum Problems
• Target Sum
• Financial Transactions
• Data Searching
• Competitive Programming

*/