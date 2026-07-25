package patternPrinting;

import java.util.Scanner;

public class numericalRectangularOrSquare {

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

            // Print numbers from current row to last column
            for (int j = i; j <= columns; j++) {
                System.out.print(j);
            }

            // Print numbers from 1 to current row - 1
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

/*
Numerical Rectangle or Square Pattern

Definition
• Numerical Rectangle or Square Pattern me har row me numbers cyclic order me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Pehle current row number se last column tak numbers print hote hain.
• Fir 1 se current row - 1 tak numbers print hote hain.
• Isse har row me numbers left rotation ki tarah shift hote hain.

Key Points
• Rows = Horizontal lines
• Columns = Total numbers in each row
• rows == columns → Numerical Square
• rows != columns → Numerical Rectangle

Edge Cases
• Invalid input (rows <= 0 or columns <= 0)
• Single row
• Single column
• Large number of rows or columns

Time Complexity : O(rows × columns)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• First Loop → Current Row to Last Column
• Second Loop → 1 to Current Row - 1
• Numbers Shift Left in Every Row
*/