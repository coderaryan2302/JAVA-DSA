package arrays;

import java.util.Scanner;

public class secondSmallestElement {

    // Smallest element return karega
    static int firstSmallest(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // Second smallest element return karega
    static int secondSmallest(int[] arr) {

        int smallest = firstSmallest(arr);
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("At least 2 elements are required");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int secondSmallest = secondSmallest(arr);

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second Smallest Element Not Found");
        } else {
            System.out.println("Second Smallest Element = " + secondSmallest);
        }
    }
}

/*
Second Smallest Element

Definition
• Array ka second smallest unique element find karta hai.

Working
• Pehle smallest element find karo.
• Dobara array traverse karo.
• Smallest ko ignore karke sabse chhota element find karo.

Key Points
• Do traversals use hote hain.
• Duplicate smallest values ignore kiye jaate hain.
• Agar second smallest na mile to Integer.MAX_VALUE return hota hai.

Edge Cases
• Array me 2 se kam elements
• Sabhi elements same ho
• Negative numbers
• Duplicate smallest elements

Time Complexity : O(n)
(Two Traversals = O(2n) ≈ O(n))

Space Complexity : O(1)

Revision
• Find smallest
• Ignore smallest
• Find smallest among remaining elements
• Return second smallest
*/