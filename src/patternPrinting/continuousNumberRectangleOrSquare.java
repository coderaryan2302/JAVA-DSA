package patternPrinting;

import java.util.Scanner;

public class continuousNumberRectangleOrSquare {

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

        int number = 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= columns; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }
}

/*
Continuous Number Rectangle or Square Pattern

Definition
• Continuous Number Rectangle or Square Pattern me natural numbers continuously increasing order me rectangle ya square ki shape me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Inner loop columns ko control karti hai.
• Number 1 se start hota hai.
• Har number print hone ke baad value 1 se increase ho jati hai.
• Numbers bina repeat hue continuously print hote hain.

Key Points
• Number 1 se start hota hai.
• Har next number previous number se 1 bada hota hai.
• rows == columns → Continuous Number Square
• rows != columns → Continuous Number Rectangle

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
• Number Starts from 1
• Print Number and Increase by 1
• Continuous Increasing Numbers
*/