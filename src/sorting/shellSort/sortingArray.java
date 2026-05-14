package sorting.shellSort;
import java.util.Scanner;
public class sortingArray {

    static void sorting(int arr[]) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {      // gap half karte rahenge
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >= gap; j = j - gap) {
                    if (arr[j - gap] > arr[j]) {                // agar piche wala bada hai
                        int temp = arr[j];
                        arr[j] = arr[j - gap];
                        arr[j - gap] = temp;
                    }
                }
            }
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
SHELL SORT

Definition:
- Insertion Sort ka improved version hai
- Gap method use karke sorting karta hai

Time Complexity:
- Best Case    : O(n log n)
- Average Case : O(n^1.5)
- Worst Case   : O(n²)

Space Complexity:
- O(1)

Stable:
- No

In-Place:
- Yes

Advantages:
- Insertion Sort se faster
- Medium size arrays me efficient
- Extra memory use nahi karta

Disadvantages:
- Exact complexity fixed nahi hoti
- Large datasets ke liye best option nahi
*/