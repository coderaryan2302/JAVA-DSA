package linkedlist.doublyLinkedList;

public class flattenAMultilevelDLL {

    /* Multilevel DLL Node */

    static class Node {

        int value;
        Node prev;
        Node next;
        Node child;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display list */

    public static void display(Node head) {

        while (head != null) {

            System.out.print(head.value);

            if (head.next != null)
                System.out.print(" <-> ");

            head = head.next;          // Move ahead
        }

        System.out.println();
    }

    static class Solution {

        /* Flatten multilevel doubly linked list */

        public Node flatten(Node head) {

            if (head == null)
                return null;

            Node temp = head;

            while (temp != null) {

                Node next = temp.next;     // Save next node

                if (temp.child != null) {

                    Node childHead = flatten(temp.child);

                    temp.next = childHead;
                    childHead.prev = temp;

                    Node childTail = childHead;

                    while (childTail.next != null)
                        childTail = childTail.next;     // Reach child tail

                    childTail.next = next;

                    if (next != null)
                        next.prev = childTail;

                    temp.child = null;      // Remove child pointer
                }

                temp = next;
            }

            return head;
        }
    }

    public static void main(String[] args) {

        /*
                 1 --- 2 --- 3 --- 4
                       |
                       7 --- 8
                             |
                             11 --- 12

        Flatten

        1 <-> 2 <-> 7 <-> 8 <-> 11 <-> 12 <-> 3 <-> 4
        */

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);

        one.next = two;
        two.prev = one;

        two.next = three;
        three.prev = two;

        three.next = four;
        four.prev = three;

        Node seven = new Node(7);
        Node eight = new Node(8);

        seven.next = eight;
        eight.prev = seven;

        Node eleven = new Node(11);
        Node twelve = new Node(12);

        eleven.next = twelve;
        twelve.prev = eleven;

        two.child = seven;
        eight.child = eleven;

        Solution obj = new Solution();

        Node head = obj.flatten(one);

        System.out.println("Flattened Doubly Linked List");
        display(head);
    }
}

/*

Flatten Multilevel Doubly Linked List (LC 430)

Flatten:
Merge every child list into the main list.
After flattening, only Prev & Next pointers remain.

Algorithm

1. Traverse the list.
2. If child exists, recursively flatten it.
3. Connect child list after current node.
4. Reach child tail.
5. Connect original next node.
6. Remove child pointer.

Example

1 - 2 - 3 - 4
    |
    7 - 8
        |
       11 - 12

Result

1 <-> 2 <-> 7 <-> 8 <-> 11 <-> 12 <-> 3 <-> 4

Edge Cases

✔ Empty List
✔ Single Node
✔ No Child
✔ Multiple Child Levels

Time  : O(n)
Space : O(d)

d = Maximum recursion depth.

Interview Point

✔ DFS (Recursive) approach.
✔ Child list is processed before next node.
✔ Always reconnect both Prev and Next pointers.
✔ Remove child pointer after merging.

*/