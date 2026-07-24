package bitManipulation;

public class bitOperation {

    // Check Odd or Even
    static void oddEven(int num) {

        if ((num & 1) == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    // Get Bit
    static void getBit(int num, int position) {

        int mask = 1 << position;

        if ((num & mask) == 0)
            System.out.println("Bit = 0");
        else
            System.out.println("Bit = 1");
    }

    // Set Bit
    static void setBit(int num, int position) {

        int result = num | (1 << position);

        System.out.println("After Set Bit : " + result);
    }

    // Clear Bit
    static void clearBit(int num, int position) {

        int result = num & ~(1 << position);

        System.out.println("After Clear Bit : " + result);
    }

    // Update Bit
    static void updateBit(int num, int position, int newBit) {

        num = num & ~(1 << position);                 // Clear Bit

        int result = num | (newBit << position);      // Set New Bit

        System.out.println("After Update Bit : " + result);
    }

    // Toggle Bit
    static void toggleBit(int num, int position) {

        int result = num ^ (1 << position);

        System.out.println("After Toggle Bit : " + result);
    }

    // Left Shift
    static void leftShift(int num, int shift) {

        System.out.println("Left Shift : " + (num << shift));
    }

    // Right Shift
    static void rightShift(int num, int shift) {

        System.out.println("Right Shift : " + (num >> shift));
    }

    // Unsigned Right Shift
    static void unsignedRightShift(int num, int shift) {

        System.out.println("Unsigned Right Shift : " + (num >>> shift));
    }

    public static void main(String[] args) {

        int num = 10; // 1010

        oddEven(num);
        getBit(num, 1);
        setBit(num, 0);
        clearBit(num, 1);
        updateBit(num, 2, 1);
        toggleBit(num, 3);
        leftShift(num, 2);
        rightShift(num, 1);
        unsignedRightShift(-10, 1);

        System.out.println("Binary : " + Integer.toBinaryString(num));
    }
}

/*

Bit Operations

Definition

• Bitwise operators ki help se kisi number ke individual bits ko read ya modify karte hain.

Operators

• &   → AND
• |   → OR
• ^   → XOR
• ~   → NOT
• <<  → Left Shift
• >>  → Right Shift
• >>> → Unsigned Right Shift

Operations

Odd / Even

• num & 1
• 0 → Even
• 1 → Odd

Get Bit

• num & (1 << position)
• Bit ki value check karta hai.

Set Bit

• num | (1 << position)
• Bit ko 1 bana deta hai.

Clear Bit

• num & ~(1 << position)
• Bit ko 0 bana deta hai.

Update Bit

1. Pehle bit clear karo.
2. Fir new bit set karo.

Toggle Bit

• num ^ (1 << position)
• 0 ↔ 1 change karta hai.

Left Shift

Formula

• n << k = n × 2ᵏ

Right Shift

Formula

• n >> k = n / 2ᵏ (Integer Division)

Unsigned Right Shift

• n >>> k
• Left side hamesha 0 fill hoti hai.
• Mostly negative numbers ke saath use hota hai.

Time Complexity

• O(1)

Space Complexity

• O(1)

Advantages

• Fast execution.
• Memory efficient.
• Interview aur Competitive Programming me common.

Disadvantages

• Binary knowledge required.
• Wrong bit position se incorrect output aa sakta hai.

Applications

• Bit Manipulation
• Flags
• Permissions
• Embedded Systems
• Competitive Programming

*/