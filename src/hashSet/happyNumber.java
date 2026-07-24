package hashSet;

import java.util.HashSet;

public class happyNumber {

    static boolean isHappy(int num) {

        HashSet<Integer> set = new HashSet<>();

        while (num != 1) {

            // Cycle Detected
            if (set.contains(num))
                return false;

            set.add(num);

            int sum = 0;

            // Sum of Squares of Digits
            while (num > 0) {

                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }

            num = sum;
        }

        return true;
    }

    public static void main(String[] args) {

        int num = 19;

        if (isHappy(num))
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }
}

/*

Happy Number (LeetCode 202)

Definition

• Happy Number woh hota hai jo repeatedly digits ke squares ka sum nikalne par
  eventually 1 ban jaye.
• Agar process repeat hone lage (Cycle ban jaye), to Happy Number nahi hai.

Example

Input

19

Calculation

19 → 82 → 68 → 100 → 1

Output

true

Concept Used

• HashSet
• Cycle Detection
• Digit Extraction

Main Logic

• Har step par digits ke squares ka sum nikalo.
• Number 1 ban gaya to Happy Number.
• Agar koi Number dobara aa jaye to Cycle detect ho gayi,
  isliye Happy Number nahi hai.

Algorithm

1. HashSet banao.
2. Jab tak Number 1 na ban jaye:
   • Agar Number pehle se HashSet me hai to false return karo.
   • Number ko HashSet me store karo.
   • Digits ke squares ka sum nikalo.
   • Number ko naye sum se replace karo.
3. Number 1 ban jaye to true return karo.

Time Complexity

• O(log n)

Space Complexity

• O(log n)

Advantages

• Easy Implementation
• Efficient Cycle Detection
• Infinite Loop se bachata hai

Disadvantages

• Extra HashSet Space use hoti hai.

Applications

• Cycle Detection
• Number Theory Problems
• State Tracking
• Infinite Loop Detection

*/