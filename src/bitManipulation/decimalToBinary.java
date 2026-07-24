package bitManipulation;

import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int decimalNum = sc.nextInt();

        int binary = 0;
        int power = 1; // 10^0

        while (decimalNum > 0) {

            int remainder = decimalNum % 2;

            binary += remainder * power;

            power *= 10;
            decimalNum /= 2;
        }

        System.out.println("Binary Number : " + binary);
    }
}

/*

Decimal To Binary

Definition

• Decimal (Base 10) number ko Binary (Base 2) me convert karte hain.

Approach

1. Number ko 2 se divide karo.
2. Remainder (0 ya 1) nikalo.
3. Remainder ko answer me add karo.
4. Power ko ×10 karo.
5. Number ko /2 karo.
6. Repeat until number becomes 0.

Example

Decimal = 13

Calculation

13 % 2 = 1

6 % 2 = 0

3 % 2 = 1

1 % 2 = 1

Binary = 1101

Time Complexity

• O(log n)

Space Complexity

• O(1)

Advantages

• Simple conversion method.
• Easy to understand.

Disadvantages

• Large binary numbers ke liye integer overflow ho sakta hai.
• Sirf integer input ke liye.

Applications

• Number System Conversion
• Digital Electronics
• Computer Architecture
• Bit Manipulation

*/