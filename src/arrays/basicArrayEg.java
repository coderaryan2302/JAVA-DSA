package arrays;

class ArraysExample {

    void demoArrays() {

        int[] ages = new int[3];   // Array create

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;

        // Array print
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}

public class basicArrayEg {

    public static void main(String[] args) {

        ArraysExample obj = new ArraysExample(); // Object create
        obj.demoArrays();                        // Method call
    }
}

/*
Basic Array

Definition
• Array same data type ke multiple elements ko ek variable me store karta hai.
• Elements contiguous memory me store hote hain.
• Index 0 se start hoti hai.

Syntax
• int[] arr;
• int[] arr = new int[size];

Example
• int[] ages = new int[3];

Key Points
• First Index = 0
• Last Index = arr.length - 1
• arr.length total size batata hai.
• Array ki size fixed hoti hai.
• int ki default value = 0

Traversal
• for loop se array ke sabhi elements access hote hain.

Object
• Method dusri class me ho to object bana kar call karte hain.
• Same class me ho to direct call kar sakte hain.

Advantages
• Fast access (O(1))
• Easy traversal
• Same type ka data store karta hai.

Limitations
• Fixed size
• Different data types store nahi kar sakta.
• Insertion aur deletion costly hota hai.

Applications
• Marks
• Employee IDs
• Searching
• Sorting

Common Mistakes
• Invalid index access karna.
• Loop me arr.length use na karna.
• Index 0 se start hoti hai ye bhool jana.

Time Complexity
• Access : O(1)
• Traverse : O(n)

Space Complexity
• O(n)

Revision
• Same data type
• Index starts from 0
• Create : new int[size]
• Size : arr.length
• Last Index : arr.length - 1
• Traverse : for loop
*/