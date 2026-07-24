package bitManipulation;

import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number : ");
        int binaryNum = sc.nextInt();

        int decimal = 0;
        int power = 1; // 2^0

        while (binaryNum > 0) {

            int digit = binaryNum % 10;

            decimal += digit * power;

            binaryNum /= 10;
            power *= 2;
        }

        System.out.println("Decimal Number : " + decimal);
    }
}

/*

Binary To Decimal

Definition

• Binary (Base 2) number ko Decimal (Base 10) me convert karte hain.

Formula

• Decimal = Σ (Digit × 2^Position)

Approach

1. Last digit nikalo (% 10).
2. Digit × Current Power add karo.
3. Binary number ko /10 karo.
4. Power ko ×2 karo.
5. Repeat until number becomes 0.

Example

Binary = 1011

Calculation

1 × 2⁰ = 1

1 × 2¹ = 2

0 × 2² = 0

1 × 2³ = 8

Answer = 11

Time Complexity

• O(log n)

Space Complexity

• O(1)

Advantages

• Simple conversion method.
• Easy to implement.

Disadvantages

• Sirf valid binary numbers (0,1) ke liye.

Applications

• Number System Conversion
• Digital Electronics
• Computer Architecture
• Bit Manipulation

*/