package arrays;
import java.util.Scanner;
public class reverseofarray {

    static void reversing(int arr[], int arr2[]) {
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("after reversing");
        reversing(arr, arr2);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr2[j] + " ");
        }
    }
}