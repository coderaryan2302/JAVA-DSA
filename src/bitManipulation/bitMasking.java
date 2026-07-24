package bitManipulation;

public class bitMasking {

    // Create Bit Mask
    static int createMask(int position) {

        return 1 << position;
    }

    // Check ith Bit
    static void checkBit(int num, int position) {

        int mask = createMask(position);

        if ((num & mask) == 0)
            System.out.println("Bit is 0");
        else
            System.out.println("Bit is 1");
    }

    // Set ith Bit
    static int setBit(int num, int position) {

        return num | createMask(position);
    }

    // Clear ith Bit
    static int clearBit(int num, int position) {

        return num & ~createMask(position);
    }

    // Toggle ith Bit
    static int toggleBit(int num, int position) {

        return num ^ createMask(position);
    }

    public static void main(String[] args) {

        int num = 10; // 1010

        System.out.println("Original Number : " + num);

        checkBit(num, 1);

        System.out.println("Set Bit      : " + setBit(num, 0));
        System.out.println("Clear Bit    : " + clearBit(num, 1));
        System.out.println("Toggle Bit   : " + toggleBit(num, 3));
        System.out.println("Mask (Bit 2) : " + createMask(2));
    }
}

/*

Bit Masking

Definition

• Kisi specific bit ko access ya modify karne ke liye Bit Mask use kiya jata hai.

Bit Mask

Formula

• Mask = 1 << Position

Example

Position = 3

Mask = 00001000

Operations

• Create Mask
• Check Bit
• Set Bit
• Clear Bit
• Toggle Bit

Operators

• & → Check Bit
• | → Set Bit
• ~ → Clear Bit
• ^ → Toggle Bit

Logic

Check Bit

• num & mask
• Result 0 → Bit = 0
• Result ≠ 0 → Bit = 1

Set Bit

• num | mask
• Bit ko 1 bana deta hai.

Clear Bit

• num & (~mask)
• Bit ko 0 bana deta hai.

Toggle Bit

• num ^ mask
• 0 → 1
• 1 → 0

Time Complexity

• O(1)

Space Complexity

• O(1)

Advantages

• Bahut fast operations.
• Memory efficient.
• Specific bit ko directly access kar sakte hain.

Disadvantages

• Binary knowledge required.
• Wrong mask se incorrect result aa sakta hai.

Applications

• Permission System
• Flags
• Binary Operations
• Competitive Programming
• Interview Questions

*/