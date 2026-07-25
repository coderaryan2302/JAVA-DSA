package arrays;

import java.util.Scanner;

public class sumAndProductOfElements {

    // Array ka sum return karega
    static long findSum(int[] arr) {

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // Array ka product return karega
    static long findProduct(int[] arr) {

        long product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        return product;
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

        System.out.println("Sum of Elements = " + findSum(arr));
        System.out.println("Product of Elements = " + findProduct(arr));
    }
}

/*
Sum and Product of Elements

Definition
• Array ke sabhi elements ka sum aur product calculate karta hai.

Working
• Sum ke liye har element ko add karo.
• Product ke liye har element ko multiply karo.
• Final sum aur product return karo.

Key Points
• Sum ki initial value 0 hoti hai.
• Product ki initial value 1 hoti hai.
• Product ke liye long use kiya gaya hai taaki overflow ka chance kam ho.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Negative numbers
• Zero present
• Duplicate elements

Time Complexity
• Sum : O(n)
• Product : O(n)
• Overall : O(n)

Space Complexity : O(1)

Revision
• Sum starts with 0
• Product starts with 1
• Traverse entire array
• Return sum and product
*/