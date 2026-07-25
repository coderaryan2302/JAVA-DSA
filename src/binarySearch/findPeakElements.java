package binarySearch;

import java.util.Scanner;

public class findPeakElements {

    // Peak element ka index return karega
    static int findPeak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
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

        int peakIndex = findPeak(arr);

        System.out.println("Peak Element = " + arr[peakIndex]);
        System.out.println("Peak Index = " + peakIndex);
    }
}

/*
Find Peak Element

Definition
• Peak Element wo element hota hai jo apne adjacent elements se bada hota hai.

Working
• Binary Search se middle element check karo.
• Agar arr[mid] < arr[mid + 1] ho to peak right side me hogi.
• Warna peak left side (including mid) me hogi.
• Jab start aur end same ho jaye, wahi peak index hota hai.

Key Points
• Binary Search use hoti hai.
• Kisi bhi ek peak ka index return hota hai.
• Increasing aur decreasing arrays dono ke liye kaam karta hai.
• Assumption : arr[i] != arr[i + 1]

Edge Cases
• Invalid input (size <= 0)
• Single element
• Strictly increasing array
• Strictly decreasing array
• Multiple peak elements

Time Complexity : O(log n)
Space Complexity : O(1)

Revision
• arr[mid] < arr[mid + 1] → Search Right
• Otherwise → Search Left (Including Mid)
• start == end → Peak Found
*/