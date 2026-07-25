package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkedVsUnchecked {

    // Checked Exception
    static void readFile() {

        try {
            File file = new File("demo.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }
    }

    // Unchecked Exception
    static void divide(int num1, int num2) {

        try {
            System.out.println("Result : " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By Zero.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Program Started.\n");

        readFile();      // Checked Exception
        System.out.println();

        divide(20, 0);   // Unchecked Exception

        System.out.println("\nProgram Ended.");
    }
}

/*
Checked vs Unchecked Exception

Checked Exception
• Compile time par compiler check karta hai.
• Handle karna mandatory hai (try-catch ya throws).
• Mostly external resources (File, Database, Network) se related.

Examples
• IOException
• FileNotFoundException
• SQLException
• ClassNotFoundException

Unchecked Exception
• Runtime par aata hai.
• Compiler check nahi karta.
• Handle karna optional hai.

Examples
• ArithmeticException
• NullPointerException
• ArrayIndexOutOfBoundsException
• NumberFormatException
• InputMismatchException

Difference

Checked Exception
• Compile Time
• Compiler checks
• Must handle

Unchecked Exception
• Runtime
• Compiler doesn't check
• Handling optional

Advantages
• Runtime errors ko safely handle karta hai.
• Program crash hone se bachata hai.
• Code reliable banta hai.

Applications
• File Handling
• Database Applications
• Banking System
• Login System

Common Mistakes
• Checked aur Unchecked ko confuse karna.
• Checked Exception ko handle na karna.
• Runtime Exception ko compile-time exception samajhna.

Time Complexity : O(1)
Space Complexity : O(1)

Interview Questions
• What is Checked Exception?
• What is Unchecked Exception?
• Difference between them?
• Which exception is checked by compiler?
• Is Runtime Exception mandatory to handle?

Quick Revision

Checked Exception
• Compile Time
• Compiler checks
• Must handle

Unchecked Exception
• Runtime
• Compiler doesn't check
• Handling optional
*/