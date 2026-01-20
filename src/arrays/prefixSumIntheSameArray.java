package arrays;
import java.util.Scanner;
public class prefixSumIntheSameArray {

    static void prefixSum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        prefixSum(arr);
        System.out.println("prefix sum array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
