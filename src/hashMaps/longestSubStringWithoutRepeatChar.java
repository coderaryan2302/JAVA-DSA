package hashMaps;

import java.util.HashMap;

public class longestSubStringWithoutRepeatChar {

    static int longestSubstring(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            char currentChar = str.charAt(right);

            // Duplicate found inside current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }

            map.put(currentChar, right);      // Store Latest Index

            int currentLength = right - left + 1;

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println("Longest Length : " + longestSubstring(str));
    }
}

/*

Longest Substring Without Repeating Characters

Definition

• Aisi Longest Substring find karni hai jisme koi bhi Character repeat na ho.

Example

Input

abcabcbb

Output

3

Substring

abc

Concept Used

• HashMap
• Sliding Window
• Two Pointers

Main Idea

• Window me sirf Unique Characters rakhne hain.
• HashMap Character ka Latest Index store karta hai.
• Duplicate milte hi Left Pointer ko aage move kar dete hain.

HashMap

Character → Latest Index

Example

a → 3
b → 4
c → 5

Algorithm

1. HashMap banao.
2. Left Pointer = 0.
3. Right Pointer se String traverse karo.
4. Agar Duplicate current window ke andar mile:
   • Left = Last Index + 1
5. Character ka Latest Index update karo.
6. Current Window Length nikalo.
7. Maximum Length update karo.

Important Condition

map.get(ch) >= left

• Ye ensure karta hai ki Duplicate current window ke andar hi ho.

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Single Traversal
• Fast Solution
• Sliding Window Pattern
• Interview Favourite

Disadvantages

• Extra HashMap Space use hoti hai.

Applications

• Password Validation
• Text Processing
• String Matching
• Sliding Window Problems

*/