package patternPrinting;

import java.util.Scanner;

public class numberRepeatingFromRectangleOrSquare {

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

                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            }

            System.out.println();
        }
    }
}

/*
Number Repeating Rectangle or Square Pattern

Definition
• Is pattern me 1 aur 2 alternate order me rectangle ya square ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Inner loop columns ko control karti hai.
• Agar (Row + Column) even ho to 1 print hota hai.
• Agar (Row + Column) odd ho to 2 print hota hai.

Key Points
• (Row + Column) % 2 == 0 → Print 1
• (Row + Column) % 2 != 0 → Print 2
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
• Even Position → 1
• Odd Position → 2
*/