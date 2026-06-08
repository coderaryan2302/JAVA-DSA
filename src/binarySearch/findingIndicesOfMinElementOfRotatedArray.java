package binarySearch;
import java.util.Scanner;
public class findingIndicesOfMinElementOfRotatedArray {

    static void findIndicesOfMinElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else if (arr[mid] < arr[end]) {
                end = mid;
            }
            else {
                end--;
            }
        }

        int minElement = arr[start];
        System.out.println("Minimum element is: " + minElement);

        System.out.print("Minimum element found at indices: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minElement) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter rotated sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findIndicesOfMinElement(arr);
    }
}


/*
Problem:
Find Minimum Element In Rotated Sorted Array.

Also Print All Indices Of Minimum Element.
Handles Duplicates Also.

Complexity:
Average -> O(log n)
Worst Case (Duplicates) -> O(n)

Revision:
arr[mid] > arr[end] -> Go Right
arr[mid] < arr[end] -> Go Left
arr[mid] == arr[end] -> end--
*/