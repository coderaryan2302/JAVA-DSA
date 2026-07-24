package bitManipulation;

public class basic {

    public static void main(String[] args) {

        int a = 10;   // 1010
        int b = 6;    // 0110

        // AND
        System.out.println("a & b = " + (a & b));

        // OR
        System.out.println("a | b = " + (a | b));

        // XOR
        System.out.println("a ^ b = " + (a ^ b));

        // NOT
        System.out.println("~a = " + (~a));

        // Left Shift
        System.out.println("a << 1 = " + (a << 1));

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1));

        // Unsigned Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1));
    }
}

/*

Bit Manipulation

Definition

• Binary bits (0,1) par direct operations perform karna.
• Fast aur optimized programming technique hai.

Bit

• Bit = Binary Digit
• Sirf 0 ya 1 ho sakta hai.

Example

13 = 1101₂

Why Bit Manipulation?

• Fast execution
• O(1) operations
• Memory efficient
• Interview aur Competitive Programming me common

Bitwise Operators

• &  → AND
• |  → OR
• ^  → XOR
• ~  → NOT
• << → Left Shift
• >> → Right Shift
• >>> → Unsigned Right Shift

AND (&)

Rule

• 1 & 1 = 1
• Baaki sab = 0

Use

• Bit check ya clear karne ke liye.

OR (|)

Rule

• Koi bhi bit 1 ho to answer 1.

Use

• Bit set karne ke liye.

XOR (^)

Rule

• Same bits → 0
• Different bits → 1

Use

• Toggle bit
• Unique element find karna

NOT (~)

Logic

• Har bit ko reverse kar deta hai.
• Java me Two's Complement ki wajah se negative value mil sakti hai.

Left Shift (<<)

Logic

• Bits left move hote hain.

Formula

• n << k = n × 2ᵏ

Right Shift (>>)

Logic

• Bits right move hote hain.
• Sign bit preserve hota hai.

Formula

• n >> k = n / 2ᵏ (Integer Division)

Unsigned Right Shift (>>>)

Logic

• Bits right move hote hain.
• Left side hamesha 0 fill hoti hai.
• Mostly negative numbers ke saath use hota hai.

Time Complexity

• O(1)

Space Complexity

• O(1)

Advantages

• Fast execution.
• Memory efficient.
• Optimized algorithms.

Disadvantages

• Binary knowledge required.
• Beginners ke liye thoda difficult.
• Normal arithmetic se kam readable.

Applications

• Check Odd / Even
• Get / Set / Clear / Toggle Bit
• Count Set Bits
• Power of Two
• Single Number (XOR)
• Subset Generation
• Competitive Programming

*/