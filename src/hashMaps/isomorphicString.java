package hashMaps;

import java.util.HashMap;

public class isomorphicString {

    static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (mapST.containsKey(sChar)) {

                if (mapST.get(sChar) != tChar)
                    return false;

            } else {

                mapST.put(sChar, tChar);
            }

            if (mapTS.containsKey(tChar)) {

                if (mapTS.get(tChar) != sChar)
                    return false;

            } else {

                mapTS.put(tChar, sChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "add"));      // true
        System.out.println(isIsomorphic("foo", "bar"));      // false
        System.out.println(isIsomorphic("paper", "title"));  // true
    }
}

/*

Isomorphic String

Definition

• Do Strings Isomorphic tab hote hain jab har character dusri String ke sirf ek unique character se map ho.
• Mapping One-to-One aur Consistent honi chahiye.

Examples

• egg ↔ add ✔
• paper ↔ title ✔
• foo ↔ bar ✖
• ab ↔ aa ✖

Approach

• Do HashMaps use karo.

Map 1

• s → t

Map 2

• t → s

Algorithm

1. Length check karo.
2. Dono Strings ko ek saath traverse karo.
3. s → t mapping verify ya insert karo.
4. t → s mapping verify ya insert karo.
5. Agar koi mapping mismatch ho to false return karo.
6. Puri String valid ho to true return karo.

Why Two HashMaps?

• Pehla HashMap s → t check karta hai.
• Dusra HashMap t → s check karta hai.
• Isse One-to-One Mapping ensure hoti hai.

Example

egg → add

e → a
g → d

Valid ✔

foo → bar

f → b
o → a
o → r ✖

Invalid

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Fast Lookup
• Simple Logic
• One-to-One Mapping
• Interview Preferred

Disadvantages

• Extra Space use hoti hai.
• Do HashMaps maintain karne padte hain.

Applications

• Pattern Matching
• String Encoding
• Compiler Design
• Data Transformation
• Character Mapping

*/