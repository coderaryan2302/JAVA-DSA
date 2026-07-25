package patternPrinting;

import java.util.Scanner;

public class rectangleOrSquarePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
Rectangle or Square Pattern

Definition
• Rectangle ya Square Pattern me stars rows aur columns ke according print hote hain.

Working
• Outer loop rows ko control karti hai.
• Inner loop har row me columns ke according stars print karta hai.
• Agar rows aur columns barabar hon to Square banta hai.
• Agar rows aur columns alag hon to Rectangle banta hai.

Key Points
• Rows = Horizontal lines
• Columns = Vertical positions
• rows == columns → Square Pattern
• rows != columns → Rectangle Pattern

Edge Cases
• Invalid input (rows <= 0 or columns <= 0)
• Single row
• Single column
• Large number of rows or columns

Time Complexity : O(rows × columns)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Inner Loop → Columns
• Print "* "
• Rows == Columns → Square
• Rows != Columns → Rectangle
*/