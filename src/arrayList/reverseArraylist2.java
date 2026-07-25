package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArraylist2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(1);

        System.out.println("Original List = " + list);

        // Reverse ArrayList using inbuilt function
        Collections.reverse(list);

        System.out.println("Reversed List = " + list);
    }
}

/*
Reverse ArrayList Using Inbuilt Function

Definition
• Collections.reverse() method ArrayList ke elements ko reverse order me arrange karta hai.

Working
• Collections.reverse(list) call karo.
• Method ArrayList ko reverse kar deta hai.
• Original ArrayList modify ho jati hai.

Key Points
• Collections.reverse() ek inbuilt method hai.
• Extra ArrayList banane ki zarurat nahi hoti.
• Original ArrayList modify ho jati hai.
• Sabhi elements ka order ulta ho jata hai.

Edge Cases
• Empty ArrayList
• Single element
• Duplicate elements
• Even number of elements
• Odd number of elements

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• Collections.reverse(list)
• Original ArrayList gets reversed
*/