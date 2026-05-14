package sorting.bucketSort;
import java.util.Arrays;
import java.util.Scanner;
public class sortingArray {

    static void sorting(int arr[]) {
        if (arr.length == 0) {                         // agar array empty hai to function stop ho jayega
            return;
        }

        int max = arr[0];                              // pehle element ko maximum maan liya
        for (int i = 1; i < arr.length; i++) {         // maximum value find kar rahe hain
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int bucket[][] = new int[10][arr.length];      // 10 buckets banaye hain
        int count[] = new int[10];                     // har bucket ka element count store karega

        for (int i = 0; i < arr.length; i++) {
            int index = (arr[i] * 10) / (max + 1);     // bucket number calculate kiya
            bucket[index][count[index]] = arr[i];      // element bucket me store kar diya
            count[index]++;                            // bucket ka count increase kar diya
        }

        int k = 0;                                     // original array ka index

        for (int i = 0; i < 10; i++) {                 // sabhi buckets traverse karenge
            Arrays.sort(bucket[i], 0, count[i]);       // current bucket ko sort kar diya
            for (int j = 0; j < count[i]; j++) {       // sorted bucket ke elements copy karenge
                arr[k++] = bucket[i][j];               // element original array me daal diya
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter Elements :");
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

// can't handle -ve no.

/*
BUCKET SORT

Definition:
- Elements ko alag buckets me divide karta hai
- Fir buckets ko separately sort karta hai

Time Complexity:
- Best Case    : O(n + k)
- Average Case : O(n + k)
- Worst Case   : O(n²)

Space Complexity:
- O(n)

Stable:
- Yes

In-Place:
- No

Advantages:
- Uniform data me bahut fast
- Floating point values ke liye useful

Disadvantages:
- Uneven distribution me slow ho sakta hai
- Extra memory use karta hai
*/