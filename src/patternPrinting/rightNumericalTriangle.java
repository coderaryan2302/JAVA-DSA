package patternPrinting;

import java.util.Scanner;

public class rightNumericalTriangle {

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
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

/*
Right Numerical Triangle Pattern

Definition
• Right Numerical Triangle Pattern me har row me numbers increasing order me print hote hain aur right triangle ki shape banti hai.

Working
• Outer loop rows ko control karti hai.
• Inner loop 1 se current row number tak numbers print karta hai.
• Har next row me ek number aur add ho jata hai.

Key Points
• Numbers hamesha 1 se start hote hain.
• Har row me numbers increasing order me print hote hain.
• Last row me 1 se rows tak numbers print hote hain.
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
• Numbers Print → 1 to Current Row
*/