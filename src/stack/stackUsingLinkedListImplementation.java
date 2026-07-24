package stack;

public class stackUsingLinkedListImplementation {

    // Node Class
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Data Members
    private Node top;
    private int size;

    // Constructor
    public stackUsingLinkedListImplementation() {

        top = null;
        size = 0;
    }

    // Push
    public void push(int value) {

        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;

        size++;
    }

    // Pop
    public int pop() {

        if (isEmpty()) {

            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;

        top = top.next;
        size--;

        return value;
    }

    // Peek
    public int peek() {

        if (isEmpty()) {

            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Empty Check
    public boolean isEmpty() {
        return top == null;
    }

    // Size
    public int size() {
        return size;
    }

    // Display
    public void display() {

        if (isEmpty()) {

            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack (Top → Bottom) : ");

        Node temp = top;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        stackUsingLinkedListImplementation stack = new stackUsingLinkedListImplementation();

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
    }
}

/*

Stack using Linked List

Definition

• Stack ko Singly Linked List se implement kiya ja sakta hai.
• Stack LIFO (Last In First Out) follow karta hai.
• Top hamesha First Node ko Point karta hai.

Concept Used

• Singly Linked List
• LIFO

Data Members

• Node → data, next
• top → First Node
• size → Total Elements

Operations

• push() → Top par Insert
• pop() → Top se Delete
• peek() → Top Element Return
• size() → Stack Size
• isEmpty() → Empty Check
• display() → Top se Bottom Print

Main Logic

Push

• New Node banao.
• New Node ko Top se Connect karo.
• Top ko New Node bana do.

Pop

• Top ka Data Store karo.
• Top ko Next Node par Move karo.
• Size kam karo.

Peek

• Top Node ka Data Return karo.

Time Complexity

• push() → O(1)
• pop() → O(1)
• peek() → O(1)
• isEmpty() → O(1)
• size() → O(1)
• display() → O(n)

Space Complexity

• O(n)

Advantages

• Dynamic Size
• No Fixed Capacity
• Fast Push aur Pop
• Memory Requirement ke according Grow karta hai.

Disadvantages

• Extra Memory for Next Pointer
• Array Stack se thoda Slow hota hai.

Applications

• Function Call Stack
• Undo / Redo
• Expression Evaluation
• Backtracking
• Browser History

*/