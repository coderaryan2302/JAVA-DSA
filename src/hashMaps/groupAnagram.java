package hashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {

    static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] letters = word.toCharArray();
            Arrays.sort(letters);                    // Sort Characters

            String key = new String(letters);        // Common Key

            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] words = {
                "eat", "tea", "tan",
                "ate", "nat", "bat"
        };

        System.out.println(groupAnagrams(words));
    }
}

/*

Group Anagrams

Definition

• Anagrams ko ek hi group me store karna.
• Anagram me same characters aur same frequency hoti hai, sirf order different hota hai.

Example

Input

[eat, tea, tan, ate, nat, bat]

Output

[[eat, tea, ate], [tan, nat], [bat]]

Concept Used

• HashMap
• Sorting
• String
• ArrayList

Main Idea

• Har Anagram ka Sorted String same hota hai.

Example

eat → aet
tea → aet
ate → aet

Key = "aet"

Value = [eat, tea, ate]

HashMap Structure

HashMap<String, List<String>>

Key

• Sorted String

Value

• Same group ke Original Words

Algorithm

1. HashMap banao.
2. Har word ko Character Array me convert karo.
3. Characters sort karo.
4. Sorted String ko Key banao.
5. Agar Key exist nahi karti to nayi List banao.
6. Original Word ko us List me add karo.
7. Sabhi groups return kar do.

Time Complexity

• O(n × k log k)

n = Number of Words
k = Length of Each Word

Space Complexity

• O(n × k)

Advantages

• Simple Logic
• Fast Grouping
• Interview me bahut common problem

Disadvantages

• Sorting ki wajah se Time Complexity badh jati hai.

Applications

• Dictionary
• Word Games
• Spell Checker
• Text Processing
• String Classification

*/