package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setInterfaceEg {

    // HashSet Example
    static void hashSetExample() {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(48);
        set.add(15);
        set.add(10);

        System.out.println(set);

        set.add(1);      // Duplicate Ignored
        set.add(2);

        System.out.println(set);

        set.remove(2);

        System.out.println(set);

        System.out.println(set.contains(5));

        System.out.println(set.contains(10));

        System.out.println(set.size());

        System.out.println(set.isEmpty());
    }

    // LinkedHashSet Example
    static void linkedHashSetExample() {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(48);
        set.add(15);
        set.add(10);

        System.out.println(set);

        set.add(1);

        System.out.println(set);

        set.remove(2);

        System.out.println(set);

        System.out.println(set.contains(15));

        System.out.println(set.size());
    }

    // TreeSet Example
    static void treeSetExample() {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(48);
        set.add(15);
        set.add(10);
        set.add(2);
        set.add(1);
        set.add(3);

        System.out.println(set);

        set.add(3);

        System.out.println(set);

        set.remove(10);

        System.out.println(set);

        System.out.println(set.contains(48));

        System.out.println(set.first());

        System.out.println(set.last());

        System.out.println(set.size());
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("----- HashSet -----");
        hashSetExample();

        System.out.println("\n----- LinkedHashSet -----");
        linkedHashSetExample();

        System.out.println("\n----- TreeSet -----");
        treeSetExample();
    }
}

/*

Set Interface

Definition

• Set Java Collection Framework ka Interface hai.
• Sirf Unique Elements store karta hai.
• Duplicate Elements allow nahi hote.

Characteristics

• Unique Elements
• No Duplicate Values
• Dynamic Size
• Fast Searching
• Objects Only

Implementations

• HashSet
• LinkedHashSet
• TreeSet

HashSet

• Unordered
• Hashing use karta hai.
• One Null Value allow karta hai.
• Fastest implementation.

Best For

• Fast Searching
• Removing Duplicates

LinkedHashSet

• Insertion Order maintain karta hai.
• Hash Table + Linked List use karta hai.
• One Null Value allow karta hai.

Best For

• Unique Data with Insertion Order

TreeSet

• Elements Sorted (Ascending) hote hain.
• Red-Black Tree use karta hai.
• Null Value allow nahi karta.

Best For

• Sorted Data

Comparison

HashSet

• Unordered
• Fastest

LinkedHashSet

• Insertion Order

TreeSet

• Sorted Order

Common Methods

• add() → Insert Element
• remove() → Delete Element
• contains() → Search Element
• size() → Total Elements
• isEmpty() → Check Empty
• clear() → Remove All Elements

Time Complexity

HashSet

• add() → O(1)
• remove() → O(1)
• contains() → O(1)

LinkedHashSet

• add() → O(1)
• remove() → O(1)
• contains() → O(1)

TreeSet

• add() → O(log n)
• remove() → O(log n)
• contains() → O(log n)
• first() → O(log n)
• last() → O(log n)

Space Complexity

• O(n)

Advantages

• Duplicate Elements automatically remove ho jate hain.
• Fast Searching.
• Dynamic Size.
• TreeSet me Sorted Data milta hai.

Disadvantages

• Index available nahi hota.
• Random Access possible nahi hai.
• HashSet Order maintain nahi karta.

Applications

• Remove Duplicates
• Unique User IDs
• Tags
• Dictionary
• Database Records
• Fast Searching

*/