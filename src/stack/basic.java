package stack;

import java.util.Scanner;
import java.util.Stack;

public class basic {

    // 1. Copy Stack
    public static Stack<Integer> copyStack(Stack<Integer> original) {

        Stack<Integer> temp = new Stack<>();
        Stack<Integer> copy = new Stack<>();

        while (!original.isEmpty()) {
            temp.push(original.pop());
        }

        while (!temp.isEmpty()) {
            int value = temp.pop();
            original.push(value);
            copy.push(value);
        }

        return copy;
    }

    // 2. Reverse Stack (Using Extra Stack)
    public static Stack<Integer> reverseStack(Stack<Integer> stack) {

        Stack<Integer> reverse = new Stack<>();

        while (!stack.isEmpty()) {
            reverse.push(stack.pop());
        }

        return reverse;
    }

    // 3. Insert At Bottom
    public static void insertAtBottom(Stack<Integer> stack, int value) {

        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        stack.push(value);

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    // 4. Insert At Index (Index Starts From Bottom)
    public static void insertAtIndex(Stack<Integer> stack, int index, int value) {

        if (index < 0 || index > stack.size()) {
            System.out.println("Invalid Index");
            return;
        }

        Stack<Integer> temp = new Stack<>();

        while (stack.size() > index) {
            temp.push(stack.pop());
        }

        stack.push(value);

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    // 5. Display Using Stack
    public static void displayUsingStack(Stack<Integer> stack) {

        Stack<Integer> temp = new Stack<>();

        System.out.print("Stack : ");

        while (!stack.isEmpty()) {

            int value = stack.pop();
            System.out.print(value + " ");

            temp.push(value);
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println();
    }

    // 6. Display Using Array
    public static void displayUsingArray(Stack<Integer> stack) {

        System.out.print("Stack : ");

        for (int value : stack) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    // 7. Display Using Recursion
    public static void displayUsingRecursion(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int value = stack.pop();

        displayUsingRecursion(stack);

        System.out.print(value + " ");

        stack.push(value);
    }

    // 8. Remove Bottom
    public static void removeBottom(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        Stack<Integer> temp = new Stack<>();

        while (stack.size() > 1) {
            temp.push(stack.pop());
        }

        stack.pop();

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    // 9. Remove At Index
    public static void removeAtIndex(Stack<Integer> stack, int index) {

        if (index < 0 || index >= stack.size()) {
            System.out.println("Invalid Index");
            return;
        }

        Stack<Integer> temp = new Stack<>();

        while (stack.size() - 1 > index) {
            temp.push(stack.pop());
        }

        stack.pop();

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    // 10. Push At Bottom (Recursion Helper)
    public static void pushAtBottom(Stack<Integer> stack, int value) {

        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        pushAtBottom(stack, value);

        stack.push(top);
    }

    // 11. Reverse Stack (Using Recursion)
    public static void reverseUsingRecursion(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverseUsingRecursion(stack);

        pushAtBottom(stack, top);
    }

    // 12. Underflow
    public static void underflowDemo() {

        Stack<Integer> stack = new Stack<>();

        if (stack.isEmpty()) {
            System.out.println("Underflow : Stack is Empty");
        }
    }

    // 13. Overflow
    public static void overflowDemo() {

        System.out.println("Overflow : Java Stack is Dynamic");
    }

    // 14. Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        // Basic Operations

        System.out.println("Is Empty : " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("\nStack : " + stack);
        System.out.println("Top : " + stack.peek());

        stack.pop();

        System.out.println("After Pop : " + stack);
        System.out.println("Size : " + stack.size());

        // User Input

        Stack<Integer> userStack = new Stack<>();

        System.out.print("\nEnter Number Of Elements : ");
        int n = sc.nextInt();

        System.out.print("Enter Elements : ");

        for (int i = 0; i < n; i++) {
            userStack.push(sc.nextInt());
        }

        System.out.println("User Stack : " + userStack);

        // Copy

        Stack<Integer> copy = copyStack(stack);
        System.out.println("\nCopied Stack : " + copy);

        // Reverse

        Stack<Integer> reverse = reverseStack(copyStack(stack));
        System.out.println("Reverse Stack : " + reverse);

        // Insert

        insertAtBottom(stack, 5);
        System.out.println("\nInsert Bottom : " + stack);

        insertAtIndex(stack, 2, 25);
        System.out.println("Insert Index : " + stack);

        // Display

        System.out.println("\nDisplay Using Stack :");
        displayUsingStack(stack);

        System.out.println("\nDisplay Using Array :");
        displayUsingArray(stack);

        System.out.println("\nDisplay Using Recursion :");
        displayUsingRecursion(stack);
        System.out.println();

        // Remove

        removeBottom(stack);
        System.out.println("Remove Bottom : " + stack);

        removeAtIndex(stack, 2);
        System.out.println("Remove Index : " + stack);

        // Reverse Using Recursion

        reverseUsingRecursion(stack);
        System.out.println("Reverse (Recursion) : " + stack);

        // Underflow & Overflow

        System.out.println();

        underflowDemo();
        overflowDemo();


    }
}

/*
Stack Basics

Definition

• Stack ek Linear Data Structure hai.
• LIFO (Last In First Out) Follow karta hai.
• Insertion aur Deletion sirf Top se hota hai.

Operations

• push()      → Insert
• pop()       → Remove Top
• peek()      → Top Element
• size()      → Total Elements
• isEmpty()   → Stack Empty ya nahi

Topics Covered

• Basic Operations
• User Input
• Copy Stack
• Reverse Stack
• Insert
• Display
• Remove
• Reverse (Recursion)
• Underflow
• Overflow

Main Logic

Copy
Original → Temp → Original + Copy

Reverse
Original → New Stack

Insert Bottom
Temp → Insert → Restore

Insert Index
Pop → Insert → Restore

Display (Stack)
Pop → Print → Restore

Display (Array)
For-each → Print

Display (Recursion)
Pop → Print → Restore

Remove Bottom
Pop → Delete → Restore

Remove Index
Pop → Delete → Restore

Reverse (Recursion)
Pop → Reverse → Push Bottom

Underflow

• Empty Stack par Pop/Peek karne par hota hai.

Overflow

• Fixed Size Stack me hota hai.
• Java Stack Dynamic hota hai, isliye practically Overflow nahi hota.

Time Complexity

Push                 O(1)
Pop                  O(1)
Peek                 O(1)
Copy                 O(n)
Reverse              O(n)
Insert               O(n)
Display              O(n)
Remove               O(n)
Reverse(Recursion)   O(n²)

Space Complexity

Stack                O(n)
Copy                 O(n)
Reverse              O(n)
Insert/Remove        O(n)
Display(Stack)       O(n)
Display(Array)       O(1)
Display(Recursion)   O(n)
Reverse(Recursion)   O(n)

Applications

• Function Calls
• Recursion
• Undo / Redo
• Browser History
• DFS
• Backtracking
• Expression Evaluation
• Parentheses Matching
• String Reversal

*/