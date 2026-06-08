package binarySearch;
import java.util.Scanner;
public class chocolateDistributionProblem {

    static boolean canDistribute(int[] arr, int children, int maxChocolate) {
        int childCount = 1;
        int currentChocolate = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxChocolate) {       // Agar kisi packet me hi limit se zyada chocolates hain
                return false;
            }
            if (currentChocolate + arr[i] <= maxChocolate) {       // Current child ko aur chocolates de sakte hain
                currentChocolate += arr[i];
            }
            else {                  // Naye child ko chocolates deni padengi
                childCount++;
                currentChocolate = arr[i];
            }
        }
        return childCount <= children;
    }

    static int findAnswer(int[] arr, int children) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {         // Search space find karna
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        int answer = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canDistribute(arr, children, mid)) {
                answer = mid;
                end = mid - 1;      // aur chhota answer dhoondo
            } else {
                start = mid + 1;    // answer bada karo
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("invalid array size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter chocolates in packets:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        if (children <= 0) {
            System.out.println("Invalid number of children");
            return;
        }

        System.out.println("Minimum possible maximum chocolates = " + findAnswer(arr, children));
    }
}


/*
Pattern:
Answer Search Binary Search

Logic:
Find Minimum Possible Maximum Chocolates.

If Current Answer Possible,
Try Smaller Answer.

If Not Possible,
Try Bigger Answer.

Complexity:
Time -> O(n log(sum))
Space -> O(1)
*/