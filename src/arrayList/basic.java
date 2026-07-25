package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> booleanList = new ArrayList<>();
        ArrayList<Float> floatList = new ArrayList<>();

        // User Input
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Enter array list elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        // Add Elements
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(8);

        // Get Elements
        System.out.println("First Element = " + list.get(0));
        System.out.println("Second Element = " + list.get(1));

        // Print Using Loop
        System.out.println("ArrayList Elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Print Directly
        System.out.println("\nComplete ArrayList = " + list);

        // Add Element at Index
        list.add(1, 100);
        System.out.println("After Adding 100 at Index 1 = " + list);

        // Modify Element
        list.set(1, 10);
        System.out.println("After Updating Index 1 = " + list);

        // Remove Using Index
        list.remove(1);
        System.out.println("After Removing Index 1 = " + list);

        // Remove Using Value
        System.out.println("Value 7 Removed = " + list.remove(Integer.valueOf(7)));
        list.remove(Integer.valueOf(7));
        System.out.println("After Removing Value 7 = " + list);

        // Check Element
        System.out.println("Contains 8 = " + list.contains(8));

        // Total Elements
        System.out.println("Size = " + list.size());

        // Check Empty
        System.out.println("Is Empty = " + list.isEmpty());

        // User Value Check
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        System.out.println("Present = " + list.contains(target));

        // Last Element
        System.out.println("Last Element = " + list.get(list.size() - 1));

        // Mixed Data Type
        ArrayList mixedList = new ArrayList();

        mixedList.add("abcdef");
        mixedList.add(1001);
        mixedList.add(true);

        System.out.println("Mixed ArrayList = " + mixedList);
    }
}

/*
ArrayList Basics

Definition
• ArrayList ek dynamic array hai jo automatically apna size badha ya ghata sakta hai.

Working
• ArrayList create karo.
• add() se elements insert karo.
• get() se element access karo.
• set() se element update karo.
• remove() se element delete karo.
• contains() se element search karo.
• size() aur isEmpty() se list ki information lo.

Key Methods
• add(value) → End me element add karta hai.
• add(index, value) → Given index par element insert karta hai.
• get(index) → Index ka element return karta hai.
• set(index, value) → Element update karta hai.
• remove(index) → Index se element remove karta hai.
• remove(Integer.valueOf(value)) → Value remove karta hai.
• contains(value) → Element present hai ya nahi batata hai.
• size() → Total elements return karta hai.
• isEmpty() → List empty hai ya nahi batata hai.

Key Points
• Dynamic size hota hai.
• Duplicate values allow hoti hain.
• Insertion order maintain hota hai.
• Indexing 0 se start hoti hai.
• Primitive data types directly store nahi hote, wrapper classes use hoti hain.

Edge Cases
• Invalid input (size <= 0)
• Empty ArrayList
• Duplicate elements
• Removing unavailable value
• Mixed data type (Raw ArrayList)

Time Complexity
• add() : O(1) Average
• get() : O(1)
• set() : O(1)
• remove(index) : O(n)
• contains() : O(n)
• size() : O(1)

Space Complexity : O(n)

Revision
• add()
• get()
• set()
• remove()
• contains()
• size()
• isEmpty()
*/