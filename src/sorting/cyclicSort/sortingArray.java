package sorting.cyclicSort;

import java.util.Scanner;

public class sortingArray {

    static void sorting(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        if (n <= 0) {

            System.out.println("Invalid Input");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter Elements (1 to " + n + ") :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sorting(arr);

        System.out.println("Ascending Order :");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Descending Order :");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

/*

Cyclic Sort

Definition

• Cyclic Sort ek Special Sorting Algorithm hai.
• Sirf un Arrays ke liye use hota hai jinke Elements
  1 to N (ya 0 to N-1) Range me hote hain.
• Har Element ko uske Correct Index par Place karta hai.

Concept Used

• Index Mapping
• Swapping
• In-Place Sorting

Main Formula

• Correct Index = arr[i] - 1

Main Logic

• Current Element ka Correct Index nikalo.
• Agar Element Correct Position par nahi hai to Swap karo.
• Agar Correct Position par hai to Next Index par jao.
• Ye Process tab tak chalta hai jab tak Array Sort na ho jaye.

Example

Input

3 5 2 1 4

Output

1 2 3 4 5

Time Complexity

• Best Case → O(n)
• Average Case → O(n)
• Worst Case → O(n)

Space Complexity

• O(1)

Advantages

• Linear Time Sorting
• Extra Space nahi lagta.
• In-Place Sorting
• Missing aur Duplicate Number Problems ke liye Best.

Disadvantages

• Sirf 1 to N (ya 0 to N-1) Range ke liye kaam karta hai.
• General Arrays ko Sort nahi kar sakta.
• Invalid Values ko Direct Handle nahi karta.

Applications

• Missing Number
• Find All Missing Numbers
• Find Duplicate Number
• Find All Duplicate Numbers
• Set Mismatch
• First Missing Positive

*/