package exceptionHandling;

// Custom Exception Class
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class customException {

    public static void main(String[] args) {

        System.out.println("Program Started.\n");

        int age = 16;

        try {

            if (age < 18) {
                throw new InvalidAgeException("Age Must Be 18 or Above.");
            }

            System.out.println("Eligible.");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nProgram Ended.");
    }
}

/*
Custom Exception

Definition
• Custom (User-defined) Exception programmer khud banata hai.
• Application ki requirement ke according use hota hai.
• Exception class ko extend karke banaya jata hai.

Why Use?
• Meaningful error message deta hai.
• Code readable aur maintainable banta hai.
• Application-specific errors handle karta hai.

Syntax

class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}

Working
• Condition check karo.
• Agar condition fail ho to throw se Custom Exception throw karo.
• try-catch se usse handle karo.

Keywords
• extends Exception → Custom Exception banane ke liye.
• throw → Exception throw karne ke liye.
• try-catch → Exception handle karne ke liye.
• super(message) → Parent Exception class ko message pass karta hai.

Advantages
• Custom error messages.
• Easy debugging.
• Better code readability.
• Real-world validations ke liye useful.

Applications
• Age Validation
• Banking System
• Login System
• Online Registration
• Student Management System

Common Mistakes
• Exception class extend na karna.
• super(message) na likhna.
• Exception throw karke handle na karna.

Time Complexity : O(1)
Space Complexity : O(1)

Interview Questions
• What is Custom Exception?
• Why do we create Custom Exceptions?
• Which class is extended?
• Why is super(message) used?
• Difference between Built-in and Custom Exception?

Quick Revision

Custom Exception → User-defined Exception
Created By → extends Exception
Throw → throw
Handle → try-catch
Message → super(message)
Purpose → Application-specific errors
*/