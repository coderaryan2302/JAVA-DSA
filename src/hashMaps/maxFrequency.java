package hashMaps;

import java.util.HashMap;
import java.util.Map;

public class maxFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};

        Map<Integer, Integer> freq = new HashMap<>();

        // Create Frequency Map
        for (int element : arr) {
            freq.put(element, freq.getOrDefault(element, 0) + 1);
        }

        System.out.println("Frequency Map : " + freq);

        // Find Maximum Frequency
        int maxFreq = 0;
        int ansKey = -1;

        // Method 1 : entrySet()

        /*
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                ansKey = entry.getKey();
            }
        }
        */

        // Method 2 : keySet()

        for (int key : freq.keySet()) {

            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }

        System.out.printf("%d has maximum frequency and occurs %d times.",
                ansKey, maxFreq);
    }
}

/*

Maximum Frequency Element

Definition

• Array me jis Element ki Frequency sabse zyada ho, use find karna.

Example

Input

1 4 2 5 1 4 4 6 4 4 4

Output

Element = 4

Frequency = 6

Concept Used

• HashMap (Frequency Map)

Frequency Map

Element → Frequency

Example

2 → 3
3 → 2
1 → 1

Algorithm

1. HashMap banao.
2. Array traverse karke har Element ki Frequency count karo.
3. HashMap traverse karo.
4. Maximum Frequency compare karo.
5. Maximum Frequency wala Element print karo.

HashMap Traversal

Method 1

• entrySet()

• Key aur Value dono direct milte hain.
• Thoda efficient.

Method 2

• keySet()

• Key se value get() karke access karte hain.
• Samajhne me easy.

Time Complexity

• Frequency Count → O(n)
• HashMap Traversal → O(k)

Overall

• O(n)

k = Unique Elements

Space Complexity

• O(k)

Worst Case

• O(n)

Advantages

• Fast Solution
• Easy Implementation
• Single Traversal for Counting
• Interview Favourite

Disadvantages

• Extra HashMap Space use hoti hai.

Applications

• Frequency Counting
• Voting System
• Most Frequent Word
• Data Analysis
• Statistics
• Competitive Programming

*/