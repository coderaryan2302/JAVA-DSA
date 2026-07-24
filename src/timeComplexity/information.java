/*
=========================================
           TIME COMPLEXITY
=========================================

Definition

Time Complexity batati hai ki Input Size (N)
badhne par Algorithm kitna time lega.

Ye Actual Seconds nahi batati,
sirf Operations ki Growth batati hai.


Input Size (N)

• N = Number of Elements

Examples

• Array Length
• String Length
• Linked List Nodes


Why Time Complexity?

• Fast Algorithm choose karne ke liye.
• Large Input handle karne ke liye.
• DSA aur Interviews me important.
• TLE (Time Limit Exceeded) avoid karne ke liye.


Cases

• Best Case    → Minimum Time
• Average Case → Average Time
• Worst Case   → Maximum Time

Note

• Big O generally Worst Case ko represent karta hai.


Big O Notation

Algorithm ki Maximum Running Time batata hai.

Examples

• Linear Search  → O(N)
• Binary Search  → O(log N)


Rules

• Constant Operation        → O(1)
• One Loop                 → O(N)
• Two Nested Loops         → O(N²)
• Three Nested Loops       → O(N³)
• Divide by 2              → O(log N)
• Multiply by 2            → O(log N)
• Sequential Loops         → O(N)
• Nested Loops             → O(N²)
• Ignore Constants         → O(5N) = O(N)
• Ignore Lower Terms       → O(N² + N) = O(N²)


Types of Time Complexity

• O(1)      → Constant Time
  Examples : Array Access, Stack Push/Pop, Queue Front/Rear, HashMap Get (Avg)

• O(log N)  → Logarithmic Time
  Examples : Binary Search, Balanced BST, Heap Operations

• O(√N)     → Square Root Time
  Examples : Prime Number Check, Factor Finding

• O(N)      → Linear Time
  Examples : Linear Search, Array Traversal, Linked List Traversal

• O(N log N)
  Examples : Merge Sort, Heap Sort, Quick Sort (Average)

• O(N²)
  Examples : Bubble Sort, Selection Sort, Insertion Sort (Worst), Two Nested Loops

• O(N³)
  Examples : Three Nested Loops

• O(2ᴺ)
  Examples : Subset Generation, Backtracking

• O(N!)
  Examples : Permutations, Brute Force


Important DSA Time Complexity

Array

• Access          → O(1)
• Update          → O(1)
• Search          → O(N)
• Insert End      → O(1)
• Insert Front    → O(N)
• Delete End      → O(1)
• Delete Front    → O(N)
• Traversal       → O(N)

Linked List

• Insert Head     → O(1)
• Insert Tail     → O(N)
• Delete Head     → O(1)
• Delete Tail     → O(N)
• Search          → O(N)
• Traversal       → O(N)

Stack

• Push            → O(1)
• Pop             → O(1)
• Peek            → O(1)

Queue

• Enqueue         → O(1)
• Dequeue         → O(1)
• Front           → O(1)
• Rear            → O(1)

HashMap

• Put             → O(1) Average
• Get             → O(1) Average
• Remove          → O(1) Average
• ContainsKey     → O(1) Average

HashSet

• Add             → O(1) Average
• Remove          → O(1) Average
• Contains        → O(1) Average

Searching

• Linear Search   → O(N)
• Binary Search   → O(log N)

Sorting

• Bubble Sort     → O(N²)
• Selection Sort  → O(N²)
• Insertion Sort  → O(N²) Worst
• Merge Sort      → O(N log N)
• Heap Sort       → O(N log N)
• Quick Sort      → Avg O(N log N), Worst O(N²)

Tree

• BST Search      → O(log N) Average
• BST Insert      → O(log N) Average
• BST Delete      → O(log N) Average

Graph

• DFS             → O(V + E)
• BFS             → O(V + E)


Comparison (Best → Worst)

O(1) > O(log N) > O(√N) > O(N) > O(N log N) > O(N²) > O(N³) > O(2ᴺ) > O(N!)


Time vs Space

Time Complexity  → Execution Time

Space Complexity → Memory Usage


Remember

• Main Operations Count karo.
• Constants Ignore karo.
• Lower Order Terms Ignore karo.
• Smaller Big O = Faster Algorithm.
• Larger Big O = Slower Algorithm.
• By Default Worst Case Analyze kiya jata hai.

=========================================
*/