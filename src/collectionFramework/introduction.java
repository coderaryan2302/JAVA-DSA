/*

Java Collection Framework (JCF)

Definition

• Java Collection Framework (JCF) predefined library hai.
• Objects ko store, manage, search, sort aur manipulate karne ke liye use hota hai.

Why Collection Framework?

Arrays

• Fixed Size
• Insertion/Deletion Difficult
• Limited Built-in Methods

Collection Framework

• Dynamic Size
• Easy Insertion & Deletion
• Rich Built-in Methods
• Better Performance

Hierarchy

Iterable
   │
Collection (Interface)
   │
├── List
│   ├── ArrayList
│   ├── LinkedList
│   ├── Vector
│   └── Stack
│
├── Set
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet
│
└── Queue
    ├── LinkedList
    ├── PriorityQueue
    └── Deque
         ├── ArrayDeque
         └── LinkedList

Map (Separate Interface)

Map
├── HashMap
├── LinkedHashMap
├── TreeMap
└── Hashtable

Interfaces

List

• Ordered
• Duplicate Allowed
• Index Based

Examples

• ArrayList
• LinkedList
• Vector
• Stack

Set

• Unique Elements
• No Duplicates
• Fast Searching

Examples

• HashSet
• LinkedHashSet
• TreeSet

Queue

• FIFO (First In First Out)

Examples

• LinkedList
• PriorityQueue
• ArrayDeque

Deque

• Double Ended Queue
• Front aur Rear dono side insertion/deletion

Examples

• ArrayDeque
• LinkedList

Map

• Key → Value Pair
• Keys Unique
• Values Duplicate ho sakti hain

Examples

• HashMap
• LinkedHashMap
• TreeMap
• Hashtable

Collection vs Collections

Collection

• Interface
• List, Set, Queue ka parent Interface

Collections

• Utility Class
• Common Methods provide karti hai.

Methods

• sort()
• reverse()
• shuffle()
• binarySearch()
• max()
• min()
• swap()

Iterator

• Collection traverse karne ke liye use hota hai.

Methods

• hasNext()
• next()
• remove()

Most Used Classes

• ArrayList
• LinkedList
• HashMap
• HashSet
• TreeSet
• PriorityQueue
• ArrayDeque

Time Complexity

• Depends on implementation.
• Hash-based Collections → O(1) average
• Tree-based Collections → O(log n)
• ArrayList Random Access → O(1)

Space Complexity

• O(n)

Advantages

• Dynamic Size
• Easy Searching & Sorting
• Rich Built-in Methods
• Better Code Reusability
• Easy Data Management

Disadvantages

• Arrays se thodi zyada memory use hoti hai.
• Primitive types directly store nahi hote.
• Kuch implementations arrays se slower ho sakti hain.

Applications

• Student Management System
• Banking System
• Shopping Cart
• Library Management
• Social Media
• Inventory System
• Scheduling
• Database Applications

*/