package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class listInterfaceEg {

    // ArrayList Example
    static void arrayListExample() {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        System.out.println(list.get(1));       // Get Element

        list.set(1, 10);                       // Update Element

        System.out.println(list);

        System.out.println(list.contains(10)); // Search Element

        System.out.println(list.size());       // Total Elements

        list.remove(0);                        // Remove Element

        System.out.println(list);
    }

    // LinkedList Example
    static void linkedListExample() {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        System.out.println(list.get(1));

        list.set(1, 10);

        System.out.println(list);

        System.out.println(list.contains(10));

        System.out.println(list.size());

        list.remove(0);

        System.out.println(list);
    }

    // Stack Example
    static void stackExample() {

        Stack<String> stack = new Stack<>();

        stack.push("PW");
        stack.push("Skills");
        stack.push("Java");

        System.out.println(stack);

        System.out.println(stack.peek());      // Top Element

        System.out.println(stack.pop());       // Remove Top

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.size());

        System.out.println(stack.empty());
    }

    public static void main(String[] args) {

        System.out.println("----- ArrayList -----");
        arrayListExample();

        System.out.println("\n----- LinkedList -----");
        linkedListExample();

        System.out.println("\n----- Stack -----");
        stackExample();
    }
}

/*

List Interface

Definition

• List Java Collection Framework ka ek Interface hai.
• Ordered collection store karta hai.
• Duplicate elements allow karta hai.

Characteristics

• Ordered Collection
• Index Based
• Duplicate Allowed
• Insertion Order Maintain karta hai.
• Null Values Allow karta hai.

Implementations

• ArrayList
• LinkedList
• Vector
• Stack

ArrayList

• Dynamic Array use karta hai.

Best For

• Fast Random Access
• Fast Searching

Not Good For

• Frequent Insertion
• Frequent Deletion

LinkedList

• Doubly Linked List use karta hai.

Best For

• Frequent Insertion
• Frequent Deletion

Not Good For

• Random Access

Vector

• Dynamic Array
• Thread Safe
• ArrayList se slower

Stack

• LIFO (Last In First Out)

Main Methods

• push()
• pop()
• peek()
• empty()

Common List Methods

• add() → Insert Element
• get() → Access Element
• set() → Update Element
• remove() → Delete Element
• contains() → Search Element
• size() → Total Elements
• isEmpty() → Check Empty
• clear() → Remove All Elements

ArrayList vs LinkedList

ArrayList

• Dynamic Array
• Fast Access
• Slow Insert/Delete

LinkedList

• Doubly Linked List
• Fast Insert/Delete
• Slow Access

Time Complexity

ArrayList

• Add (End) → O(1)
• Get → O(1)
• Set → O(1)
• Search → O(n)
• Insert/Delete → O(n)

LinkedList

• Add First/Last → O(1)
• Get → O(n)
• Search → O(n)
• Insert/Delete → O(1) (Reference available ho)

Stack

• Push → O(1)
• Pop → O(1)
• Peek → O(1)

Space Complexity

• O(n)

Advantages

• Dynamic Size
• Ordered Data
• Duplicate Elements Allowed
• Easy Traversal
• Rich Built-in Methods

Disadvantages

• Arrays se zyada memory use hoti hai.
• Primitive types directly store nahi hote (Wrapper Classes use hote hain).

Applications

• Student Records
• Shopping Cart
• Playlist
• Browser History
• To-Do List
• Undo / Redo

*/