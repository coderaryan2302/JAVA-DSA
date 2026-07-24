package hashMaps;

import java.util.HashMap;
import java.util.Map;

public class basic {

    // HashMap Basics
    static void hashMapExample() {

        // Create HashMap
        Map<String, Integer> map = new HashMap<>();

        // Insert Elements
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);

        System.out.println("HashMap : " + map);

        // Get Value
        System.out.println("\nAge of Yash : " + map.get("Yash"));
        System.out.println("Age of Rahul : " + map.get("Rahul"));

        // Update Value
        map.put("Akash", 25);
        System.out.println("\nUpdated Age of Akash : " + map.get("Akash"));

        // Remove Entry
        System.out.println("\nRemoved Value : " + map.remove("Akash"));
        System.out.println("Removed Value : " + map.remove("Riya"));

        // Search Key
        System.out.println("\nContains Akash : " + map.containsKey("Akash"));
        System.out.println("Contains Yash : " + map.containsKey("Yash"));

        // Search Value
        System.out.println("\nContains Value 19 : " + map.containsValue(19));

        // Insert if Key Absent
        map.putIfAbsent("Yashika", 30);
        map.putIfAbsent("Yash", 30);

        System.out.println("\nAfter putIfAbsent : " + map);

        // Keys, Values & Entries
        System.out.println("\nKeys : " + map.keySet());
        System.out.println("Values : " + map.values());
        System.out.println("Entries : " + map.entrySet());

        // Size
        System.out.println("\nSize : " + map.size());

        // Traverse using keySet()
        System.out.println("\nTraverse using keySet()");

        for (String key : map.keySet())
            System.out.println(key + " -> " + map.get(key));

        // Traverse using entrySet()
        System.out.println("\nTraverse using entrySet()");

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        // Traverse using var
        System.out.println("\nTraverse using var");

        for (var entry : map.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        // Empty Check
        System.out.println("\nIs Empty : " + map.isEmpty());
    }

    public static void main(String[] args) {

        hashMapExample();
    }
}

/*

HashMap

Definition

• HashMap Java Collection Framework ki Map implementation hai.
• Data ko Key → Value Pair ke form me store karta hai.
• Fast searching ke liye Hashing use karta hai.

Characteristics

• Key → Value Pair
• Keys Unique hote hain.
• Values Duplicate ho sakti hain.
• Unordered
• Dynamic Size
• One Null Key Allowed
• Multiple Null Values Allowed

Syntax

Map<KeyType, ValueType> map = new HashMap<>();

Example

Map<String, Integer> map = new HashMap<>();

Common Methods

• put() → Insert / Update
• get() → Get Value
• remove() → Delete Entry
• containsKey() → Check Key
• containsValue() → Check Value
• putIfAbsent() → Insert if Key Absent
• keySet() → All Keys
• values() → All Values
• entrySet() → All Key-Value Pairs
• size() → Total Entries
• clear() → Remove All Entries
• isEmpty() → Check Empty

Traversal

Method 1

• keySet()

Method 2

• entrySet()

Method 3

• var + entrySet()

Internal Working

put()

↓

hashCode()

↓

Hash Function

↓

Bucket

↓

Store Entry

Searching

get(key)

↓

hashCode()

↓

Bucket

↓

Compare Key

↓

Return Value

Features

• Fast Lookup
• Dynamic Size
• Uses Hashing
• Average O(1) Performance

Time Complexity

• put() → O(1) Average
• get() → O(1) Average
• remove() → O(1) Average
• containsKey() → O(1) Average
• containsValue() → O(n)
• size() → O(1)
• isEmpty() → O(1)

Worst Case

• put(), get(), remove(), containsKey() → O(n)

Space Complexity

• O(n)

HashMap vs HashSet

HashMap

• Key → Value Pair
• Duplicate Keys ❌
• Duplicate Values ✔

HashSet

• Only Values
• Duplicate Elements ❌

Advantages

• Fast Insertion
• Fast Searching
• Fast Deletion
• Dynamic Size
• Easy Traversal
• Most Common Map

Disadvantages

• Order maintain nahi karta.
• Collision se performance reduce ho sakti hai.
• Primitive types directly store nahi hote.

Applications

• Student Database
• Employee Records
• Phone Book
• Banking System
• Cache
• Login System
• Inventory Management
• Frequency Counting
• Graph Algorithms

*/