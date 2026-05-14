package sorting.radixSort;
import java.util.Scanner;
public class sortingArray {

    static void countingSort(int arr[], int place) {
        int output[] = new int[arr.length];        // final sorted elements temporarily store karne ke liye array banaya hai
        int count[] = new int[10];                 // 0 se 9 tak digits ka frequency count store karega

        // STEP 1 : current digit count karna
        for (int i = 0; i < arr.length; i++) {
            int digit = (arr[i] / place) % 10;       // current place value ka digit nikal rahe hain
            count[digit]++;                        // jis digit mila uska count increase kar diya
        }

        // STEP 2 : prefix sum banana
        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];    // previous counts add karke final positions calculate kar rahe hain
        }

        // STEP 3 : correct position par elements rakhna
        for (int i = arr.length - 1; i >= 0; i--) {      // reverse traversal stable sorting maintain karne ke liye
            int digit = (arr[i] / place) % 10;             // current element ka digit nikal rahe hain
            int position = count[digit] - 1;             // output array me correct index find kar rahe hain
            output[position] = arr[i];                   // element ko correct sorted position par rakh diya
            count[digit]--;                              // same digit ke next element ke liye next position ready kar rahe hain
        }

        // STEP 4 : original array update karna
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];                         // sorted data ko original array me copy kar rahe hain
        }
    }

    static void sorting(int arr[]) {
        if (arr.length == 0) {                         // agar array empty hai to sorting ki zarurat nahi
            return;
        }

        int min = arr[0];                              // smallest value store karega
        int max = arr[0];                              // largest value store karega

        // STEP 1 : minimum aur maximum element find karna
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];                         // smallest element update kar rahe hain
            }
            if (arr[i] > max) {
                max = arr[i];                         // largest element update kar rahe hain
            }
        }

        // STEP 2 : negative numbers ko positive banana
        if (min < 0) {                               // agar negative values present hain
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] - min;               // sab values me min subtract karke positive bana rahe hain
            }
            max = max - min;                         // maximum value bhi update kar rahe hain
        }

        // STEP 3 : har digit place par counting sort lagana
        for (int place = 1; max / place > 0; place *= 10) {

            // place = 1  -> unit digit
            // place = 10 -> tens digit
            // place = 100 -> hundreds digit

            countingSort(arr, place);                  // current digit ke basis par sorting kar rahe hain
        }

        // STEP 4 : original negative values wapas restore karna
        if (min < 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + min;                // original values restore kar rahe hain
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sorting(arr);

        System.out.println("Ascending Order : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Descending Order : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
RADIX SORT

Definition:
- Digits ke basis par sorting karta hai
- Usually Counting Sort internally use hota hai

Time Complexity:
- Best Case    : O(nk)
- Average Case : O(nk)
- Worst Case   : O(nk)

Space Complexity:
- O(n + k)

Stable:
- Yes

In-Place:
- No

Advantages:
- Large integers ke liye fast
- Comparison use nahi karta
- Stable sorting algorithm

Disadvantages:
- Extra memory use karta hai
- Sirf specific data types ke liye useful
*/