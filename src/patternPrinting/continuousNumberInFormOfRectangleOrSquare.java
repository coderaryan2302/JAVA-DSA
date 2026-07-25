package patternPrinting;

import java.util.Scanner;

public class continuousNumberInFormOfRectangleOrSquare {

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
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

/*
Continuous Number in Rectangle or Square Pattern

Definition
• Is pattern me har row me 1 se columns tak numbers continuously repeat hote hain.

Working
• Outer loop rows ko control karti hai.
• Inner loop har row me 1 se columns tak numbers print karti hai.
• Har nayi row fir se 1 se start hoti hai.

Key Points
• Har row same numbers print karti hai.
• Numbers 1 se columns tak increasing order me hote hain.
• rows == columns → Number Square
• rows != columns → Number Rectangle

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
• Numbers Print → 1 to Columns
• Every Row Starts Again from 1
*/