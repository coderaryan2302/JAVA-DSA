package arrays;

import java.util.Scanner;

public class sortingOfArrayWithoutInbuiltFunction {

    // Array ko ascending order me sort karega
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

        sortArray(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Sorting of Array Without Inbuilt Function

Definition
• Array ko ascending order me sort karta hai bina Arrays.sort() use kiye.

Working
• Har element ko baaki elements se compare karo.
• Agar chhota element mile to swap karo.
• Ye process repeat karte raho jab tak array sort na ho jaye.

Key Points
• Nested loops use hote hain.
• Swapping ki madad se sorting hoti hai.
• Original array modify ho jata hai.
• Ye Selection Sort jaisa approach follow karta hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Duplicate elements
• Negative numbers
• Already sorted array

Time Complexity : O(n²)
Space Complexity : O(1)

Revision
• Compare elements
• Swap if required
• Repeat for all elements
• Original array becomes sorted
*/