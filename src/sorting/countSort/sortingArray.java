package sorting.countSort;
import java.util.Scanner;
public class sortingArray {

    static void sorting(int arr[]) {
        int min = arr[0];                              // array ki sabse choti value store karega
        int max = arr[0];                              // array ki sabse badi value store karega

        for (int i = 1; i < arr.length; i++) {         // min aur max value find karne ke liye loop
            if (arr[i] < min) {                        // agar current element min se chota hai
                min = arr[i];
            }
            if (arr[i] > max) {                        // agar current element max se bada hai
                max = arr[i];
            }
        }

        int frequency[] = new int[max - min + 1];      // frequency count store karne ke liye array

        for (int i = 0; i < arr.length; i++) {         // array ke sabhi elements traverse karo
            frequency[arr[i] - min]++;                 // current element ki frequency increase karo
        }

        int index = 0;                                 // original array ka starting index

        for (int i = 0; i < frequency.length; i++) {   // frequency array traverse karo
            while (frequency[i] > 0) {                 // jab tak current value ki frequency available hai
                arr[index] = i + min;                  // sorted value original array me store karo
                index++;                               // next index par move karo
                frequency[i]--;                        // current value ki frequency decrease karo
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter elements ");
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
COUNTING SORT

Definition:
- Elements ki frequency count karta hai
- Comparison use kiye bina sorting karta hai

Time Complexity:
- Best Case    : O(n + k)
- Average Case : O(n + k)
- Worst Case   : O(n + k)

Space Complexity:
- O(k)

Stable:
- Yes

In-Place:
- No

Advantages:
- Bahut fast sorting
- Small range integers ke liye best
- Comparison based sorting nahi hai

Disadvantages:
- Extra memory use karta hai
- Large range values ke liye suitable nahi
*/