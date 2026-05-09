package recursion;
import java.util.Scanner;
public class arrayIsSorted {
    static boolean isSorted(int[] arr, int idx) {
        if (idx >= arr.length - 1) {           // Base case: if we have reached the end of the array, it is sorted
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {         // self work: compare current element with the next element
            return false;
        }
        return isSorted(arr, idx + 1);    // Recursive call: check the rest of the array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr, 0)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
}