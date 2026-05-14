package sorting.bubbleSort;
import java.util.Scanner;
public class sortingArray {

    static void sorting(int arr []){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {   // last elements are already sorted so we can ignore them
                if (arr[j] > arr[j+1]) {                  // compare adjacent elements and swap if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
