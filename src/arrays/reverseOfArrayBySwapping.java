package arrays;

import java.util.Scanner;

public class reverseOfArrayBySwapping {

    // Same array ko reverse karega
    static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
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

        reverseArray(arr);

        System.out.println("Reversed Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Reverse Array Using Swapping

Definition
• Array ko first aur last element ko swap karke reverse karta hai.

Working
• Left pointer start se aur Right pointer end se start hota hai.
• Dono elements ko swap karo.
• Left ko aage aur Right ko piche move karo.
• Left < Right tak repeat karo.

Key Points
• Two Pointer technique use hoti hai.
• In-place reversal hota hai.
• Extra array ki zarurat nahi hoti.
• Original array modify ho jata hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Even size array
• Odd size array
• Duplicate elements
• Negative numbers

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• Left = 0
• Right = last index
• Swap elements
• Left++, Right--
• Repeat until Left < Right
*/