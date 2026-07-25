package binarySearch;

import java.util.Scanner;

public class squareRootOfNo {

    // Square root return karega (up to 5 decimal places)
    static double squareRoot(int number) {

        int start = 0;
        int end = number;
        int answer = 0;

        // Integer part using Binary Search
        while (start <= end) {

            int mid = start + (end - start) / 2;
            double square = (double) mid * mid;

            if (square == number) {
                return mid;
            } else if (square < number) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Decimal part
        double root = answer;
        double increment = 0.1;

        for (int i = 0; i < 5; i++) {

            while (root * root <= number) {
                root += increment;
            }

            root -= increment;
            increment /= 10;
        }

        return root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Square root is not defined for negative numbers.");
            return;
        }

        double root = squareRoot(number);

        System.out.println("Square Root = " + root);
    }
}

/*
Square Root of a Number

Definition
• Kisi number ka Square Root wo value hoti hai jiska square original number ke barabar ho.

Formula
• √x × √x = x

Working
• Binary Search se square root ka integer part find karo.
• Uske baad increment method se decimal part find karo.
• Har iteration me increment 10 times chhota kar diya jata hai.
• Yahan answer 5 decimal places tak calculate kiya gaya hai.

Key Points
• Binary Search integer part ke liye use hoti hai.
• Decimal part increment method se calculate hota hai.
• Sirf integer input ke liye kaam karta hai.
• Negative numbers ka real square root define nahi hota.

Edge Cases
• Negative number
• Zero
• Perfect square
• Non-perfect square
• Large numbers

Time Complexity : O(log n)
Space Complexity : O(1)

Revision
• mid² == Number → Answer Found
• mid² < Number → Search Right
• mid² > Number → Search Left
• After Binary Search → Find decimal part using increment method
*/