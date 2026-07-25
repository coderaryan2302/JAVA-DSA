package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class shallowAndDeepCopy {

    // Array print karega
    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Deep Copy
    static void deepCopy(int[] arr) {

        int[] arr2 = Arrays.copyOf(arr, arr.length);

        arr2[0] = 100;

        System.out.println("\nDeep Copy");

        System.out.println("arr == arr2 : " + (arr == arr2));

        System.out.print("Copied Array   : ");
        printArray(arr2);

        System.out.print("Original Array : ");
        printArray(arr);
    }

    // Shallow Copy
    static void shallowCopy(int[] arr) {

        int[] arr2 = arr;

        arr2[0] = 200;

        System.out.println("\nShallow Copy");

        System.out.println("arr == arr2 : " + (arr == arr2));

        System.out.print("Copied Array   : ");
        printArray(arr2);

        System.out.print("Original Array : ");
        printArray(arr);
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

        System.out.print("Original Array : ");
        printArray(arr);

        deepCopy(arr);
        shallowCopy(arr);
    }
}

/*
Shallow Copy & Deep Copy

Definition
• Copying ka matlab existing array se doosra reference ya naya array banana.

Shallow Copy
• Sirf reference copy hota hai.
• Naya array create nahi hota.
• Dono variables same array ko point karte hain.
• Ek array me change karne par doosra bhi change ho jata hai.

Deep Copy
• Naya array create hota hai.
• Sabhi elements naye array me copy hote hain.
• Dono arrays alag memory location par hote hain.
• Ek array me change karne se doosra change nahi hota.

Methods for Deep Copy
• Arrays.copyOf()
• clone()
• Manual copy using loop

Key Points
• Shallow Copy : arr2 = arr
• Deep Copy : Arrays.copyOf(arr, arr.length)
• arr == arr2 → true (Shallow Copy)
• arr == arr2 → false (Deep Copy)

Time Complexity
• Shallow Copy : O(1)
• Deep Copy : O(n)

Space Complexity
• Shallow Copy : O(1)
• Deep Copy : O(n)

Revision
• Shallow → Same Reference
• Deep → New Array
• Shallow → Original changes
• Deep → Original remains safe
*/