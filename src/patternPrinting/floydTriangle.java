package patternPrinting;

import java.util.Scanner;

public class floydTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int number = 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }
}

/*
Floyd's Triangle Pattern

Definition
• Floyd's Triangle ek numerical triangle pattern hai jisme natural numbers continuously increasing order me print hote hain.

Working
• Outer loop rows ko control karti hai.
• Inner loop har row me current row ke barabar numbers print karti hai.
• Har number print hone ke baad value 1 se increase ho jati hai.
• Numbers bina repeat hue continuously print hote hain.

Key Points
• Number 1 se start hota hai.
• Har next number previous number se 1 bada hota hai.
• Har row me row number ke barabar elements hote hain.
• Last printed number = rows × (rows + 1) / 2

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)

Space Complexity : O(1)

Revision
• Outer Loop → Rows
• Inner Loop → Numbers in Each Row
• Number Starts from 1
• Print Number and Increase by 1
• Shape = Floyd's Triangle
*/