package arrays;

import java.util.Scanner;

public class peakElement {

    // Array ke sabhi peak elements print karega
    static void findPeakElements(int[] arr) {

        int n = arr.length;
        boolean found = false;

        // Single element
        if (n == 1) {
            System.out.println("Peak Element = " + arr[0]);
            System.out.println("Peak Index = 0");
            return;
        }

        for (int i = 0; i < n; i++) {

            // First element
            if (i == 0) {

                if (arr[i] > arr[i + 1]) {
                    System.out.println("Peak Element = " + arr[i]);
                    System.out.println("Peak Index = " + i);
                    System.out.println();
                    found = true;
                }
            }

            // Last element
            else if (i == n - 1) {

                if (arr[i] > arr[i - 1]) {
                    System.out.println("Peak Element = " + arr[i]);
                    System.out.println("Peak Index = " + i);
                    System.out.println();
                    found = true;
                }
            }

            // Middle elements
            else {

                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.println("Peak Element = " + arr[i]);
                    System.out.println("Peak Index = " + i);
                    System.out.println();
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Peak Element Found");
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

        findPeakElements(arr);
    }
}

/*
Peak Element

Definition
• Peak Element wo element hota hai jo apne adjacent element(s) se bada hota hai.

Working
• Agar sirf ek element ho to wahi peak hai.
• First element ko second se compare karo.
• Middle elements ko dono neighbours se compare karo.
• Last element ko second last se compare karo.

Key Points
• Ek array me ek ya multiple peak elements ho sakte hain.
• First aur last element bhi peak ho sakte hain.
• Sabhi peak elements print kiye jaate hain.

Edge Cases
• Invalid input (size <= 0)
• Single element
• Strictly increasing array
• Strictly decreasing array
• Multiple peaks
• Duplicate values

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• First element check
• Middle elements check
• Last element check
• Greater than neighbour(s) = Peak
*/