package arrays;

import java.util.Scanner;

public class checkArrayIsSorted {

    // Array sorted hai ya nahi check karega
    static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
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

        System.out.println("Array is sorted = " + isSorted(arr));
    }
}

/*
Check Array Is Sorted

Definition
• Check karta hai ki array ascending order me sorted hai ya nahi.

Working
• Index 1 se start karo.
• Current element ko previous se compare karo.
• Agar arr[i] < arr[i-1], to array sorted nahi hai.

Key Points
• Ascending order check hota hai.
• Duplicate elements allowed hain.
• Unsorted milte hi return false ho jata hai.

Edge Cases
• Invalid input (size <= 0)
• Single element array hamesha sorted hota hai.
• Duplicate aur negative elements bhi valid hain.

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• Start from index 1
• Compare arr[i] with arr[i-1]
• arr[i] < arr[i-1] → false
• Loop complete → true
*/