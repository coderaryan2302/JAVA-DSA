package arrays;

import java.util.Scanner;

public class noOfPairsForTargetSum {

    // Target sum ke pairs print karega aur count return karega
    static int findTargetPairs(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    count++;
                }
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

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println("Pairs having target sum:");

        int count = findTargetPairs(arr, target);

        System.out.println("Total Number of Pairs = " + count);
    }
}

/*
Number of Pairs for Target Sum

Definition
• Array me un sabhi pairs ko find karta hai jinka sum target ke barabar ho.

Working
• Nested loops se har possible pair check karo.
• Agar pair ka sum target ke barabar ho to pair print karo.
• Count badhao aur end me return karo.

Key Points
• Brute Force approach use hoti hai.
• Har pair sirf ek baar check hota hai.
• Second loop i + 1 se start hota hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• No valid pair
• Duplicate elements
• Negative numbers

Time Complexity : O(n²)
Space Complexity : O(1)

Revision
• Nested loops
• Check every pair
• Sum == target → Print pair
• Count++
*/