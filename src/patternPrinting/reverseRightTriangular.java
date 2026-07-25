package patternPrinting;

import java.util.Scanner;

public class reverseRightTriangular {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
Reverse Right Triangle Pattern

Definition
• Reverse Right Triangle Pattern me stars right triangle ki ulta (inverted) shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Inner loop har row me stars print karta hai.
• Har next row me ek star kam ho jata hai.

Key Points
• First row me rows ke barabar stars hote hain.
• Last row me sirf 1 star hota hai.
• Har row me stars decrease hote hain.
• Ye nested loops ka basic pattern hai.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Inner Loop → Stars
• Every Next Row → One Less Star
*/