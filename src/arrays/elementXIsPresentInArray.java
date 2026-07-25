package arrays;

import java.util.Scanner;

public class elementXIsPresentInArray {

    static void searchElement(int[] arr, int x) {

        boolean present = false;
        int firstIndex = -1;
        int secondIndex = -1;
        int lastIndex = -1;
        int count = 0;

        System.out.print("All Indexes : ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {

                present = true;
                count++;

                if (firstIndex == -1) {
                    firstIndex = i;
                }

                if (count == 2) {
                    secondIndex = i;
                }

                lastIndex = i;

                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Present      : " + present);
        System.out.println("First Index  : " + firstIndex);
        System.out.println("Last Index   : " + lastIndex);
        System.out.println("Second Index : " + secondIndex);
        System.out.println("Count        : " + count);
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

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        searchElement(arr, x);
    }
}

/*
Element Search in Array

Definition
• Array me element present hai ya nahi aur uski details find karta hai.

Working
• Pura array traverse karta hai.
• Element milne par first index, second index, last index aur count update karta hai.
• Sabhi indexes bhi print karta hai.

Key Points
• Present -> true/false
• First occurrence
• Second occurrence
• Last occurrence
• Total count
• All indexes print hote hain.

Edge Cases
• Invalid input (size <= 0)
• Element present na ho
• Sirf ek baar present ho
• Multiple occurrences

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• Traverse array
• First Index = First match
• Second Index = Second match
• Last Index = Last match
• Count = Total matches
*/