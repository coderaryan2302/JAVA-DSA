package patternPrinting;

import java.util.Scanner;

public class sandglass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Upper Half
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }

            for (int j = rows - 1; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = 2; i <= rows; i++) {

            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
Sandglass Pattern

Definition
• Sandglass Pattern me stars hourglass (⏳) ki shape me print hote hain.

Working
• Pehle upper half print hota hai.
• Har row me leading spaces badhti hain aur stars kam hote jate hain.
• Fir lower half print hota hai.
• Har row me spaces kam hoti hain aur stars badhte jate hain.

Key Points
• Upper half me stars decrease hote hain.
• Lower half me stars increase hote hain.
• Pattern vertically symmetric hota hai.
• Total stars in each row = (2 × Current Stars - 1)

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Upper Half → Spaces ↑, Stars ↓
• Lower Half → Spaces ↓, Stars ↑
• Shape = Sandglass (Hourglass)
*/