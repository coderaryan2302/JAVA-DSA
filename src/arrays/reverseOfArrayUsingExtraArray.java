package arrays;

import java.util.Scanner;

public class reverseOfArrayUsingExtraArray {

    // Array ko reverse karke new array return karega
    static int[] reverseArray(int[] arr) {

        int[] reversedArray = new int[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[index] = arr[i];
            index++;
        }

        return reversedArray;
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

        int[] reversedArray = reverseArray(arr);

        System.out.println("Reversed Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}

/*
Reverse Array Using Extra Array

Definition
• Array ko reverse karke ek naye array me store karta hai.

Working
• Same size ka naya array banao.
• Original array ko last index se traverse karo.
• Elements ko naye array me start se store karo.
• New reversed array return karo.

Key Points
• Extra array use hota hai.
• Original array modify nahi hota.
• Logic simple aur beginner-friendly hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Duplicate elements
• Negative numbers

Time Complexity : O(n)
Space Complexity : O(n)

Revision
• Create new array
• Traverse from last index
• Store from index 0
• Return reversed array
*/