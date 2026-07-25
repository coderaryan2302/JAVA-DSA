package arrays;

import java.util.Scanner;

public class swappingOfArray {

    // Temporary variable ka use karke swapping karega
    static void swapUsingTemp(int a, int b) {

        System.out.println("\nBefore Swapping");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("a = " + a + ", b = " + b);
    }

    // Temporary variable ke bina swapping karega
    static void swapWithoutTemp(int a, int b) {

        System.out.println("\nBefore Swapping");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        swapUsingTemp(a, b);
        swapWithoutTemp(a, b);
    }
}

/*
Swapping of Variables

Definition
• Swapping ka matlab do variables ki values ko exchange karna hota hai.

Working
• Using Temp
  - Pehle value ko temp me store karo.
  - Dusri value ko pehle variable me rakho.
  - Temp ki value ko dusre variable me rakho.

• Without Temp
  - Addition aur subtraction ka use karke values exchange karo.
  - Temporary variable ki zarurat nahi hoti.

Key Points
• Temporary variable wala method sabse safe aur readable hai.
• Arithmetic method me integer overflow ho sakta hai.
• Dono methods ki Time aur Space Complexity same hoti hai.

Edge Cases
• Same values
• Zero
• Negative numbers
• Large values (Overflow possible in arithmetic method)

Time Complexity : O(1)
Space Complexity : O(1)

Revision
• Temp Method
  temp = a
  a = b
  b = temp

• Without Temp
  a = a + b
  b = a - b
  a = a - b
*/