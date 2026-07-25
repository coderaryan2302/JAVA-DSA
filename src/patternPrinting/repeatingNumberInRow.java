package patternPrinting;

import java.util.Scanner;

public class repeatingNumberInRow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

/*
Repeating Number in Row Pattern

Definition
• Is pattern me har row me usi row ka number repeat hota hai aur right triangle ki shape banti hai.

Working
• Outer loop rows ko control karti hai.
• Inner loop current row number ko baar-baar print karta hai.
• Har next row me repetition ek baar badh jati hai.

Key Points
• Har row me sirf ek hi number print hota hai.
• Number current row ke barabar hota hai.
• Har next row me ek repetition increase hoti hai.
• Ye nested loops ka basic pattern hai.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Inner Loop → Repetition
• Print Current Row Number
*/