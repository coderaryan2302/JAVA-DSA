package arrays;

import java.util.Scanner;

public class maxAndMinValueOfArrayWithoutArraySorting {

    // Array ka maximum aur minimum find karega
    static void findMaxMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
        System.out.println("Minimum Element = " + min);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        findMaxMin(arr);
    }
}

/*
Maximum & Minimum Value of Array

Definition
• Array ka maximum aur minimum element bina sorting ke find karta hai.

Working
• First element ko max aur min maan lo.
• Index 1 se array traverse karo.
• Bada element mile to max update karo.
• Chhota element mile to min update karo.

Key Points
• Sirf ek traversal hota hai.
• Sorting ki zarurat nahi hoti.
• First element se initialization hoti hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Negative numbers
• Duplicate elements

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• max = arr[0]
• min = arr[0]
• Traverse once
• Update max & min
• No sorting
*/