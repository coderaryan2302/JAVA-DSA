package binarySearch;

import java.util.Scanner;

public class chocolateDistributionProblem {

    // Check karega ki given maximum chocolates ke andar distribution possible hai ya nahi
    static boolean canDistribute(int[] arr, int children, int maxChocolate) {

        int childCount = 1;
        int currentChocolate = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxChocolate) {
                return false;
            }

            if (currentChocolate + arr[i] <= maxChocolate) {
                currentChocolate += arr[i];
            } else {
                childCount++;
                currentChocolate = arr[i];
            }
        }

        return childCount <= children;
    }

    // Minimum possible maximum chocolates return karega
    static int findAnswer(int[] arr, int children) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        int answer = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (canDistribute(arr, children, mid)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter chocolates in packets:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        if (children <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int answer = findAnswer(arr, children);

        System.out.println("Minimum Possible Maximum Chocolates = " + answer);
    }
}

/*
Chocolate Distribution Problem

Definition
• Chocolate packets ko children me is tarah distribute karna hota hai ki kisi bhi child ko milne wali maximum chocolates minimum ho.

Working
• Binary Search se answer search karo.
• Har mid value ke liye check karo ki distribution possible hai ya nahi.
• Agar possible ho to aur chhota answer try karo.
• Warna bada answer try karo.
• Last valid minimum value hi answer hoti hai.

Key Points
• Binary Search answer par lagti hai.
• Packets ko tod nahi sakte.
• Packets ka order same rehta hai.
• Har child ko continuous packets milte hain.

Edge Cases
• Invalid input (size <= 0)
• Invalid number of children
• One packet
• One child
• Children > Number of packets

Time Complexity : O(n log(sumOfPackets))
Space Complexity : O(1)

Revision
• Search Space = Maximum Packet to Total Sum
• Check current answer
• Possible → Search Left
• Not Possible → Search Right
• Return minimum possible maximum chocolates
*/