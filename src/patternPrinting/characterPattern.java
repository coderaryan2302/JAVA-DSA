package patternPrinting;

import java.util.Scanner;

public class characterPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Pattern 1
        System.out.println("Pattern 1");

        char character = 'A';

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(character + " ");
                character++;
            }

            System.out.println();
        }

        System.out.println();

        // Pattern 2
        System.out.println("Pattern 2");

        for (int i = 1; i <= rows; i++) {

            char character1 = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(character1);
                character1++;
            }

            System.out.println();
        }
    }
}

/*
Character Pattern

Definition
• Character Pattern me alphabets (A, B, C, ...) ko different triangle patterns me print kiya jata hai.

Working

Pattern 1
• Character 'A' se start hota hai.
• Har character print hone ke baad next alphabet print hota hai.
• Characters continuously increase hote hain aur repeat nahi hote.

Pattern 2
• Har row me character fir se 'A' se start hota hai.
• Current row tak alphabets increasing order me print hote hain.

Key Points
• Pattern 1 → Characters continuously increase.
• Pattern 2 → Har row 'A' se restart hoti hai.
• Alphabets ASCII/Unicode order me increase hote hain.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows (Z ke baad next Unicode characters print honge)

Time Complexity : O(rows²)

Space Complexity : O(1)

Revision
• Pattern 1 → Continuous Characters
• Pattern 2 → Restart from A in Every Row
• Outer Loop → Rows
• Inner Loop → Characters
*/