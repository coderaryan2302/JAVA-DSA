package binarySearch;

import java.util.Scanner;

public class targetFindingInRotatedArray {

    // Target ke sabhi indices print karega
    static void findTarget(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {

                System.out.print("Target Indices = ");

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == target) {
                        System.out.print(i + " ");
                    }
                }
                return;
            }

            // Duplicate elements
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }

            // Left half is sorted
            else if (arr[start] <= arr[mid]) {

                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Right half is sorted
            else {

                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        System.out.println("Target Not Found");
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

        System.out.println("Enter rotated sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        findTarget(arr, target);
    }
}

/*
Target Finding in Rotated Sorted Array

Definition
• Rotated sorted array me Binary Search ki help se target element find karta hai.

Working
• Middle element check karo.
• Agar target mil jaye to uske sabhi indices print karo.
• Pehle identify karo ki kaunsa half sorted hai.
• Agar target sorted half ke range me ho to usi half me search karo.
• Warna dusre half me search karo.
• Duplicate case me start++ aur end-- karke search continue karo.

Key Points
• Array rotated aur sorted hona chahiye.
• Duplicate elements ko support karta hai.
• Binary Search se search space continuously reduce hoti hai.
• Target milne ke baad sabhi indices print kiye jate hain.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Array not rotated
• Duplicate elements
• Target present nahi hai

Time Complexity
• Average : O(log n)
• Worst Case (Duplicates) : O(n)

Space Complexity : O(1)

Revision
• arr[mid] == Target → Print All Indices
• Left Half Sorted → Check Range
• Right Half Sorted → Check Range
• arr[start] == arr[mid] == arr[end] → start++, end--
*/