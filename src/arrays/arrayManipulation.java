package arrays;

import java.util.Scanner;

public class arrayManipulation {

    static void arrayManipulated(int[] arr) {

        // Duplicate elements ko -1 banana
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        boolean found = false;

        // Unique elements print karna
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.println("Unique Element = " + arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No unique element found");
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

        arrayManipulated(arr);
    }
}

/*
Array Manipulation

Definition
• Duplicate elements ko -1 bana kar unique elements print karta hai.

Working
• Har element ko baaki elements se compare karta hai.
• Duplicate mile to dono ko -1 bana deta hai.
• Last me jo -1 nahi hote, wahi unique elements hote hain.

Key Points
• Nested loop use hota hai.
• Original array modify hota hai.
• -1 duplicate mark karne ke liye use hota hai.

Edge Cases
• Invalid input (size <= 0)
• Sab elements duplicate
• Koi duplicate na ho

Time Complexity : O(n²)
Space Complexity : O(1)

Revision
• Duplicate → -1
• Unique elements print
• Array modify hota hai
• Nested loop
*/