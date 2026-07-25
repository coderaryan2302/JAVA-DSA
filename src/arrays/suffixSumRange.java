package arrays;

import java.util.Scanner;

public class suffixSumRange {

    // Same array me suffix sum banayega
    static int[] makeSuffixSum(int[] arr) {

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }

        return arr;
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

        int[] suffixSumArray = makeSuffixSum(arr);

        System.out.print("Enter number of queries: ");
        int queries = sc.nextInt();

        while (queries-- > 0) {

            System.out.print("Enter left index: ");
            int left = sc.nextInt();

            System.out.print("Enter right index: ");
            int right = sc.nextInt();

            if (left < 0 || right < 0 || left >= size || right >= size || left > right) {
                System.out.println("Invalid range");
                continue;
            }

            int sum;

            if (right == size - 1) {
                sum = suffixSumArray[left];
            } else {
                sum = suffixSumArray[left] - suffixSumArray[right + 1];
            }

            System.out.println("Range Sum = " + sum);
        }
    }
}

/*
Suffix Sum Range Query

Definition
• Suffix Sum Array ki madad se kisi bhi range ka sum O(1) time me find kiya jata hai.

Working
• Pehle suffix sum array banao.
• Left aur right index input lo.
• Agar right last index hai to answer suffix[left] hoga.
• Warna answer = suffix[left] - suffix[right + 1].

Formula
• If right == last index
  Range Sum = suffix[left]

• Otherwise
  Range Sum = suffix[left] - suffix[right + 1]

Key Points
• Suffix Sum Right to Left banta hai.
• Har query O(1) time me solve hoti hai.
• Original array modify ho jata hai.

Edge Cases
• Invalid input (size <= 0)
• Invalid indices
• Left > Right
• Right = Last Index
• Single element array

Time Complexity
• Build Suffix Sum : O(n)
• Each Query : O(1)
• Overall : O(n + q)

Space Complexity : O(1)

Revision
• Create suffix sum
• Read left and right
• Apply formula
• Print range sum
*/