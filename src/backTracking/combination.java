package backTracking;

import java.util.ArrayList;

public class combination {

    // Method 1 : String + Recursion
    static void combinationMethod1(String str, String ans, int index) {

        if (index == str.length()) {
            if (!ans.isEmpty()) System.out.println(ans);
            return;
        }

        combinationMethod1(str, ans + str.charAt(index), index + 1); // Pick
        combinationMethod1(str, ans, index + 1);                      // Not Pick
    }

    // Method 2 : Pick / Not Pick
    static void combinationMethod2(int[] nums) {

        helperMethod2(nums, 0, new ArrayList<>());
    }

    static void helperMethod2(int[] nums, int index, ArrayList<Integer> list) {

        if (index == nums.length) {
            if (!list.isEmpty()) System.out.println(list);
            return;
        }

        list.add(nums[index]);                         // Pick
        helperMethod2(nums, index + 1, list);

        list.remove(list.size() - 1);                  // Backtracking
        helperMethod2(nums, index + 1, list);          // Not Pick
    }

    // Method 3 : Start Index + Backtracking
    static void combinationMethod3(int[] nums) {

        helperMethod3(nums, 0, new ArrayList<>());
    }

    static void helperMethod3(int[] nums, int start, ArrayList<Integer> list) {

        if (!list.isEmpty()) System.out.println(list);

        for (int i = start; i < nums.length; i++) {

            list.add(nums[i]);                         // Pick
            helperMethod3(nums, i + 1, list);
            list.remove(list.size() - 1);              // Backtracking
        }
    }

    public static void main(String[] args) {

        String str = "ABC";
        int[] nums = {1, 2, 3};

        System.out.println("Method 1\n");
        combinationMethod1(str, "", 0);

        System.out.println("\nMethod 2\n");
        combinationMethod2(nums);

        System.out.println("\nMethod 3\n");
        combinationMethod3(nums);
    }
}

/*

Combination

Definition

• Combination me elements select hote hain.
• Order matter nahi karta.

Example

Input : ABC

Output :
A B C AB AC BC ABC

Formula

• nCr = n! / (r! × (n-r)!)

Methods

Method 1 : String + Recursion
• Pick / Not Pick approach.
• Beginners ke liye best.

Method 2 : Pick / Not Pick
• Sabse common Backtracking method.
• Interview me bahut use hota hai.

Method 3 : Start Index + Backtracking
• LeetCode standard.
• Combination Sum aur Subsets me use hota hai.

Method 1

Approach

1. Character Pick karo.
2. Recursive call.
3. Character Skip karo.
4. Recursive call.

Base Case

index == str.length()

• Empty answer ko skip karke print karo.

Method 2

Approach

1. Element Pick karo.
2. Recursive call.
3. Remove karo (Backtracking).
4. Not Pick karke recursive call.

Base Case

index == nums.length

• Empty list ko skip karke print karo.

Method 3

Approach

1. Current combination print karo.
2. Remaining elements par loop chalao.
3. Element Pick karo.
4. Next index se recursive call.
5. Backtracking.

Base Case

• Alag base case nahi hai.
• Loop khatam hote hi recursion stop ho jata hai.

Time Complexity

• O(2^N)

Space Complexity

• O(N)

Advantages

• Easy to understand.
• Backtracking ka basic concept clear hota hai.
• Method 3 duplicate combinations nahi banata.

Disadvantages

• Sabhi possibilities explore karta hai.

Applications

• Combination Sum
• Subsets
• Team Selection
• Password Generation
• Backtracking

*/