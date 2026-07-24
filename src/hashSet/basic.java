package hashSet;

import java.util.HashSet;

public class basic {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> set = new HashSet<>();

        // Add Elements
        set.add("James");
        set.add("Scott");
        set.add("James");      // Duplicate Ignored

        System.out.println("HashSet : " + set);

        // Search Element
        System.out.println("\nContains James : " + set.contains("James"));

        // Size
        System.out.println("Size : " + set.size());

        // Remove Element
        set.remove("James");

        System.out.println("\nContains James : " + set.contains("James"));
        System.out.println("Size : " + set.size());

        // Traversing
        System.out.println("\nTraverse HashSet");

        for (String element : set) {
            System.out.println(element);
        }

        // Empty Check
        System.out.println("\nIs Empty : " + set.isEmpty());
    }
}

/*

HashSet

Definition

• HashSet Java Collection Framework ki Set implementation hai.
• Sirf Unique Elements store karta hai.
• Duplicate Elements automatically ignore ho jate hain.
• Internally HashMap ka use karta hai.

Characteristics

• Unique Elements
• No Duplicates
• Unordered
• Dynamic Size
• Uses Hashing
• Fast Searching
• One Null Element Allowed

Syntax

HashSet<Type> set = new HashSet<>();

Example

HashSet<String> set = new HashSet<>();

Common Methods

• add() → Insert Element
• contains() → Search Element
• remove() → Delete Element
• size() → Total Elements
• clear() → Remove All Elements
• isEmpty() → Check Empty

Traversal

for (Type element : set)

Internal Working

Element

↓

hashCode()

↓

Hash Function

↓

Bucket

↓

Store Element

Duplicate

↓

Ignored

HashSet vs HashMap

HashSet

• Stores Only Values
• Duplicate Elements ❌

HashMap

• Stores Key → Value Pair
• Duplicate Keys ❌
• Duplicate Values ✔

Time Complexity

• add() → O(1)
• contains() → O(1)
• remove() → O(1)
• size() → O(1)
• isEmpty() → O(1)

Worst Case

• add(), contains(), remove() → O(n)

Space Complexity

• O(n)

Advantages

• Automatically Removes Duplicates
• Fast Insertion
• Fast Searching
• Fast Deletion
• Simple to Use

Disadvantages

• Order maintain nahi karta.
• Index available nahi hota.
• Duplicate Elements store nahi kar sakta.

Applications

• Remove Duplicates
• Unique User IDs
• Spell Checker
• Visited Nodes in Graph
• Cycle Detection
• Membership Testing
• Competitive Programming

*/