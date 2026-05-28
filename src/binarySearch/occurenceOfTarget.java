package binarySearch;
import java.util.Scanner;
public class occurenceOfTarget {

    static int firstOccurence(int arr[], int target, int ans) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int lastOccurence(int arr[], int target, int ans) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
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

        System.out.println("enter sorted array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target element");
        int target = sc.nextInt();

        int ans = -1;

        int first = firstOccurence(arr, target, ans);
        int last = lastOccurence(arr, target, ans);

        int totalOccurence;

        if (first == -1) {
            totalOccurence = 0;
        } else {
            totalOccurence = last - first + 1;
        }
        System.out.println("first occurence of target is at index: " + first);
        System.out.println("last occurence of target is at index: " + last);
        System.out.println("total occurence of target is: " + totalOccurence);
    }
}

/*
array can't sorted and if array can be sorted but in descending order . this code will not work.
*/