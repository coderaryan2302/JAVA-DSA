package patternPrinting;

import java.util.Scanner;

public class hollowRectangleOrSquare {

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

                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

/*
Hollow Rectangle or Square Pattern

Definition
• Hollow Rectangle or Square Pattern me sirf boundary par stars print hote hain aur andar ka area khali (spaces) rehta hai.

Working
• Outer loop rows ko control karti hai.
• Inner loop columns ko control karti hai.
• Agar current position first row, last row, first column ya last column par ho to star (*) print hota hai.
• Baaki sab positions par space print hoti hai.

Key Points
• First Row → Complete Stars
• Last Row → Complete Stars
• First Column → Star
• Last Column → Star
• Inside Area → Spaces
• rows == columns → Hollow Square
• rows != columns → Hollow Rectangle

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
• Boundary → *
• Inside → Space
*/