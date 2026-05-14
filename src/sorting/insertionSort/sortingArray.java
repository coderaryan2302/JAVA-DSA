package sorting.insertionSort;
import java.util.Scanner;
public class sortingArray {

    static void sorting(int arr []){
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {           // move current element to correct position
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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
INSERTION SORT

Definition:
- Current element ko correct position par insert karta hai
- Playing cards arrange karne jaisa kaam karta hai

Time Complexity:
- Best Case    : O(n)
- Average Case : O(n²)
- Worst Case   : O(n²)

Space Complexity:
- O(1)

Stable:
- Yes

In-Place:
- Yes

Advantages:
- Small arrays me fast
- Nearly sorted arrays me efficient
- Easy implementation

Disadvantages:
- Large arrays me slow
- Bahut shifting karni pad sakti hai
*/