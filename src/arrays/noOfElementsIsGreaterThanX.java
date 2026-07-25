package arrays;

import java.util.Scanner;

public class noOfElementsIsGreaterThanX {

    // X se bade elements ki count return karega
    static int countGreaterElements(int[] arr, int x) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
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

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        int count = countGreaterElements(arr, x);

        System.out.println("Number of elements greater than " + x + " = " + count);
    }
}

/*
Number of Elements Greater Than X

Definition
• Array me X se bade elements ki count find karta hai.

Working
• Pura array traverse karo.
• Agar arr[i] > x ho to count++ karo.
• End me count return karo.

Key Points
• Linear traversal use hota hai.
• Sirf X se bade elements count hote hain.
• X ke barabar elements count nahi hote.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Koi element X se bada na ho
• Sabhi elements X se bade ho
• Negative numbers

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• count = 0
• Traverse array
• arr[i] > x → count++
• Return count
*/