package arrays;

import java.util.Scanner;

public class suffixSumWithoutSameArray {

    // Extra array me suffix sum banayega
    static int[] makeSuffixSum(int[] arr) {

        int[] suffixSum = new int[arr.length];

        suffixSum[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            suffixSum[i] = arr[i] + suffixSum[i + 1];
        }

        return suffixSum;
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

        int[] suffixSum = makeSuffixSum(arr);

        System.out.println("Suffix Sum Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(suffixSum[i] + " ");
        }
    }
}

/*
Suffix Sum Using Extra Array

Definition
• Suffix Sum Array me har index par us element aur uske right side ke sabhi elements ka sum ek naye array me store hota hai.

Working
• Same size ka naya array banao.
• Last element ko copy karo.
• Right to Left traversal karo.
• Current element me next suffix sum add karke naye array me store karo.

Key Points
• Extra array use hota hai.
• Original array modify nahi hota.
• Right to Left traversal hota hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Negative numbers
• Duplicate elements

Time Complexity : O(n)
Space Complexity : O(n)

Comparison
• Same Array : O(1) Space, Original array modified
• Extra Array : O(n) Space, Original array unchanged

Revision
• Create new array
• Copy last element
• Traverse Right to Left
• Store suffix sums
*/