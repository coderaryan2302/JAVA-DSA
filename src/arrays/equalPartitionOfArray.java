package arrays;

import java.util.Scanner;

public class equalPartitionOfArray {

    // Array ka total sum return karega
    static long findTotalSum(int[] arr) {

        long totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        return totalSum;
    }

    // Equal partition possible hai ya nahi
    static boolean equalPartition(int[] arr) {

        long totalSum = findTotalSum(arr);
        long prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];
            long suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;
            }
        }

        return false;
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

        System.out.println("Equal Partition = " + equalPartition(arr));
    }
}

/*
Equal Partition of Array

Definition
• Check karta hai ki array ko do parts me aise divide kar sakte hain ya nahi jinka sum equal ho.

Working
• Pehle total sum nikalo.
• Prefix Sum calculate karo.
• Suffix Sum = Total Sum - Prefix Sum.
• Agar Prefix Sum == Suffix Sum ho jaye to partition possible hai.

Key Points
• Prefix Sum = Left part ka sum
• Suffix Sum = Right part ka sum
• Prefix aur Suffix har index par check hote hain.
• Pehla matching point milte hi true return hota hai.

Edge Cases
• Invalid input (size <= 0)
• Single element array
• Negative numbers
• Large values

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• Total Sum nikalo
• Prefix Sum update karo
• Suffix = Total - Prefix
• Prefix == Suffix → true
• Nahi mila → false
*/