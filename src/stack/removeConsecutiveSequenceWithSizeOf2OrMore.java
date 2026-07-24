package stack;

import java.util.Stack;

public class removeConsecutiveSequenceWithSizeOf2OrMore {

    public static int[] remove(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        int i = 0;

        while (i < arr.length) {

            if (stack.isEmpty() || stack.peek() != arr[i]) {

                stack.push(arr[i]);
                i++;

            } else {

                int value = arr[i];

                while (i < arr.length && arr[i] == value) {
                    i++;
                }

                stack.pop();      // Remove previous occurrence
            }
        }

        int[] result = new int[stack.size()];

        for (int i1 = result.length - 1; i1 >= 0; i1--) {
            result[i1] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};

        int[] answer = remove(arr);

        System.out.print("Result : ");

        for (int value : answer) {
            System.out.print(value + " ");
        }
    }
}

/*

Remove Consecutive Sequence (Size ≥ 2)

Definition

• Array se sabhi Consecutive Duplicate Elements (Size 2 ya usse zyada)
  ko Remove karna hota hai.
• Sirf Unique Consecutive Elements Result me bachte hain.

Concept Used

• Stack
• Array Traversal

Main Logic

• Array ko Left se Right Traverse karo.
• Agar Current Element Stack Top se Different ho to Push karo.
• Agar Same ho to poori Duplicate Sequence Skip karo.
• Previous Same Element ko bhi Stack se Remove kar do.
• End me Stack ke Elements hi Final Answer hote hain.

Example

Input

1 2 2 3 10 10 10 4 4 4 5 7 7 2

Output

1 3 5 2

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Single Traversal Solution
• Consecutive Duplicate Groups Efficiently Remove karta hai.
• Stack ki madad se Previous Element Easily Track hota hai.

Disadvantages

• Extra Stack ki Need hoti hai.
• Sirf Consecutive Duplicates ko Remove karta hai.

Applications

• Data Cleaning
• Sequence Compression
• String / Array Processing
• Stack Based Interview Problems

*/