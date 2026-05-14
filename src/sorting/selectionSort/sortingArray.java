package sorting.selectionSort;
import java.util.Scanner;
public class sortingArray {

    static void sorting(int arr []){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;                              // assume first unsorted element is minimum
            for (int j = i + 1 ; j < arr.length; j++) {    // start from next element because left part is already sorted
                if (arr[j] < arr[minIndex]) {              // update minimum index if smaller element is found
                    minIndex = j;
                }
            }
            if (minIndex != i) {                      // swap only if minimum element is not already at correct position
                int temp = arr[i];                    // swap minimum element with current element
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int arr [] = new int [n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sorting(arr);
        System.out.println("Sorted array is ascending order : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Sorted array is descending order : ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}


/*
SELECTION SORT

Definition:
- Har round me smallest element find karta hai
- Fir usko correct position par swap karta hai

Time Complexity:
- Best Case    : O(n²)
- Average Case : O(n²)
- Worst Case   : O(n²)

Space Complexity:
- O(1)

Stable:
- No

In-Place:
- Yes

Advantages:
- Simple logic
- Swaps kam karta hai
- Extra memory use nahi karta

Disadvantages:
- Speed slow hoti hai
- Large arrays ke liye efficient nahi
*/