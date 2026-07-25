package arrays;

import java.util.Scanner;

public class arraysFrequency {

    // Frequency array banana
    static int[] frequencyArray(int[] arr, int maxRange) {

        int[] frequency = new int[maxRange + 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= maxRange) {
                frequency[arr[i]]++;
            }
        }

        return frequency;
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

        System.out.print("Enter maximum element: ");
        int maxRange = sc.nextInt();

        if (maxRange < 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] frequency = frequencyArray(arr, maxRange);

        System.out.print("Enter number of queries: ");
        int queries = sc.nextInt();

        while (queries > 0) {

            System.out.print("Enter element to search: ");
            int search = sc.nextInt();

            if (search >= 0 && search <= maxRange) {
                System.out.println("Count = " + frequency[search]);
            } else {
                System.out.println("Count = 0");
            }

            queries--;
        }
    }
}

/*
Frequency Array

Definition
• Har element ka count store karta hai.

Working
• Element ki value ko index maana jata hai.
• Us index par us element ki frequency store hoti hai.

Key Points
• Sirf non-negative elements ke liye.
• Maximum element pehle pata hona chahiye.
• Searching O(1) me hoti hai.
• Frequency[index] = Element ka count.

Edge Cases
• Invalid array size
• Negative maxRange
• Search element range se bahar

Time Complexity
• Create : O(n)
• Query : O(1)

Space Complexity
• O(maxRange)

Revision
• Index = Element
• Value = Frequency
• Fast searching
• Extra space lagti hai
*/