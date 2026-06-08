package binarySearch;
import java.util.Scanner;
public class targetFindingInRotatedArray {

    static void findTarget(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                found = true;
                System.out.println("Target present at indexes:");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == target) {
                        System.out.print(i + " ");
                    }
                }
                return;
            }

            // duplicate case handling
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }

            // left half sorted
            else if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            // right half sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        if (!found) {
            System.out.println("target not found in the array");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("invalid array size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("enter rotated sorted array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target element");
        int target = sc.nextInt();

        findTarget(arr, target);
    }
}


/*
Problem: Find Target In Rotated Sorted Array.

Logic:
Find Sorted Half.
If Target Lies In That Range,
Search There.
Otherwise Search Other Half.

Duplicate Case:
arr[start] == arr[mid] == arr[end]
start++
end--

Complexity:
Average -> O(log n)
Worst -> O(n)
*/