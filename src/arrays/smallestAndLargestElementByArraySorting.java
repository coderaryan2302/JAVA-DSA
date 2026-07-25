package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class smallestAndLargestElementByArraySorting {

    // Sorting karke smallest aur largest element print karega
    static void smallestAndLargest(int[] arr) {

        Arrays.sort(arr);

        System.out.println("Smallest Element = " + arr[0]);
        System.out.println("Largest Element = " + arr[arr.length - 1]);
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

        smallestAndLargest(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Smallest & Largest Element Using Array Sorting

Definition
• Array ko sort karke smallest aur largest element find karta hai.

Working
• Array ko ascending order me sort karo.
• First element smallest hota hai.
• Last element largest hota hai.

Key Points
• Arrays.sort() use hota hai.
• Original array modify ho jata hai.
• Agar sorted array bhi chahiye ho tab ye approach useful hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Duplicate elements
• Negative numbers

Time Complexity : O(n log n)
Space Complexity : O(1)

Comparison
• Sorting : O(n log n)
• Linear Traversal : O(n)
• Sirf smallest aur largest ke liye Linear Traversal better hai.

Revision
• Arrays.sort(arr)
• arr[0] = Smallest
• arr[last] = Largest
• Original array changes
*/