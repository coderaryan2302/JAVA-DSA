/*

Stack

Definition

• Stack ek Linear Data Structure hai.
• Ye LIFO (Last In First Out) Principle Follow karta hai.
• Jo Element Sabse Last me Insert hota hai, wahi Sabse Pehle Remove hota hai.

Basic Operations

• push()     → Element Insert
• pop()      → Top Element Remove
• peek()     → Top Element Return
• isEmpty()  → Stack Empty hai ya nahi
• isFull()   → Stack Full hai ya nahi (Array Stack)
• size()     → Total Elements
• display()  → Sabhi Elements Print

Example

Push

10
20
30

Top = 30

Pop

30 Remove

Concept Used

• LIFO (Last In First Out)

Time Complexity

• Push      : O(1)
• Pop       : O(1)
• Peek      : O(1)
• isEmpty   : O(1)
• isFull    : O(1) (Array Stack)
• Size      : O(1)
• Display   : O(n)
• Search    : O(n)

Space Complexity

• Array Stack       : O(n)
• Linked List Stack : O(n)

Advantages

• Easy to Implement.
• Push aur Pop O(1) me hote hain.
• Recursion aur Function Calls me Useful.
• Memory Efficient Access.
• Kai Algorithms me Use hota hai.

Disadvantages

• Random Access Possible nahi hota.
• Sirf Top Element Accessible hota hai.
• Searching O(n) hoti hai.
• Array Stack Overflow ho sakta hai.
• Linked List me Extra Pointer Memory lagti hai.

Array Stack vs Linked List Stack

Array Stack

• Fixed Size
• Faster
• Cache Friendly
• Less Memory
• Overflow Possible

Linked List Stack

• Dynamic Size
• No Overflow (Memory Available hone tak)
• Extra Pointer Memory
• Slightly Slower
• More Flexible

Applications

• Function Calls
• Recursion
• Undo / Redo
• Browser Back Button
• Parentheses Matching
• Expression Evaluation
• Expression Conversion
• DFS (Depth First Search)
• Backtracking
• Compiler Parsing
• Maze Problems
• String Reversal
• Syntax Checking
• Stock Span Problem
• Next Greater Element
• Histogram Problem
• Celebrity Problem

*/