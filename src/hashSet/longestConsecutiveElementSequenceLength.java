package hashSet;

import java.util.HashSet;

public class longestConsecutiveElementSequenceLength {

    // Longest Consecutive Sequence
    static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Store all Elements
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {

            // Start of Sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest Consecutive Sequence Length : "
                + longestConsecutive(arr));
    }
}

/*

Longest Consecutive Sequence (LeetCode 128)

Definition

• Array me Longest Consecutive Sequence ki Length find karni hai.
• Elements Array me adjacent hona zaroori nahi hai.

Example

Input

100 4 200 1 3 2

Output

4

Sequence

1 → 2 → 3 → 4

Concept Used

• HashSet

Main Logic

• Sabhi Elements HashSet me store karo.
• Sirf wahi Element Sequence ka Start hoga jiska Previous Number
  (num - 1) HashSet me present na ho.
• Fir Next Consecutive Numbers count karo.

Algorithm

1. Array ke sabhi Elements HashSet me store karo.
2. HashSet traverse karo.
3. Agar (num - 1) present nahi hai to nayi Sequence start karo.
4. Consecutive Numbers count karo.
5. Maximum Length update karo.
6. Result return karo.

Why Check (num - 1)?

• Isse sirf Sequence ke Starting Element se counting hoti hai.
• Repeated Work bach jata hai.
• Time Complexity O(n) rehti hai.

Time Complexity

• O(n) (Average)

Space Complexity

• O(n)

Advantages

• Fast Solution
• No Sorting Required
• Automatically Removes Duplicates
• Interview Favourite

Disadvantages

• Extra HashSet Space use hoti hai.

Applications

• Consecutive Number Problems
• Sequence Detection
• Data Analysis
• Competitive Programming
• Coding Interviews

*/