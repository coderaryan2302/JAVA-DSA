package bitManipulation;

public class XORproblems {

    // Swap Two Numbers
    static void swapNumbers(int a, int b) {

        System.out.println("Before Swap : " + a + " " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap  : " + a + " " + b);
    }

    // Find Single Number
    static int singleNumber(int[] arr) {

        int ans = 0;

        for (int num : arr)
            ans ^= num;

        return ans;
    }

    // Missing Number (0 to n)
    static int missingNumber(int[] arr) {

        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i <= arr.length; i++)
            xor1 ^= i;

        for (int num : arr)
            xor2 ^= num;

        return xor1 ^ xor2;
    }

    // XOR From 1 to N
    static int xorFrom1ToN(int n) {

        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;

        return 0;
    }

    // XOR in Range
    static int xorInRange(int left, int right) {

        return xorFrom1ToN(right) ^ xorFrom1ToN(left - 1);
    }

    public static void main(String[] args) {

        swapNumbers(10, 20);

        int[] arr1 = {2, 3, 5, 2, 3};
        System.out.println("Single Number : " + singleNumber(arr1));

        int[] arr2 = {3, 0, 1};
        System.out.println("Missing Number : " + missingNumber(arr2));

        System.out.println("XOR (1 to 5) : " + xorFrom1ToN(5));
        System.out.println("XOR (3 to 7) : " + xorInRange(3, 7));
    }
}

/*

XOR Problems

Definition

• XOR (^) ek bitwise operator hai jo different bits ke liye 1 aur same bits ke liye 0 return karta hai.

XOR Rules

• 0 ^ 0 = 0
• 1 ^ 1 = 0
• 0 ^ 1 = 1
• 1 ^ 0 = 1
• a ^ 0 = a
• a ^ a = 0

Properties

• Duplicate values cancel ho jati hain.
• XOR Commutative aur Associative hota hai.
• Order change hone par answer same rehta hai.

Swap Two Numbers

Logic

• Temporary variable ke bina XOR se swapping ki ja sakti hai.

Single Number

Logic

• Sabhi duplicate numbers cancel ho jate hain.
• Jo unique number hota hai wahi answer bachta hai.

Missing Number

Logic

• 0 se n tak ke sabhi numbers ka XOR nikalo.
• Array ke elements ka XOR nikalo.
• Dono ka XOR = Missing Number.

XOR From 1 To N

Pattern

• n % 4 == 0 → n
• n % 4 == 1 → 1
• n % 4 == 2 → n + 1
• n % 4 == 3 → 0

XOR In Range

Formula

• XOR(L...R) = XOR(1...R) ^ XOR(1...(L-1))

Time Complexity

• Swap Two Numbers → O(1)
• Single Number → O(n)
• Missing Number → O(n)
• XOR From 1 To N → O(1)
• XOR In Range → O(1)

Space Complexity

• O(1)

Advantages

• Fast and memory efficient.
• Temporary variable ki need nahi.
• Interview aur Competitive Programming me common.

Disadvantages

• XOR pattern yaad rakhna padta hai.
• Logic beginners ke liye thoda confusing ho sakta hai.

Applications

• Swap Numbers
• Find Unique Element
• Missing Number
• Range XOR Queries
• Competitive Programming

*/