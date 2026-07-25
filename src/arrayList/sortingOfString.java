package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortingOfString {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("b");
        list.add("d");
        list.add("c");
        list.add("a");

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
Sorting of String (ArrayList)

Definition
• ArrayList me stored String elements ko alphabetical order me sort karta hai.

Working
• Collections.sort(list) ascending order me sort karta hai.
• Collections.sort(list, Collections.reverseOrder()) descending order me sort karta hai.

Key Points
• Strings lexicographical (dictionary) order me sort hote hain.
• Comparison character by character hoti hai.
• Agar pehla character same ho to agla character compare hota hai.
• Original ArrayList modify ho jati hai.

Example
• "Wallah" vs "Welcome"

W = W (Same)

Next Character
A < E

Result
• Wallah
• Welcome

Edge Cases
• Empty ArrayList
• Single String
• Duplicate Strings
• Uppercase aur Lowercase letters
• Different length ke Strings

Time Complexity : O(n log n)
Space Complexity : O(1)

Revision
• Collections.sort(list)
• Ascending Order

• Collections.sort(list, Collections.reverseOrder())
• Descending Order

• String Sorting = Character by Character Comparison
*/