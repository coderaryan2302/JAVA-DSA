package arrays;

import java.util.Scanner;

public class lastOccurrenceOfRepeatedElements {

    // Element ka last occurrence index return karega
    static int findLastOccurrence(int[] arr, int x) {

        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }

        return lastIndex;
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

        System.out.print("Enter element: ");
        int x = sc.nextInt();

        int index = findLastOccurrence(arr, x);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Last Occurrence Index = " + index);
        }
    }
}

/*
Last Occurrence of an Element

Definition
• Array me kisi element ka last index find karta hai.

Working
• Pura array traverse karo.
• Jab bhi element mile, lastIndex update karo.
• End me lastIndex return karo.

Key Points
• Linear Search use hoti hai.
• Element na mile to -1 return hota hai.
• Loop break nahi hota, kyunki last occurrence chahiye.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Element present na ho
• Duplicate elements
• Negative numbers

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• lastIndex = -1
• Traverse complete array
• Match → Update lastIndex
• Return lastIndex
*/