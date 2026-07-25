package arrays;

import java.util.Scanner;

public class prefixSumInTheSameArray {

    // Same array me prefix sum store karega
    static void calculatePrefixSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
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

        calculatePrefixSum(arr);

        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Prefix Sum in the Same Array

Definition
• Prefix Sum me har index par index 0 se us index tak ka sum store hota hai.

Working
• Index 1 se traversal start karo.
• Current element me previous prefix sum add karo.
• Result ko wahi same array me store karo.

Key Points
• In-place update hota hai.
• Extra array ki zarurat nahi hoti.
• Original array modify ho jata hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Negative numbers
• Zero values

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• Start from index 1
• arr[i] = arr[i - 1] + arr[i]
• Store in same array
• Original array changes
*/