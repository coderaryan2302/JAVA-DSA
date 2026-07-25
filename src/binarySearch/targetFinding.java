package binarySearch;

import java.util.Scanner;

public class targetFinding {

    // Target element ka index return karega
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
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

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Target Not Found");
        } else {
            System.out.println("Target Found At Index = " + index);
        }
    }
}

/*
Binary Search

Definition
• Binary Search ek searching algorithm hai jo sorted array me target element ko efficiently find karti hai.

Working
• Middle element find karo.
• Agar middle element target ho to index return karo.
• Agar target bada ho to right half search karo.
• Agar target chhota ho to left half search karo.
• Ye process tab tak repeat hota hai jab tak target mil na jaye ya search space khatam na ho.

Key Points
• Array ascending order me sorted hona chahiye.
• Binary Search har iteration me search space ko aadha kar deti hai.
• Safe mid calculation:
  start + (end - start) / 2
• Unsorted ya descending array ke liye ye code kaam nahi karega.

Edge Cases
• Invalid input (size <= 0)
• Single element array
• Target first index par ho
• Target last index par ho
• Target present na ho

Time Complexity : O(log n)
Space Complexity : O(1)

Revision
• arr[mid] == Target → Return Index
• arr[mid] < Target → Search Right
• arr[mid] > Target → Search Left
• Use: start + (end - start) / 2
*/