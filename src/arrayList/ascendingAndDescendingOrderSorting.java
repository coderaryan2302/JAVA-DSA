package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ascendingAndDescendingOrderSorting {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(1);

        System.out.println("Original List = " + list);

        // Ascending Order Sorting
        Collections.sort(list);

        System.out.println("Ascending Order = " + list);

        // Descending Order Sorting
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Descending Order = " + list);
    }
}

/*
Ascending and Descending Order Sorting (ArrayList)

Definition
• ArrayList ke elements ko ascending ya descending order me sort karta hai.

Working
• Collections.sort(list) ascending order me sort karta hai.
• Collections.sort(list, Collections.reverseOrder()) descending order me sort karta hai.

Key Points
• Collections.sort() ek inbuilt method hai.
• reverseOrder() descending sorting ke liye use hota hai.
• Original ArrayList modify ho jati hai.

Edge Cases
• Empty ArrayList
• Single element
• Duplicate elements
• Negative numbers
• Already sorted ArrayList

Time Complexity : O(n log n)
Space Complexity : O(1)

Revision
• Collections.sort(list)
• Ascending Order

• Collections.sort(list, Collections.reverseOrder())
• Descending Order
*/