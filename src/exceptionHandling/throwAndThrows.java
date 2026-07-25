package exceptionHandling;

public class throwAndThrows {

    // throws Example
    static void divide(int num1, int num2) throws ArithmeticException {

        if (num2 == 0) {
            throw new ArithmeticException("Cannot Divide By Zero.");
        }

        System.out.println("Result : " + (num1 / num2));
    }

    public static void main(String[] args) {

        System.out.println("Program Started.\n");

        // throw Example
        try {

            int age = 16;

            if (age < 18) {
                throw new IllegalArgumentException("Age Must Be 18 or Above.");
            }

            System.out.println("Eligible.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // throws Example
        try {

            divide(20, 4);
            divide(20, 0);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nProgram Ended.");
    }
}

/*
throw and throws

Definition

throw
• Exception ko manually throw (create) karta hai.

throws
• Method declare karta hai ki ye exception throw kar sakta hai.
• Exception handle nahi karta, sirf responsibility caller ko deta hai.

Syntax

throw
throw new ExceptionType("Message");

throws
returnType methodName() throws ExceptionType

Difference

throw
• Method body ke andar use hota hai.
• Ek time par ek exception throw karta hai.
• Exception object create karta hai.

throws
• Method declaration ke saath use hota hai.
• Multiple exceptions declare kar sakta hai.
• Exception handling caller par chhod deta hai.

Working

throw
• Condition fail → Exception throw → catch handle karega.

throws
• Method exception declare karega.
• Calling method usse handle karega.

Advantages
• Custom validation easy hoti hai.
• Code clean rehta hai.
• Better exception handling.

Applications
• Age Validation
• Login Validation
• Banking System
• File Handling

Common Mistakes
• throw aur throws ko confuse karna.
• throw ke saath exception object na banana.
• Sochna ki throws exception ko automatically handle karta hai.

Time Complexity : O(1)
Space Complexity : O(1)

Interview Questions
• What is throw?
• What is throws?
• Difference between throw and throws?
• Can throw be used for checked & unchecked exceptions?
• Does throws handle the exception?

Quick Revision

throw
• Manual exception
• Method body
• Creates & throws exception

throws
• Method declaration
• Declares possible exception
• Responsibility caller ko deta hai
*/