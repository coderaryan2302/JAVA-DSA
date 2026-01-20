package arrays;
import java.util.Scanner;
public class rangeSum {
    static void RangeSum(int arr[] , int l , int r) {

        if (l < 0 || r < 0 || l >= arr.length || r >= arr.length || l>r ) {
            System.out.println("not valid range");
        } else {
            int sum = 0;
            for (int i = l; i <= r; i++) {
                sum = sum + arr[i];
            }
            System.out.println("sum from l to r index " + sum);
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

        System.out.println("enter queries");
        int queries = sc.nextInt();

        while (queries > 0) {
            System.out.println("enter starting index = l");
            int l = sc.nextInt();
            System.out.println("enter last index = r");
            int r = sc.nextInt();
            queries--;

            RangeSum(arr, l, r);
        }
    }
}