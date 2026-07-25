package arrays;

import java.util.Scanner;

public class evenOddSorting {

    // Two elements ko swap karega
    static void swap(int[] arr, int left, int right) {

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // Even elements left aur Odd elements right me arrange karega
    static void evenOddSort(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (Math.abs(arr[left]) % 2 == 1 && Math.abs(arr[right]) % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (Math.abs(arr[left]) % 2 == 0) {
                left++;
            }

            if (Math.abs(arr[right]) % 2 == 1) {
                right--;
            }
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

        evenOddSort(arr);

        System.out.println("Array after even odd sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Even Odd Sorting

Definition
• Even elements ko left aur Odd elements ko right side arrange karta hai.

Working
• Two Pointer technique use hoti hai.
• Left par Odd aur Right par Even mile to swap karo.
• Left Even ho to left++.
• Right Odd ho to right--.

Key Points
• In-place sorting hoti hai.
• Extra array nahi banta.
• Original order maintain nahi hota.
• Negative numbers ke liye Math.abs() use kiya hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• All Even
• All Odd
• Negative numbers

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• Two Pointer
• Left = Even
• Right = Odd
• Swap when needed
• In-place
*/