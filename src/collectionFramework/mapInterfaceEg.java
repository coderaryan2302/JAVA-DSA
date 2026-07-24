package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapInterfaceEg {

    // HashMap Example
    static void hashMapExample() {

        Map<Integer, String> map = new HashMap<>();

        map.put(3, "Aman");
        map.put(1, "Rohan");
        map.put(2, "Riya");
        map.put(1, "Priya");          // Replace Value
        map.putIfAbsent(4, "Rahul");  // Insert if Key Absent

        System.out.println("HashMap : " + map);

        System.out.println("\nGet Value : " + map.get(2));

        System.out.println("Contains Key 4 : " + map.containsKey(4));

        System.out.println("Contains Value Riya : " + map.containsValue("Riya"));

        System.out.println("\nKeys : " + map.keySet());

        System.out.println("Values : " + map.values());

        System.out.println("Entry Set : " + map.entrySet());

        System.out.println("\nIterating Keys");

        for (Integer key : map.keySet())
            System.out.println(key);

        System.out.println("\nIterating Values");

        for (String value : map.values())
            System.out.println(value);

        System.out.println("\nIterating Key-Value");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(entry);
            System.out.println("Key = " + entry.getKey());
            System.out.println("Value = " + entry.getValue());
        }
    }

    // LinkedHashMap Example
    static void linkedHashMapExample() {

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Aman");
        map.put(1, "Rohan");
        map.put(2, "Riya");
        map.put(1, "Priya");

        System.out.println("LinkedHashMap : " + map);
    }

    // TreeMap Example
    static void treeMapExample() {

        Map<Integer, String> map = new TreeMap<>();

        map.put(3, "Aman");
        map.put(1, "Rohan");
        map.put(2, "Riya");
        map.put(4, "Priya");

        System.out.println("TreeMap : " + map);
    }

    public static void main(String[] args) {

        System.out.println("----- HashMap -----");
        hashMapExample();

        System.out.println("\n----- LinkedHashMap -----");
        linkedHashMapExample();

        System.out.println("\n----- TreeMap -----");
        treeMapExample();
    }
}

/*

Map Interface

Definition

• Map Java Collection Framework ka Interface hai.
• Data ko Key → Value Pair ke form me store karta hai.

Characteristics

• Key → Value Pair
• Keys Unique hote hain.
• Values Duplicate ho sakti hain.
• Fast Search by Key
• Objects ko store karta hai.

Implementations

• HashMap
• LinkedHashMap
• TreeMap
• Hashtable

HashMap

• Unordered
• Fastest
• One Null Key Allowed
• Multiple Null Values Allowed

Best For

• General Purpose Storage

LinkedHashMap

• Insertion Order Maintain karta hai.
• HashMap se thoda slower.
• One Null Key Allowed.
• Multiple Null Values Allowed.

TreeMap

• Keys Ascending Order me store hoti hain.
• Red-Black Tree use karta hai.
• Null Key Allowed nahi hai.
• Null Values Allowed hain.

Hashtable

• Thread Safe
• Null Key aur Null Value allow nahi karta.
• HashMap se slower.

Common Methods

• put() → Insert / Update
• putIfAbsent() → Insert if Key not Present
• get() → Get Value
• containsKey() → Check Key
• containsValue() → Check Value
• keySet() → All Keys
• values() → All Values
• entrySet() → Key-Value Pairs
• remove() → Delete Entry
• size() → Total Entries
• clear() → Remove All Entries

Iteration

• keySet() → Keys
• values() → Values
• entrySet() → Keys + Values

Comparison

HashMap

• Unordered
• Fastest

LinkedHashMap

• Maintains Insertion Order

TreeMap

• Sorted Order

Time Complexity

HashMap / LinkedHashMap

• Put → O(1)
• Get → O(1)
• Remove → O(1)
• Search → O(1)

TreeMap

• Put → O(log n)
• Get → O(log n)
• Remove → O(log n)

Space Complexity

• O(n)

Advantages

• Fast Searching
• Unique Keys
• Dynamic Size
• Rich Built-in Methods

Disadvantages

• Duplicate Keys Allowed nahi hote.
• Values se searching efficient nahi hoti.
• Primitive types directly store nahi hote.

Applications

• Student Database
• Phone Book
• Employee Records
• Banking System
• Cache
• Dictionary
• Configuration Settings

*/