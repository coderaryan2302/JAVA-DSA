package patternPrinting;

import java.util.Scanner;

public class reversePyramid {

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
Reverse Pyramid Pattern

Definition
• Reverse Pyramid Pattern me stars ulte pyramid (inverted pyramid) ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Har next row me leading spaces ek badh jati hain.
• Left aur right side ke stars print karke reverse pyramid banti hai.
• Har next row me stars kam hote jate hain.

Key Points
• Pattern vertically symmetric hota hai.
• Har next row me spaces increase hoti hain.
• Har next row me stars decrease hote hain.
• Total stars in each row = (2 × Current Stars - 1)

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Spaces ↑
• Stars ↓
• Shape = Reverse Pyramid
*/