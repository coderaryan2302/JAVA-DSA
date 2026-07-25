package arrays;

import java.util.Scanner;

public class kRotationOfArrayWithoutExtraArray {

    // Array ke kisi part ko reverse karega
    static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Array ko Right Side me K times rotate karega
    static void rotateRight(int[] arr, int k) {

        int n = arr.length;

        k = ((k % n) + n) % n;      // Positive aur Negative K handle

        if (k == 0) {
            return;
        }

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
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

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        rotateRight(arr, k);

        System.out.println("Array after right rotation:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
K Rotation of Array (Without Extra Array)

Definition
• Array ko right side me K positions rotate karta hai bina extra array ke.

Working
• K % n nikalo.
• First part reverse karo.
• Second part reverse karo.
• Pura array reverse karo.

Key Points
• Reversal Algorithm use hota hai.
• In-place rotation hoti hai.
• Extra array use nahi hota.
• Positive aur Negative K handle hota hai.

Edge Cases
• Invalid input (size <= 0)
• K = 0
• K > array size
• Negative K
• Single element array

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• K = ((k % n) + n) % n
• Reverse first part
• Reverse second part
• Reverse complete array
• In-place rotation
*/