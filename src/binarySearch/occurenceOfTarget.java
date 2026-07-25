package binarySearch;

import java.util.Scanner;

public class occurenceOfTarget {

    // First occurrence ka index return karega
    static int firstOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                answer = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }

    // Last occurrence ka index return karega
    static int lastOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                answer = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
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

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        int totalOccurrence;

        if (first == -1) {
            totalOccurrence = 0;
        } else {
            totalOccurrence = last - first + 1;
        }

        System.out.println("First Occurrence Index = " + first);
        System.out.println("Last Occurrence Index = " + last);
        System.out.println("Total Occurrences = " + totalOccurrence);
    }
}

/*
Occurrence of Target

Definition
• Sorted array me target element ki first occurrence, last occurrence aur total occurrences find karta hai.

Working
• First Occurrence ke liye Binary Search me target milne par left side search continue karte hain.
• Last Occurrence ke liye Binary Search me target milne par right side search continue karte hain.
• Total Occurrences = Last Occurrence - First Occurrence + 1

Key Points
• Array ascending order me sorted hona chahiye.
• Binary Search do baar use hoti hai.
• Target na mile to first aur last dono -1 hote hain.
• Total occurrences 0 hoti hain agar target present na ho.

Edge Cases
• Invalid input (size <= 0)
• Single element array
• Target present nahi hai
• Sabhi elements same hain
• Target sirf ek baar present hai

Time Complexity : O(log n)
Space Complexity : O(1)

Revision
• First Occurrence → Target mile to Left Search
• Last Occurrence → Target mile to Right Search
• Total Occurrences = Last - First + 1
*/