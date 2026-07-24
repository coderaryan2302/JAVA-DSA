package hashMaps;

import java.util.HashMap;

public class anagram {

    // Create Frequency Map
    static HashMap<Character, Integer> frequency(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }

    // Method 1 : Two HashMaps
    static boolean isAnagramMethod1(String s, String t) {

        if (s.length() != t.length())
            return false;

        return frequency(s).equals(frequency(t));
    }

    // Method 2 : Single HashMap
    static boolean isAnagramMethod2(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = frequency(s);

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (!map.containsKey(ch))
                return false;

            int count = map.get(ch);

            if (count == 1)
                map.remove(ch);
            else
                map.put(ch, count - 1);
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        System.out.println("Method 1 : " + isAnagramMethod1(s, t));
        System.out.println("Method 2 : " + isAnagramMethod2(s, t));
    }
}

/*

Valid Anagram

Definition

• Do Strings Anagram tab hote hain jab unme same characters aur unki same frequency ho.
• Characters ka order matter nahi karta.

Examples

• listen ↔ silent ✔
• triangle ↔ integral ✔
• heart ↔ earth ✔
• hello ↔ world ✖

Approach 1 (Two HashMaps)

1. Length check karo.
2. Dono Strings ka Frequency Map banao.
3. Dono Maps compare karo.

Approach 2 (Single HashMap)

1. Length check karo.
2. First String ka Frequency Map banao.
3. Second String traverse karo.
4. Har character ki frequency decrease karo.
5. Frequency 0 ho to key remove kar do.
6. Map empty ho jaye to Strings Anagram hain.

Frequency Map

Example

banana

b → 1
a → 3
n → 2

Method Comparison

Method 1

• Two HashMaps
• Easy to understand

Method 2

• One HashMap
• Less Memory
• Interview Preferred

Time Complexity

Method 1

• O(n)

Method 2

• O(n)

Space Complexity

Method 1

• O(n)

Method 2

• O(n)

Advantages

• Fast Solution
• Simple Logic
• HashMap ka efficient use
• Interview me common

Disadvantages

• Extra memory use hoti hai.
• Character frequency comparison tak limited hai.

Applications

• Spell Checker
• Dictionary Search
• Word Games
• Text Processing
• String Matching
• NLP (Natural Language Processing)

*/