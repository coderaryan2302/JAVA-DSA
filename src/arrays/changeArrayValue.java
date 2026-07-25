package arrays;

import java.util.Scanner;

public class changeArrayValue {

    // Array ke sabhi elements ko 1 se replace karega
    static void changeValue(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
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

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        changeValue(arr);

        System.out.println("Array after changing values:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Change Array Value

Definition
• Array ke sabhi elements ko ek hi value (1) se replace karta hai.

Working
• Loop se har index par jaakar value ko 1 assign karta hai.

Key Points
• Array reference pass hota hai.
• Original array modify hota hai.
• Naya array create nahi hota.

Edge Cases
• Invalid input (size <= 0)

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• Array pass by reference
• Original array change hota hai
• Har element = 1
• Single loop use hota hai
*/