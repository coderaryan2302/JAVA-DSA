package arrays;

import java.util.Scanner;

public class rangeSum {

    // L se R tak ka sum return karega
    static int calculateRangeSum(int[] arr, int left, int right) {

        if (left < 0 || right < 0 || left >= arr.length || right >= arr.length || left > right) {
            return Integer.MIN_VALUE;
        }

        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }

        return sum;
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

            int sum = calculateRangeSum(arr, left, right);

            if (sum == Integer.MIN_VALUE) {
                System.out.println("Invalid range");
            } else {
                System.out.println("Range Sum = " + sum);
            }
        }
    }
}

/*
Range Sum (Without Prefix Sum)

Definition
• Array me L se R index tak ke elements ka sum normal traversal se find karta hai.

Working
• Range validate karo.
• L se R tak traverse karo.
• Har element ko sum me add karo.
• End me sum return karo.

Key Points
• Prefix Sum use nahi hota.
• Har query ke liye array dobara traverse hota hai.
• Multiple queries ke liye slow ho sakta hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Invalid range
• L = R
• Negative numbers

Time Complexity : O(r - l + 1)
Worst Case : O(n)

Space Complexity : O(1)

Revision
• Validate range
• Traverse L to R
• sum += arr[i]
• Return sum
*/