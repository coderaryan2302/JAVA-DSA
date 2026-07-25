package exceptionHandling;

public class basic {

    public static void main(String[] args) {

        System.out.println("Program Started.\n");

        // Example 1 : try-catch
        try {
            int number = 10 / 0;
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By Zero.");
        }

        System.out.println();

        // Example 2 : Multiple Catch
        try {
            String name = null;
            System.out.println(name.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception.");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception.");
        } catch (Exception e) {
            System.out.println("Some Other Exception.");
        }

        System.out.println();

        // Example 3 : finally
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index.");
        } finally {
            System.out.println("Finally Block Always Executes.");
        }

        System.out.println();

        // Example 4 : Nested try-catch
        try {

            try {
                int value = 20 / 0;
                System.out.println(value);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch Executed.");
            }

            String text = null;
            System.out.println(text.length());

        } catch (Exception e) {
            System.out.println("Outer Catch Executed.");
        }

        System.out.println("\nProgram Ended.");
    }
}

/*
Basic Exception Handling

Definition
• Exception = Runtime me aane wali unexpected error jo program ka normal flow rok deti hai.

Examples
• Divide by zero
• Null object
• Invalid array index

Why Use?
• Program crash hone se bachata hai.
• Runtime errors ko handle karta hai.
• Code ko reliable banata hai.

Keywords

try
• Risky code likhte hain.

catch
• Exception handle karta hai.

finally
• Exception aaye ya na aaye, hamesha execute hota hai.

Multiple Catch
• Ek try ke saath multiple catch ho sakte hain.
• Sirf matching catch execute hota hai.
• Hamesha specific exception pehle aur generic Exception last me likho.

Nested try-catch
• Ek try ke andar doosra try.
• Inner catch inner exception handle karta hai.
• Outer catch remaining exceptions handle karta hai.

Exception Hierarchy

Object
 └── Throwable
      ├── Error
      └── Exception
            ├── RuntimeException
            │     ├── ArithmeticException
            │     ├── NullPointerException
            │     ├── ArrayIndexOutOfBoundsException
            │     └── NumberFormatException
            └── Checked Exceptions
                  ├── IOException
                  └── FileNotFoundException

Common Runtime Exceptions

ArithmeticException
• Divide by zero.

NullPointerException
• Null object use karna.

ArrayIndexOutOfBoundsException
• Invalid array index.

NumberFormatException
• Invalid String to Number conversion.

InputMismatchException
• Wrong input type.

Advantages
• Program crash nahi hota.
• Debugging easy hoti hai.
• Reliable code banta hai.

Disadvantages
• Extra try-catch readability kam karte hain.
• Generic Exception ka unnecessary use avoid karo.

Applications
• File Handling
• Banking & ATM
• Login System
• Database Applications

Common Mistakes
• catch ko try se pehle likhna.
• Generic Exception ko specific exception se pehle likhna.
• Resource cleanup ke liye finally na use karna.

Time Complexity : O(1)
Space Complexity : O(1)

Interview Questions
• What is Exception?
• Error vs Exception?
• try, catch, finally difference?
• Can try exist without catch?
• Does finally always execute?
• What is Multiple Catch?
• What is Nested try-catch?
• Explain Exception Hierarchy.

Quick Revision

Exception → Unexpected runtime error
try → Risky code
catch → Handles exception
finally → Always executes
Multiple Catch → One try, many catches
Nested try → try inside another try

Runtime Exceptions
• ArithmeticException
• NullPointerException
• ArrayIndexOutOfBoundsException
• NumberFormatException
• InputMismatchException
*/