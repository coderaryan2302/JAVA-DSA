package sorting.quickSort;
import java.util.Scanner;
public class sortingArray {

    static int partition(int arr[], int start, int end) {
        int pivot = arr[start];                     // array ke first element ko pivot maan rahe hain jiske according elements arrange honge
        int i = start;                              // i left side me pivot se chhote ya equal elements ki boundary track karta hai
        for (int j = start + 1; j <= end; j++) {    // pivot ke next index se lekar end tak saare elements check karo
            if (arr[j] <= pivot) {                  // agar current element pivot se chhota ya equal milta hai
                i++;                                // smaller element ke liye boundary ko ek step aage badhao

                int temp = arr[i];                  // swapping ke time value ko temporarily store karo
                arr[i] = arr[j];                    // smaller element ko left side ki correct position par bhejo
                arr[j] = temp;                      // previous value ko current position par rakh do
            }
        }

        int temp = arr[start];                      // pivot ko uski final correct position par bhejne ke liye temp variable use karo
        arr[start] = arr[i];                        // pivot ko smaller elements ke baad wali position par set karo
        arr[i] = temp;                              // swapped value ko starting position par store karo
        return i;                                   // pivot ka final sorted index return karo
    }

    static void sorting(int arr[], int start, int end) {
        if (start < end) {                               // jab tak array ka part unsorted hai tab tak quick sort continue karo
            int pi = partition(arr, start, end);         // partition function pivot ko sahi jagah par set karega
            sorting(arr, start, pi - 1);            // pivot ke left side wale smaller elements ko sort karo
            sorting(arr, pi + 1, end);             // pivot ke right side wale greater elements ko sort karo
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

        sorting(arr, 0, arr.length-1);
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
QUICK SORT

Definition:
- Pivot element choose karta hai
- Small aur large elements ko alag karta hai

Time Complexity:
- Best Case    : O(n log n)
- Average Case : O(n log n)
- Worst Case   : O(n²)

Space Complexity:
- O(log n)

Stable:
- No

In-Place:
- Yes

Advantages:
- Practical use me bahut fast
- Extra memory kam use hoti hai
- Large arrays me efficient

Disadvantages:
- Worst case me performance slow ho sakti hai
- Pivot selection important hota hai
*/
