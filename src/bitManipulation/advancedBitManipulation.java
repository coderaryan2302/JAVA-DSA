package bitManipulation;

public class advancedBitManipulation {

    // Count Set Bits
    static int countSetBits(int num) {

        int count = 0;

        while (num > 0) {

            if ((num & 1) == 1)
                count++;

            num >>= 1;
        }

        return count;
    }

    // Power Of Two
    static boolean isPowerOfTwo(int num) {

        return num > 0 && (num & (num - 1)) == 0;
    }

    // Power Of Four
    static boolean isPowerOfFour(int num) {

        if (num <= 0) return false;

        while (num % 4 == 0)
            num /= 4;

        return num == 1;
    }

    // Print All Subsets Using Bits
    static void printSubsets(int[] arr) {

        int totalSubsets = 1 << arr.length;

        for (int mask = 0; mask < totalSubsets; mask++) {

            System.out.print("{ ");

            for (int i = 0; i < arr.length; i++)
                if ((mask & (1 << i)) != 0)
                    System.out.print(arr[i] + " ");

            System.out.println("}");
        }
    }

    public static void main(String[] args) {

        int num = 16;

        System.out.println("Set Bits : " + countSetBits(13));
        System.out.println("Power Of Two : " + isPowerOfTwo(num));
        System.out.println("Power Of Four : " + isPowerOfFour(num));

        int[] arr = {1, 2, 3};

        System.out.println("\nSubsets:");
        printSubsets(arr);
    }
}

/*

Advanced Bit Manipulation

Definition

• Bitwise operators ka use karke optimized problems solve ki jati hain.
• Interview aur Competitive Programming me bahut useful hai.

Topics

• Count Set Bits
• Power Of Two
• Power Of Four
• Print Subsets Using Bits

Count Set Bits

• Binary me jitne 1 hote hain unki counting karta hai.

Logic

• Last bit check karo (num & 1).
• Right shift karke next bit par jao.

Power Of Two

Logic

• num > 0 && (num & (num - 1)) == 0

Reason

• Power of 2 me sirf ek hi set bit hota hai.

Power Of Four

Logic

• Number ko repeatedly 4 se divide karo.
• Agar last me 1 bache to Power of 4 hai.

Print Subsets

Logic

• Total Subsets = 2ⁿ
• Har mask ek subset represent karta hai.
• Set bit → Element include hoga.

Time Complexity

• Count Set Bits → O(log n)
• Power Of Two → O(1)
• Power Of Four → O(log₄ n)
• Print Subsets → O(n × 2ⁿ)

Space Complexity

• O(1)

Advantages

• Fast aur optimized.
• Memory efficient.
• Interview me bahut common.

Disadvantages

• Beginners ke liye thoda difficult.
• Binary concept clear hona chahiye.

Applications

• Bit Manipulation
• Competitive Programming
• Interview Questions
• Subset Generation

*/