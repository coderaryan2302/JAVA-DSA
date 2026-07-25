package arrays;

import java.util.Scanner;

public class sortingOfSquareOfElements {

    // Array ke har element ka square nikalega
    static void square(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    // Square array ko ascending order me sort karega
    static void sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
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

        square(arr);

        System.out.println("Square of Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sortArray(arr);

        System.out.println("\nSorted Square Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Sorting of Square of Elements

Definition
• Array ke har element ka square nikal kar unhe ascending order me sort karta hai.

Working
• Sabhi elements ka square nikalo.
• Squared array ko ascending order me sort karo.
• Sorted square array print karo.

Key Points
• Pehle square calculate hota hai.
• Uske baad sorting hoti hai.
• Original array modify ho jata hai.
• Ye approach sorted aur unsorted dono arrays ke liye kaam karti hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Negative numbers
• Duplicate elements
• Already sorted array

Time Complexity
• Square Calculation : O(n)
• Sorting : O(n²)
• Overall : O(n²)

Space Complexity : O(1)

Revision
• Calculate square
• Sort squared array
• Print sorted square array
*/