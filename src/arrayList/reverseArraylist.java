package arrayList;

import java.util.ArrayList;

public class reverseArraylist {

    // ArrayList ko reverse karega
    static void reverse(ArrayList<Integer> list) {

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(1);

        System.out.println("Original List = " + list);

        reverse(list);

        System.out.println("Reversed List = " + list);
    }
}

/*
Reverse ArrayList

Definition
• ArrayList ke elements ko reverse order me arrange karta hai.

Working
• Ek pointer starting se aur ek ending se lo.
• Dono elements ko swap karo.
• Dono pointers ko center ki taraf move karo.
• Jab tak left < right ho, process repeat karo.

Key Points
• Two Pointer approach use hoti hai.
• Extra ArrayList ki zarurat nahi hoti.
• Original ArrayList modify ho jati hai.
• In-place reverse hota hai.

Edge Cases
• Empty ArrayList
• Single element
• Duplicate elements
• Even number of elements
• Odd number of elements

Time Complexity : O(n)
Space Complexity : O(1)

Revision
• left = 0
• right = size - 1
• Swap elements
• Move both pointers
• Repeat till left < right
*/