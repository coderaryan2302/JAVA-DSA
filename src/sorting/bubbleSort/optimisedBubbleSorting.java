package sorting.bubbleSort;
import java.util.Scanner;
public class optimisedBubbleSorting {

    static void sorting(int arr []){
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;                         // flag to check if any swapping occurs in the current pass
            for (int j = 0; j < arr.length-i-1; j++) {    // last elements are already sorted so we can ignore them
                if (arr[j] > arr[j+1]) {                  // compare adjacent elements and swap if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;                          // set flag to true if swapping occurs
                }
            }
            if (!flag) {                                  // if no swapping occurred in the current pass, array is sorted
                return;                                   // so we can exit the loop early
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
BUBBLE SORT

Definition:
- Adjacent elements ko compare karta hai
- Agar left element bada ho to swap karta hai
- Har pass ke baad largest element end me chala jata hai

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
- Easy to understand
- Beginner friendly
- Simple implementation

Disadvantages:
- Large arrays me slow
- Bahut comparisons aur swaps karta hai
*/

