package stack;

public class stackUsingArrayImplementation {

    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public stackUsingArrayImplementation(int size) {

        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push
    public void push(int value) {

        if (isFull()) {

            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    // Pop
    public int pop() {

        if (isEmpty()) {

            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    // Peek
    public int peek() {

        if (isEmpty()) {

            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    // Empty Check
    public boolean isEmpty() {
        return top == -1;
    }

    // Full Check
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Size
    public int size() {
        return top + 1;
    }

    // Display
    public void display() {

        if (isEmpty()) {

            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack : ");

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        stackUsingArrayImplementation stack = new stackUsingArrayImplementation(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        System.out.println("Top Element : " + stack.peek());

        System.out.println("Removed : " + stack.pop());

        stack.display();

        System.out.println("Size : " + stack.size());

        System.out.println("Is Empty : " + stack.isEmpty());

        System.out.println("Is Full : " + stack.isFull());
    }
}

/*

Stack using Array

Definition

• Stack ko Fixed Size Array se implement kiya ja sakta hai.
• Stack LIFO (Last In First Out) follow karta hai.

Concept Used

• Array
• LIFO

Data Members

• stack[] → Elements Store karta hai.
• top → Top Element ka Index.
• capacity → Maximum Size.

Operations

• push() → Top par Insert
• pop() → Top se Delete
• peek() → Top Element Return
• size() → Current Size
• isEmpty() → Empty Check
• isFull() → Full Check
• display() → Print Stack

Main Logic

Push

• Top ko Increase karo.
• New Element Insert karo.

Pop

• Top Element Return karo.
• Top ko Decrease karo.

Peek

• Top Element Return karo.
• Delete nahi hota.

Conditions

• Empty → top == -1
• Full → top == capacity - 1

Time Complexity

• push() → O(1)
• pop() → O(1)
• peek() → O(1)
• isEmpty() → O(1)
• isFull() → O(1)
• size() → O(1)
• display() → O(n)

Space Complexity

• O(n)

Advantages

• Simple Implementation
• Fast Push aur Pop
• Less Memory Overhead
• Direct Index Access

Disadvantages

• Fixed Size
• Stack Overflow ho sakta hai.
• Capacity pehle se Decide karni padti hai.

Applications

• Function Call Stack
• Undo / Redo
• Expression Evaluation
• Backtracking
• Browser History

*/