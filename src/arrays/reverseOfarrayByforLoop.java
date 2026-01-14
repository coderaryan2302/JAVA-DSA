package arrays;
import java.util.Scanner;
public class reverseOfarrayByforLoop {

    // Ye function array ko reverse karke dusre array me store karta hai
    static void reversing(int arr[], int ansarr2[]) {
        int j=0;                                        // arr2 ka index 0 se start hoga
        for (int i = arr.length - 1; i >= 0; i--) {     // i last index se start hoke 0 tak jayega
            ansarr2[j] = arr[i];                           // arr ke last element ko arr2 ke starting me store kar rahe hai
            j++;                                        // arr2 ka index aage badha rahe hai
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int ansarr2[] = new int[size];

        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("after reversing");
        reversing(arr, ansarr2);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(ansarr2[j] + " ");
        }
    }
}