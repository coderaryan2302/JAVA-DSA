package arrays;

import java.util.Scanner;

public class secondLargestElement {

    // Largest element return karega
    static int firstLargest(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Second largest element return karega
    static int secondLargest(int[] arr) {

        int largest = firstLargest(arr);
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
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

        int secondLargest = secondLargest(arr);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest Element Not Found");
        } else {
            System.out.println("Second Largest Element = " + secondLargest);
        }
    }
}

/*
Second Largest Element

Definition
• Array ka second largest unique element find karta hai.

Working
• Pehle largest element find karo.
• Dobara array traverse karo.
• Largest ko ignore karke sabse bada element find karo.

Key Points
• Do traversals use hote hain.
• Duplicate largest values ignore kiye jaate hain.
• Agar second largest na mile to Integer.MIN_VALUE return hota hai.

Edge Cases
• Array me 2 se kam elements
• Sabhi elements same ho
• Negative numbers
• Duplicate largest elements

Time Complexity : O(n)
(Two Traversals = O(2n) ≈ O(n))

Space Complexity : O(1)

Revision
• Find largest
• Ignore largest
• Find largest among remaining elements
• Return second largest
*/