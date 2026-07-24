package loops;

public class forEachLoop {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

/*
For-Each Loop (Enhanced For Loop)

Definition
• Array/Collection ke elements ko one by one access karne ke liye use hota hai.
• Index use nahi hota.
• Read/Traversal ke liye best.

Syntax

for (DataType variable : array) {
    // Code
}

Working
1. First element variable me aata hai.
2. Code execute hota hai.
3. Next element par move karta hai.
4. Sab elements complete hone par loop end ho jata hai.

Time Complexity  : O(n)
Space Complexity : O(1)

Advantages
• Simple & Readable
• Index ki zarurat nahi
• Traversal ke liye best

Limitations
• Index access nahi hota
• Reverse traversal nahi kar sakte
• Elements add/remove nahi kar sakte

Applications
• Array
• ArrayList
• Set
• Queue
• Stack

For vs For-Each

For Loop
• Index available
• Reverse traversal possible
• Read + Modify

For-Each Loop
• No index
• Reverse traversal nahi
• Read/Traversal only

*/