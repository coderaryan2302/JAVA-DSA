package patternPrinting;

import java.util.Scanner;

public class diamondPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Upper Part
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

        // Lower Part
        for (int i = 2; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Print left stars
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }

            // Print right stars
            for (int j = rows - 1; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
Diamond Pattern

Definition
• Diamond Pattern me stars diamond (♦) ki shape me print hote hain.
• Ye Upper Triangle aur Inverted Triangle ko combine karke banta hai.

Working
• Upper Part me har next row me spaces kam aur stars badhte hain.
• Lower Part me har next row me spaces badhti hain aur stars kam hote hain.
• Dono parts milkar complete diamond banate hain.

Key Points
• Upper Part → Spaces ↓, Stars ↑
• Lower Part → Spaces ↑, Stars ↓
• First row me 1 star hota hai.
• Middle row me maximum stars hote hain.
• Last row fir se 1 star hota hai.
• Lower part i = 2 se start hota hai taki middle row repeat na ho.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)

Space Complexity : O(1)

Revision
• Outer Loop → Upper Triangle
• Outer Loop → Lower Inverted Triangle
• Spaces + Stars = Diamond
• Lower Part Starts from i = 2 to Avoid Duplicate Middle Row
*/