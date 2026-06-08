package binarySearch;
import java.util.Scanner;
public class FIndPeakElements {

    static int findPeak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("invalid array size");
            return;
        }

        int arr [] = new int[n];

        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr);
        System.out.println("Peak element: " + arr[peakIndex]);
        System.out.println("Peak index: " + peakIndex);
    }
}


/*
Peak Element using Binary Search
Peak Element: An element greater than its adjacent elements.

Examples:

1 2 5 3 1
    ^
Peak = 5

1 2 3 4 5
        ^
Peak = 5

5 4 3 2 1
^
Peak = 5

1 3 2 5 4
  ^   ^
Peaks = 3, 5
This algorithm may return any one peak.

How it works:
1. Find the middle element.
2. If arr[mid] < arr[mid + 1], move to the right half.
3. Otherwise, move to the left half (including mid).
4. Repeat until start == end.
5. The final index will be a peak element.

Works for:
- Increasing arrays
- Decreasing arrays
- Arrays with one or more peaks

Limitation:
Adjacent elements should be distinct.

Examples:
1 2 2 1
5 5 5 5
1 3 3 3 1

Assumption:
arr[i] != arr[i + 1]

Time Complexity: O(log n)
Space Complexity: O(1)
*/

