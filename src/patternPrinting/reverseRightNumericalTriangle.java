package patternPrinting;

import java.util.Scanner;

public class reverseRightNumericalTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows + 1 - i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

/*
Reverse Right Numerical Triangle Pattern

Definition
• Reverse Right Numerical Triangle Pattern me numbers decreasing rows ke saath print hote hain aur inverted right triangle ki shape banti hai.

Working
• Outer loop rows ko control karti hai.
• Inner loop har row me 1 se required number tak values print karta hai.
• Har next row me ek number kam print hota hai.

Key Points
• Numbers hamesha 1 se start hote hain.
• Har row me numbers increasing order me print hote hain.
• Har next row me ek number kam ho jata hai.
• Ye nested loops ka basic pattern hai.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Inner Loop → Numbers
• Every Next Row → One Less Number
*/