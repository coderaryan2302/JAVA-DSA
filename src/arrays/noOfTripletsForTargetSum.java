package arrays;

import java.util.Scanner;

public class noOfTripletsForTargetSum {

    // Target sum ke triplets print karega aur count return karega
    static int findTargetTriplets(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {

                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        count++;
                    }
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

        if (size < 3) {
            System.out.println("At least 3 elements are required");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println("Triplets having target sum:");

        int count = findTargetTriplets(arr, target);

        System.out.println("Total Number of Triplets = " + count);
    }
}

/*
Number of Triplets for Target Sum

Definition
• Array me un sabhi triplets ko find karta hai jinka sum target ke barabar ho.

Working
• Three nested loops se har possible triplet check karo.
• Agar triplet ka sum target ke barabar ho to triplet print karo.
• Count badhao aur end me return karo.

Key Points
• Brute Force approach use hoti hai.
• Har triplet sirf ek baar check hota hai.
• Second loop i + 1 aur third loop j + 1 se start hota hai.

Edge Cases
• Invalid input (size <= 0)
• Array me 3 se kam elements
• No valid triplet
• Duplicate elements
• Negative numbers

Time Complexity : O(n³)
Space Complexity : O(1)

Revision
• Three nested loops
• Check every triplet
• Sum == target → Print triplet
• Count++
*/