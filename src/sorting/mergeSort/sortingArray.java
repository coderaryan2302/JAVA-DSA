package sorting.mergeSort;
import java.util.Scanner;
public class sortingArray {

    static void merge(int arr[], int start, int end, int mid) {
        int leftSize = mid - start + 1;             // start se mid tak left part ka total size nikal rahe hain
        int rightSize = end - mid;                  // mid+1 se end tak right part ka total size nikal rahe hain

        int leftArr[] = new int[leftSize];          // left side ke elements temporarily store karne ke liye array bana rahe hain
        int rightArr[] = new int[rightSize];        // right side ke elements temporarily store karne ke liye array bana rahe hain

        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = arr[start + i];            // original array ke left part ke elements leftArr me copy kar rahe hain
        }

        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = arr[mid + 1 + j];         // original array ke right part ke elements rightArr me copy kar rahe hain
        }

        int i = 0, j = 0, k = start;                // i left array, j right array aur k original array ki position track karega

        while (i < leftSize && j < rightSize) {     // jab tak dono arrays me elements available hain tab tak compare karo
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];                // agar left array ka element chhota ya equal hai to original array me daal do
                i++;                                // left array ke next element par move karo
            }
            else {
                arr[k] = rightArr[j];               // agar right array ka element chhota hai to original array me daal do
                j++;                                // right array ke next element par move karo
            }
            k++;                                    // original array ki next index position par move karo
        }

        while (i < leftSize) {
            arr[k] = leftArr[i];                    // left array me bache hue elements ko original array me copy kar rahe hain
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightArr[j];                   // right array me bache hue elements ko original array me copy kar rahe hain
            j++;
            k++;
        }
    }


    static void sorting(int arr[], int start, int end) {
        if (start >= end) {                         // base case: single element ya empty part already sorted hota hai
            return;                                 // agar array me sirf ek element bacha hai to usko already sorted maan kar return karo
        }

        int mid = (start + end) / 2;                // self work: array ka middle index nikal kar array ko 2 parts me divide kar rahe hain
        sorting(arr, start, mid);                   // recursive call: left half ko recursively chhote parts me divide karke sort kar rahe hain
        sorting(arr, mid + 1, end);           // recursive call: right half ko recursively chhote parts me divide karke sort kar rahe hain
        merge(arr, start, end, mid);               // self work: left aur right dono sorted halves ko merge karke sorted array bana rahe hain
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sorting(arr, 0, arr.length - 1);
        System.out.println("Sorted array is ascending order : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Sorted array is descending order : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


/*
MERGE SORT

Definition:
- Divide and Conquer technique use karta hai
- Array ko divide aur merge karke sort karta hai

Time Complexity:
- Best Case    : O(n log n)
- Average Case : O(n log n)
- Worst Case   : O(n log n)

Space Complexity:
- O(n)

Stable:
- Yes

In-Place:
- No

Advantages:
- Fast and efficient sorting
- Large datasets ke liye accha
- Performance stable rehti hai

Disadvantages:
- Extra memory use karta hai
- Recursive calls zyada hoti hain
*/