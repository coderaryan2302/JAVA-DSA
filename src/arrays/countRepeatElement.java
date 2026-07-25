package arrays;

import java.util.Scanner;

public class countRepeatElement {

    // Array me x kitni baar aaya hai uska count return karega
    static int countElement(int[] arr, int x) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        return count;
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

        System.out.print("Enter element to count: ");
        int x = sc.nextInt();

        int count = countElement(arr, x);

        System.out.println("Count = " + count);
    }
}

/*
Count Repeated Element

Definition
• Array me kisi element ki total frequency (count) nikalta hai.

Working
• Pura array traverse karo.
• Agar arr[i] == x ho to count++ karo.
• End me count return karo.

Key Points
• Linear Search use hoti hai.
• Element na mile to count = 0.
• Duplicate elements ka total count milta hai.

Edge Cases
• Invalid input (size <= 0)
• Element present na ho
• Single element array
• Negative numbers bhi count ho sakte hain.

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• count = 0
• Traverse array
• Match → count++
• Return count
*/