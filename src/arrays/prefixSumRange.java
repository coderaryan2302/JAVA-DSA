package arrays;

import java.util.Scanner;

public class prefixSumRange {

    // Same array me prefix sum store karega
    static void makePrefixSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
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

        makePrefixSum(arr);

        System.out.print("Enter number of queries: ");
        int queries = sc.nextInt();

        if (queries < 0) {
            System.out.println("Invalid input");
            return;
        }

        while (queries-- > 0) {

            System.out.print("Enter starting index: ");
            int left = sc.nextInt();

            System.out.print("Enter ending index: ");
            int right = sc.nextInt();

            if (left < 0 || right < 0 || left >= size || right >= size || left > right) {
                System.out.println("Invalid range");
                continue;
            }

            int rangeSum;

            if (left == 0) {
                rangeSum = arr[right];
            } else {
                rangeSum = arr[right] - arr[left - 1];
            }

            System.out.println("Range Sum = " + rangeSum);
        }
    }
}

/*
Prefix Sum Range Query

Definition
• Prefix Sum ki help se kisi bhi range (L se R) ka sum O(1) time me find kar sakte hain.

Working
• Pehle same array me prefix sum banao.
• Agar L = 0 ho to answer = Prefix[R].
• Warna answer = Prefix[R] - Prefix[L - 1].

Key Points
• Prefix Sum sirf ek baar banta hai.
• Har query O(1) time me solve hoti hai.
• Original array modify ho jata hai.

Formula
• L = 0  →  Sum = Prefix[R]
• L > 0  →  Sum = Prefix[R] - Prefix[L - 1]

Edge Cases
• Invalid input (size <= 0)
• Single element
• L = 0
• L = R
• Invalid range
• Negative numbers

Time Complexity : O(n + q)
• Prefix Sum : O(n)
• Each Query : O(1)

Space Complexity : O(1)

Revision
• Build Prefix Sum
• Prefix[i] += Prefix[i - 1]
• L = 0 → Prefix[R]
• Else → Prefix[R] - Prefix[L - 1]
*/