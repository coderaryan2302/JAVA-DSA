package binarySearch;

import java.util.Scanner;

public class targetFindingByRecursion {

    // Target element ka index return karega
    static int binarySearch(int[] arr, int target, int start, int end) {

        // Base Case
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        } else {
            return binarySearch(arr, target, start, mid - 1);
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

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int index = binarySearch(arr, target, 0, arr.length - 1);

        if (index == -1) {
            System.out.println("Target Not Found");
        } else {
            System.out.println("Target Found At Index = " + index);
        }
    }
}

/*
Binary Search Using Recursion

Definition
• Binary Search ka recursive version jo sorted array me target element ka index find karta hai.

Working
• Middle element find karo.
• Agar target mil jaye to index return karo.
• Agar target bada ho to right half me recursive call karo.
• Agar target chhota ho to left half me recursive call karo.
• Jab start > end ho jaye to target present nahi hai.

Key Points
• Array ascending order me sorted hona chahiye.
• Binary Search recursion ke through implement ki gayi hai.
• Har recursive call search space ko aadha kar deti hai.
• Safe mid calculation:
  start + (end - start) / 2

Edge Cases
• Invalid input (size <= 0)
• Single element array
• Target first index par ho
• Target last index par ho
• Target present na ho

Time Complexity : O(log n)
Space Complexity : O(log n)

Revision
• Base Case → start > end
• arr[mid] == Target → Return Index
• arr[mid] < Target → Search Right
• arr[mid] > Target → Search Left
• Use: start + (end - start) / 2
*/