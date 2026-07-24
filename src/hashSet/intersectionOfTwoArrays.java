package hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class intersectionOfTwoArrays {

    static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> firstArray = new HashSet<>();
        HashSet<Integer> commonElements = new HashSet<>();

        // Store First Array
        for (int num : nums1) {
            firstArray.add(num);
        }

        // Find Common Elements
        for (int num : nums2) {

            if (firstArray.contains(num)) {
                commonElements.add(num);     // Duplicate Ignored
            }
        }

        // Convert HashSet to Array
        int[] result = new int[commonElements.size()];

        int index = 0;

        for (int num : commonElements) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}

/*

Intersection of Two Arrays (LeetCode 349)

Definition

• Dono Arrays ke Common Elements find karne hain.
• Answer me sirf Unique Elements hone chahiye.

Example

Input

nums1 = [1,2,2,1]

nums2 = [2,2]

Output

[2]

Concept Used

• HashSet
• Searching
• Unique Elements

Main Logic

• Pehle Array ke sabhi Elements HashSet me store karo.
• Dusre Array ko traverse karo.
• Agar Element HashSet me mile to Answer HashSet me add karo.
• HashSet automatically Duplicate Elements ignore kar deta hai.

Algorithm

1. First Array ke Elements HashSet me store karo.
2. Second Array traverse karo.
3. Common Element mile to Answer HashSet me add karo.
4. Answer HashSet ko Array me convert karo.
5. Result return karo.

Time Complexity

• O(n + m)

n = First Array Size

m = Second Array Size

Space Complexity

• O(n)

Advantages

• Fast Searching
• Automatically Removes Duplicates
• Easy Implementation
• Better than Nested Loops

Disadvantages

• Extra HashSet Space use hoti hai.

Applications

• Common Students
• Common Products
• Common IDs
• Database Comparison
• Data Filtering

*/