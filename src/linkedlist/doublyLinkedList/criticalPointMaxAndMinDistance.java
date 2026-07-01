package linkedlist.doublyLinkedList;

public class criticalPointMaxAndMinDistance {

    /* Doubly Linked List Node */

    static class Node {
        int value;
        Node next;
        Node prev;

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

            head = head.next;          // Move forward
        }

        System.out.println();
    }

    /* Find minimum & maximum distance between critical points */

    static class Solution {

        public int[] criticalPoints(Node head) {

            int[] ans = {-1, -1};

            if (head == null || head.next == null || head.next.next == null)
                return ans;

            Node temp = head.next;      // Start from 2nd node

            int index = 1;
            int firstCP = -1;
            int prevCP = -1;

            int minDist = Integer.MAX_VALUE;
            int maxDist = -1;

            while (temp.next != null) {

                boolean isMax = temp.value > temp.prev.value &&
                        temp.value > temp.next.value;

                boolean isMin = temp.value < temp.prev.value &&
                        temp.value < temp.next.value;

                if (isMax || isMin) {

                    if (firstCP == -1) {

                        firstCP = index;        // First critical point

                    } else {

                        minDist = Math.min(minDist, index - prevCP);
                        maxDist = index - firstCP;
                    }

                    prevCP = index;             // Update previous CP
                }

                temp = temp.next;
                index++;
            }

            if (maxDist == -1)
                return ans;

            ans[0] = minDist;
            ans[1] = maxDist;

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        /*
        5 <-> 3 <-> 1 <-> 2 <-> 5 <-> 1 <-> 2
        Critical Points : 1, 5, 1
        */

        Node first = new Node(5);
        Node second = new Node(3);
        Node third = new Node(1);
        Node fourth = new Node(2);
        Node fifth = new Node(5);
        Node sixth = new Node(1);
        Node seventh = new Node(2);

        first.next = second;

        second.prev = first;
        second.next = third;

        third.prev = second;
        third.next = fourth;

        fourth.prev = third;
        fourth.next = fifth;

        fifth.prev = fourth;
        fifth.next = sixth;

        sixth.prev = fifth;
        sixth.next = seventh;

        seventh.prev = sixth;

        System.out.println("Original Doubly Linked List");
        display(first);

        int[] ans = obj.criticalPoints(first);

        System.out.println("\nMinimum Distance : " + ans[0]);
        System.out.println("Maximum Distance : " + ans[1]);
    }
}

/*

Critical Points (LeetCode 2058)

A node is Critical if it is:

✔ Local Maximum
✔ Local Minimum

Conditions

Local Max
curr > prev && curr > next

Local Min
curr < prev && curr < next

Algorithm

1. Start from second node.
2. Check every node.
3. Store first critical point.
4. Update minimum distance using previous critical point.
5. Update maximum distance using first critical point.

Need at least 2 Critical Points,
otherwise return {-1, -1}.

Example

5 <-> 3 <-> 1 <-> 2 <-> 5 <-> 1 <-> 2

Critical Points
Index : 2, 4, 5

Minimum Distance = 1
Maximum Distance = 3

Edge Cases

✔ Empty List
✔ One / Two Nodes
✔ No Critical Point
✔ One Critical Point
✔ Multiple Critical Points

Time  : O(n)
Space : O(1)

Interview Point

✔ Head and Tail are never critical.
✔ Only First & Previous Critical Point are enough.
✔ No extra array/list required.

*/