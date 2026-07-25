package arrays;

import java.util.Scanner;

public class prefixSumWithoutSameArray {

    // Extra array me prefix sum store karega
    static int[] calculatePrefixSum(int[] arr) {

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
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

        int[] prefix = calculatePrefixSum(arr);

        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}

/*
Prefix Sum Using Extra Array

Definition
• Prefix Sum me har index par index 0 se us index tak ka sum ek alag array me store hota hai.

Working
• Extra prefix array banao.
• Prefix[0] = arr[0].
• Index 1 se traversal karo.
• Prefix[i] = Prefix[i - 1] + arr[i].

Key Points
• Original array modify nahi hota.
• Prefix Sum alag array me store hota hai.
• Range Sum Queries me useful hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Negative numbers
• Zero values

Time Complexity : O(n)
Space Complexity : O(n)

Revision
• Create prefix array
• Prefix[0] = arr[0]
• Prefix[i] = Prefix[i - 1] + arr[i]
• Original array remains unchanged
*/