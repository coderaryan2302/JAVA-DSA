package patternPrinting;

import java.util.Scanner;

public class pyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print right stars
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
Pyramid Pattern

Definition
• Pyramid Pattern me stars pyramid ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Har row ke shuru me leading spaces print hoti hain.
• Pehle left side ke stars print hote hain.
• Fir right side ke stars print hote hain.
• Har next row me stars badhte aur spaces kam hoti jati hain.

Key Points
• Pattern vertically symmetric hota hai.
• Har next row me spaces decrease hoti hain.
• Har next row me stars increase hote hain.
• Total stars in each row = (2 × Row Number - 1)

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Spaces ↓
• Stars ↑
• Shape = Pyramid
*/