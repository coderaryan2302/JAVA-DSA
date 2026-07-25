package arrays;

import java.util.Scanner;

public class suffixSumInSameArray {

    // Same array me suffix sum banayega
    static void suffixSum(int[] arr) {

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
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

        suffixSum(arr);

        System.out.println("Suffix Sum Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Suffix Sum in the Same Array

Definition
• Suffix Sum Array me har index par us element aur uske right side ke sabhi elements ka sum store hota hai.

Working
• Second last index se traversal start karo.
• Current element me next element ka suffix sum add karo.
• Result ko same index par store karo.
• Index 0 tak repeat karo.

Key Points
• Right to Left traversal hota hai.
• Extra array ki zarurat nahi hoti.
• Original array modify ho jata hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Negative numbers
• Duplicate elements

Time Complexity : O(n)
Space Complexity : O(1)

Comparison
• Prefix Sum : Left → Right
• Suffix Sum : Right → Left

Revision
• Start from second last index
• Add next suffix sum
• Store in same array
• Repeat till index 0
*/