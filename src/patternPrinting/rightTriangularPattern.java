package patternPrinting;

import java.util.Scanner;

public class rightTriangularPattern {

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
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
Right Triangle Pattern

Definition
• Right Triangle Pattern me stars right triangle ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Inner loop har row me stars print karta hai.
• Har next row me ek star badh jata hai.

Key Points
• Har row me stars increase hote hain.
• First row me 1 star hota hai.
• Last row me rows ke barabar stars hote hain.
• Ye ek basic nested loop pattern hai.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Inner Loop → Stars
• Every Next Row → One More Star
*/