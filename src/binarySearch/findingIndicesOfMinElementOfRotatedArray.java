package binarySearch;

import java.util.Scanner;

public class findingIndicesOfMinElementOfRotatedArray {

    // Minimum element aur uske sabhi indices print karega
    static void findIndicesOfMinElement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                end--;
            }
        }

        int minElement = arr[start];

        System.out.println("Minimum Element = " + minElement);

        System.out.print("Minimum Element Indices = ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minElement) {
                System.out.print(i + " ");
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

        System.out.println("Enter rotated sorted array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        findIndicesOfMinElement(arr);
    }
}

/*
Finding Indices of Minimum Element of Rotated Array

Definition
• Rotated Sorted Array me minimum element aur uske sabhi indices find karta hai.

Working
• Binary Search se minimum element ki position find karo.
• Duplicates ko handle karne ke liye end-- use karo.
• Minimum element milne ke baad poore array me uske sabhi indices print karo.

Key Points
• Array rotated aur sorted hona chahiye.
• Duplicate elements ko support karta hai.
• Binary Search minimum element find karti hai.
• Last traversal sabhi indices print karne ke liye hota hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Array not rotated
• Duplicate minimum elements
• All elements same

Time Complexity
• Average : O(log n)
• Worst Case (Duplicates) : O(n)

Space Complexity : O(1)

Revision
• arr[mid] > arr[end] → Search Right
• arr[mid] < arr[end] → Search Left
• arr[mid] == arr[end] → end--
• Print all indices of minimum element
*/