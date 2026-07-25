package arrays;

import java.util.Scanner;

public class kRotationOfArray {

    // Array ko Right Side me K times rotate karega
    static int[] rotateArray(int[] arr, int k) {

        int n = arr.length;

        if (k < 0) {
            k = k + n;                  // Negative rotation handle
        }

        k = k % n;                      // Extra rotations remove

        int[] ans = new int[n];
        int index = 0;

        // Last K elements copy
        for (int i = n - k; i < n; i++) {
            ans[index] = arr[i];
            index++;
        }

        // Remaining elements copy
        for (int i = 0; i < n - k; i++) {
            ans[index] = arr[i];
            index++;
        }

        return ans;
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

        int[] ans = rotateArray(arr, k);

        System.out.println("Array after right rotation:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

/*
K Rotation of Array (Using Extra Array)

Definition
• Array ko right side me K positions rotate karta hai.

Working
• K % n nikalo.
• Last K elements ko new array me copy karo.
• Fir remaining elements copy karo.

Key Points
• Right rotation hoti hai.
• Extra array use hota hai.
• K > n ho to K % n use karo.
• Negative K bhi handle kiya gaya hai.

Edge Cases
• Invalid input (size <= 0)
• K = 0
• K > array size
• Negative K
• Single element array

Time Complexity : O(n)
Space Complexity : O(n)

Revision
• K = K % n
• Copy last K elements
• Copy remaining elements
• Extra array use hota hai
*/