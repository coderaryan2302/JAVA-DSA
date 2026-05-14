package sorting.heapSort;
import java.util.Scanner;
public class sortingArray {

    static void heapify(int arr[], int n, int i) {
        int max = i;                                   // current index ko max maan liya

        int left = 2 * i + 1;                          // left child index
        int right = 2 * i + 2;                         // right child index

        if (left < n && arr[left] > arr[max]) {
            max = left;                                // left child bada hai
        }

        if (right < n && arr[right] > arr[max]) {
            max = right;                               // right child bada hai
        }

        if (max != i) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;                           // swapping

            heapify(arr, n, max);                      // subtree ko fir heapify
        }
    }

    static void sorting(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);                        // heap build kar rahe hain
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;                              // root aur last element swap

            heapify(arr, i, 0);                      // remaining heap ko heapify
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sorting(arr);
        System.out.println("Ascending Order :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Descending Order :");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


/*
HEAP SORT

Definition:
- Heap Data Structure use karta hai
- Max Heap ya Min Heap bana kar sorting karta hai

Time Complexity:
- Best Case    : O(n log n)
- Average Case : O(n log n)
- Worst Case   : O(n log n)

Space Complexity:
- O(1)

Stable:
- No

In-Place:
- Yes

Advantages:
- Efficient sorting algorithm
- Extra memory use nahi karta
- Guaranteed O(n log n) performance

Disadvantages:
- Stable sorting nahi hai
- Quick Sort se practical use me kabhi kabhi slow

*/