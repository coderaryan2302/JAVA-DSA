package arrays;

import java.util.Scanner;

public class firstAndLastRepeatedElement {

    // First repeated value
    static int firstRepeated(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    // Last repeated value
    static int lastRepeated(int[] arr) {

        int lastValue = -1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    lastValue = arr[i];
                }
            }
        }

        return lastValue;
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

        int first = firstRepeated(arr);
        int last = lastRepeated(arr);

        if (first == -1) {
            System.out.println("First Repeated Value : Not Found");
        } else {
            System.out.println("First Repeated Value : " + first);
        }

        if (last == -1) {
            System.out.println("Last Repeated Value : Not Found");
        } else {
            System.out.println("Last Repeated Value : " + last);
        }
    }
}

/*
First And Last Repeated Element

Definition
• Array ka first aur last repeated value find karta hai.

Working
• First Repeated:
  Pehla duplicate milte hi return kar deta hai.
• Last Repeated:
  Pura array traverse karke last duplicate store karta hai.

Key Points
• Nested loop use hota hai.
• Duplicate na mile to -1 return hota hai.
• Brute Force approach hai.

Edge Cases
• Invalid input (size <= 0)
• Single element
• No duplicate
• Negative numbers

Time Complexity : O(n²)
Space Complexity : O(1)

Revision
• Nested loop
• First duplicate → Return
• Last duplicate → Update answer
• Not found → -1
*/