package binarySearch;
import java.util.Scanner;
public class targetFindingInRotatedArray {

    static void findTarget(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Target found
            if (arr[mid] == target) {
                System.out.println("target found at index: " + mid);
                return;
            }

            // Duplicate handling
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }

            // Left half sorted
            else if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            // Right half sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("target not found in the array");
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
}