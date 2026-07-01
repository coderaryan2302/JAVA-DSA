package linkedlist.circularLinkedList;

public class josephusProblemUsingSCLL {

    /* Node */

    static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    /* Display */

    public static void display(Node head) {

        if (head == null)
            return;

        Node temp = head;

        do {

            System.out.print(temp.value);

            if (temp.next != head)
                System.out.print(" -> ");

            temp = temp.next;

        } while (temp != head);

        System.out.println();
    }

    static class Solution {

        /* Find Winner */

        public int winner(Node head, int k) {

            if (head == null)
                return -1;

            if (head.next == head)
                return head.value;

            Node curr = head;
            Node prev = head;

            // Reach last node

            while (prev.next != head)
                prev = prev.next;

            // Remove every kth person

            while (curr.next != curr) {

                for (int i = 1; i < k; i++) {

                    prev = curr;
                    curr = curr.next;
                }

                prev.next = curr.next;      // Remove current person

                curr = curr.next;           // Start from next person
            }

            return curr.value;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

        System.out.println("People");
        display(first);

        int winner = obj.winner(first, 2);

        System.out.println("\nWinner = " + winner);

        /*
        Output

        People

        1 -> 2 -> 3 -> 4 -> 5

        Winner = 3
        */
    }
}

/*

Josephus Problem Using SCLL

Type

✔ Singly Circular Linked List

Question

N people stand in a circle.

Starting from the first person,
every kth person is removed.

Find the last remaining person.

Example

People

1 -> 2 -> 3 -> 4 -> 5

k = 2

Result

Winner = 3

Explanation

Remove 2

↓

1 -> 3 -> 4 -> 5

Remove 4

↓

1 -> 3 -> 5

Remove 1

↓

3 -> 5

Remove 5

↓

3

Winner = 3

Algorithm

1. Reach the last node.
2. Count k persons.
3. Delete the kth person.
4. Continue from the next person.
5. Repeat until one node remains.

Edge Cases

✔ Empty List
✔ Single Person
✔ k = 1
✔ k > Total Persons

Time  : O(n × k)

Space : O(1)

Interview Points

✔ Uses Singly Circular Linked List.

✔ After every deletion,
counting starts from the next person.

✔ Last remaining node is the winner.

✔ One of the most famous
Circular Linked List interview questions.

Revision Trick

Count k

↓

Delete kth

↓

Move Next

↓

Repeat

↓

Winner

*/