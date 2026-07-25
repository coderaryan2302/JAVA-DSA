package patternPrinting;

import java.util.Scanner;

public class numberStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Pattern 1
        System.out.println("Pattern 1");

        for (int i = 1; i <= rows; i++) {

            System.out.print(i);

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // Pattern 2
        System.out.println("Pattern 2");

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.print("*");

            System.out.println();
        }
    }
}

/*
Number Star Pattern

Definition
• Number Star Pattern me numbers aur star (*) ko different combinations me print kiya jata hai.

Working

Pattern 1
• Har row ki shuruaat current row number se hoti hai.
• Uske baad (Row Number - 1) stars print hote hain.

Pattern 2
• Har row me 1 se current row tak numbers print hote hain.
• Numbers ke baad ek star (*) print hota hai.

Key Points
• Pattern 1 me numbers fix aur stars increase hote hain.
• Pattern 2 me numbers increase hote hain aur har row ke end me ek star hota hai.
• Dono patterns nested loops ka use karte hain.

Edge Cases
• Invalid input (rows <= 0)
• One row
• Large number of rows

Time Complexity : O(rows²)
Space Complexity : O(1)

Revision
• Pattern 1 → Row Number + Stars
• Pattern 2 → Increasing Numbers + Star
• Outer Loop → Rows
• Inner Loop → Numbers or Stars
*/