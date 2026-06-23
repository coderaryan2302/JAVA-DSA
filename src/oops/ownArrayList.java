package oops;
class MyArrayList {

    private int[] arr;          // Internal array
    private int size;           // Number of elements

    // Constructor
    MyArrayList(int capacity) {
        if (capacity <= 0) {
            capacity = 1;                       // Minimum capacity
        }
        arr = new int[capacity];
    }

    // Add element at end
    void add(int element) {
        if (size == arr.length) {              // Array full
            increaseCapacity();
        }
        arr[size++] = element;                 // Add element
    }

    // Remove last element
    void removeFromEnd() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }
        size--;                                // Decrease size
    }

    // Remove element from given index
    void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];              // Left shift
        }
        size--;
    }

    // Double the capacity
    void increaseCapacity() {
        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];               // Copy elements
        }
        arr = newArr;
    }

    // Get element
    int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index.");
            return -1;
        }
        return arr[index];
    }

    // Update element
    void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index.");
            return;
        }
        arr[index] = value;
    }

    // Current size
    int size() {
        return size;
    }

    // Current capacity
    int capacity() {
        return arr.length;
    }

    // Display list
    void display() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}

public class ownArrayList {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList(2);

        list.add(10);
        list.add(20);
        list.add(30);                       // Capacity increases automatically

        System.out.println("List:");
        list.display();

        System.out.println("Element at index 1 : " + list.get(1));

        list.set(1, 25);

        System.out.println("\nAfter Updating:");
        list.display();

        list.remove(0);

        System.out.println("\nAfter Removing Index 0:");
        list.display();

        list.removeFromEnd();

        System.out.println("\nAfter Removing From End:");
        list.display();

        System.out.println("\nSize     : " + list.size());
        System.out.println("Capacity : " + list.capacity());
    }
}

/*
Important Points:

1. ArrayList internally array ka use karta hai.

2. Jab array full ho jata hai,
   to capacity automatically increase hoti hai.

3. Capacity = Total storage available.

4. Size = Actual elements present.

5. add() :
   Element ko end me add karta hai.

6. remove(index) :
   Element remove karke remaining elements ko
   left shift karta hai.

7. get(index) :
   Particular index ka element return karta hai.

8. set(index, value) :
   Existing value ko update karta hai.

9. Dynamic Array ka main benefit:
   Fixed size array ki limitation ko remove karta hai.

Interview Points:

- Java ArrayList dynamic array par based hota hai.
- Capacity full hone par generally capacity increase hoti hai.
- Insertion at end : O(1) average
- get() : O(1)
- remove(index) : O(n)
- Dynamic arrays memory aur performance ka balance provide karte hain.
*/