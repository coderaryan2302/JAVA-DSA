package hashSet;

import java.util.HashSet;

public class containsDuplicate {

    // LeetCode 217
    static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num))
                return true;            // Duplicate Found

            set.add(num);
        }

        return false;
    }

    // LeetCode 219
    static boolean containsDuplicateII(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i]))
                return true;            // Duplicate Found

            set.add(nums[i]);

            if (i >= k)
                set.remove(nums[i - k]);    // Remove Out of Window Element
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println("217 : " + containsDuplicate(nums));
        System.out.println("219 : " + containsDuplicateII(nums, 3));
    }
}

/*

Contains Duplicate (217) & Contains Duplicate II (219)

Definition

217

• Check karna hai ki Array me koi Duplicate Element hai ya nahi.

219

• Check karna hai ki Duplicate Elements ki Distance k ya usse kam ho.

Condition

| i - j | ≤ k

Example

217

Input

[1,2,3,1]

Output

true

219

Input

[1,2,3,1]

k = 3

Output

true

Concept Used

217

• HashSet

219

• HashSet
• Sliding Window

Main Logic

217

• Har Element ko HashSet me store karo.
• Agar Element pehle se present ho to Duplicate mil gaya.

219

• Size k ki Sliding Window maintain karo.
• Duplicate current window ke andar mila to true return karo.
• Window ke bahar wale Element ko remove karte raho.

Algorithm

217

1. HashSet banao.
2. Array traverse karo.
3. Duplicate mile to true return karo.
4. Warna Element add karo.
5. End tak duplicate na mile to false return karo.

219

1. HashSet banao.
2. Array traverse karo.
3. Duplicate current window me mile to true return karo.
4. Current Element add karo.
5. Agar Window size k se badi ho jaye to oldest Element remove karo.
6. End tak duplicate na mile to false return karo.

Difference

217

• Duplicate kahin bhi ho sakta hai.

219

• Duplicate sirf k distance ke andar hona chahiye.

Time Complexity

217

• O(n)

219

• O(n)

Space Complexity

217

• O(n)

219

• O(k)

Advantages

• Fast Searching
• Simple Logic
• O(n) Solution
• Interview Favourite

Disadvantages

• Extra HashSet Space use hoti hai.

Applications

• Duplicate Detection
• Sliding Window Problems
• Data Validation
• Searching

*/