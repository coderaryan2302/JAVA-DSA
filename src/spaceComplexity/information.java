/*
=========================================
          SPACE COMPLEXITY
=========================================

Definition

Space Complexity batati hai ki algorithm execution
ke dauran kitni memory use karta hai.

Space Complexity = Fixed Space + Variable Space


Why Space Complexity?

- Memory Usage jaanne ke liye.
- Efficient Algorithm choose karne ke liye.
- Large Input handle karne ke liye.
- DSA aur Interviews me important.


Types of Space

1. Fixed Space

• Program Code
• Variables
• Constants

Input Size par depend nahi karta.

Space = O(1)


2. Variable Space

Input Size (N) ke according badhta ya ghatta hai.

Examples

• Array
• Linked List
• Recursion Stack


3. Auxiliary Space

Algorithm execution ke dauran use hone wali
Extra Memory.

Input Memory isme include nahi hoti.

Examples

• Extra Array
• Stack
• Queue
• HashMap
• Recursion Stack


Rules

• No Extra Memory         → O(1)
• One Extra Array         → O(N)
• Two Extra Arrays        → O(2N) = O(N)
• Matrix                  → O(N²)
• Recursive Calls         → O(N)
• Binary Search (Rec.)    → O(log N)
• Iterative Solution      → Usually O(1)


Important Examples

• Print Array             → O(1)
• Copy Array              → O(N)
• Merge Sort              → O(N)
• Quick Sort              → Avg O(log N), Worst O(N)
• Bubble Sort             → O(1)
• Selection Sort          → O(1)
• Insertion Sort          → O(1)


Important DSA Space Complexity

• Array                   → O(N)
• Linked List             → O(N)
• Stack                   → O(N)
• Queue                   → O(N)
• HashMap                 → O(N)
• HashSet                 → O(N)
• Binary Search (Iter.)   → O(1)
• Binary Search (Rec.)    → O(log N)
• DFS                     → O(V)
• BFS                     → O(V)
• Merge Sort              → O(N)
• Heap Sort               → O(1)
• Quick Sort              → Avg O(log N), Worst O(N)


Comparison (Best → Worst)

O(1) > O(log N) > O(N) > O(N²)


Time vs Space

Time Complexity  → Execution Time

Space Complexity → Memory Usage


Remember

• Count only Extra Memory used by Algorithm.
• Fixed Memory ignore karte hain.
• Smaller Space Complexity = Better Memory Usage.
• Good Algorithm Time aur Space dono ko balance karta hai.
• Kabhi-kabhi Time bachane ke liye Extra Space use karte hain.

=========================================
*/