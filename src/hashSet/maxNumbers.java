package hashSet;

import java.util.HashSet;

public class maxNumbers {

    // Maximum Numbers on the Table
    static int maxNumbersOnTable(int[] bag) {

        HashSet<Integer> table = new HashSet<>();

        int maxSize = 0;

        for (int number : bag) {

            if (table.contains(number)) {

                table.remove(number);

            } else {

                table.add(number);

                maxSize = Math.max(maxSize, table.size());
            }
        }

        return maxSize;
    }

    public static void main(String[] args) {

        int[] bag = {2, 1, 1, 3, 2, 3};

        System.out.println("Maximum Numbers on Table : "
                + maxNumbersOnTable(bag));
    }
}

/*

Max Numbers on the Table

Definition

• Bag me har Number exactly 2 baar aata hai.
• Pehli baar aaye to Table par add karo.
• Dobara aaye to Table se remove karo.
• Kisi bhi time Table par Maximum kitne Numbers the, ye find karna hai.

Example

Input

2 1 1 3 2 3

Output

2

Concept Used

• HashSet

Main Logic

• Number present nahi hai to HashSet me add karo.
• Number pehle se present hai to remove kar do.
• Har add ke baad Maximum Size update karo.

Algorithm

1. HashSet banao.
2. Bag ke sabhi Numbers traverse karo.
3. Agar Number present ho to remove karo.
4. Warna add karo.
5. Add ke baad Maximum Size update karo.
6. Maximum Size return karo.

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Single Traversal
• Fast add(), remove(), contains()
• Simple Logic
• Interview Friendly

Disadvantages

• Extra HashSet Space use hoti hai.

Applications

• Pair Matching Problems
• Toggle State Problems
• Active Object Tracking
• Session Tracking
• Competitive Programming

*/