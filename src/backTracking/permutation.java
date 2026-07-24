package backTracking;

import java.util.ArrayList;

public class permutation {

    // Method 1 : String + Recursion
    static void permutationMethod1(String str, String ans) {

        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);

            permutationMethod1(remaining, ans + ch);
        }
    }

    // Method 2 : Visited Array + Backtracking
    static void permutationMethod2(int[] nums) {

        helperMethod2(nums, new boolean[nums.length], new ArrayList<>());
    }

    static void helperMethod2(int[] nums, boolean[] visited, ArrayList<Integer> list) {

        if (list.size() == nums.length) {
            System.out.println(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!visited[i]) {

                visited[i] = true;
                list.add(nums[i]);

                helperMethod2(nums, visited, list);

                list.remove(list.size() - 1);   // Backtracking
                visited[i] = false;
            }
        }
    }

    // Method 3 : Swap + Backtracking
    static void permutationMethod3(int[] nums, int index) {

        if (index == nums.length) {

            for (int value : nums)
                System.out.print(value + " ");

            System.out.println();
            return;
        }

        for (int i = index; i < nums.length; i++) {

            swap(nums, index, i);

            permutationMethod3(nums, index + 1);

            swap(nums, index, i);      // Backtracking
        }
    }

    static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        String str = "ABC";
        int[] nums = {1, 2, 3};

        System.out.println("Method 1\n");
        permutationMethod1(str, "");

        System.out.println("\nMethod 2\n");
        permutationMethod2(nums);

        System.out.println("\nMethod 3\n");
        permutationMethod3(nums, 0);
    }
}

/*

Permutation

Definition

• Permutation me elements har possible order me arrange hote hain.
• Order matter karta hai.

Example

Input : ABC

Output :
ABC ACB BAC BCA CAB CBA

Total = 3! = 6

Formula

• Total Permutations = N!

Methods

Method 1 : String + Recursion
• Beginners ke liye best.
• Character pick karke remaining string par recursion.

Method 2 : Visited Array + Backtracking
• Sabse common interview approach.
• Visited array use hota hai.

Method 3 : Swap + Backtracking
• Sabse optimized.
• Extra visited array nahi lagta.

Method 1

Approach

1. Ek character select karo.
2. Remaining string banao.
3. Answer me add karo.
4. Recursive call.

Base Case

str.isEmpty()

• Answer print karo.

Method 2

Approach

1. Unvisited element pick karo.
2. Visited mark karo.
3. List me add karo.
4. Recursive call.
5. Remove karke unvisited karo.

Base Case

list.size() == nums.length

• List print karo.

Method 3

Approach

1. Current index fix karo.
2. Har element se swap karo.
3. Recursive call.
4. Swap back (Backtracking).

Base Case

index == nums.length

• Array print karo.

Time Complexity

• O(N × N!)

Space Complexity

• O(N)

Advantages

• Backtracking ka important concept.
• Method 3 fastest aur memory efficient hai.

Disadvantages

• Sabhi permutations generate karta hai.
• Large input ke liye slow.

Applications

• String Problems
• Array Problems
• Password Generation
• Puzzle Solving
• Backtracking

*/