package arrays;
import java.util.Scanner;
public class sumandproductofelements {

   static void sum(int arr[]) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of elements " + sum);
    }

    static void product(int arr[]) {
        int product=1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        System.out.println("product of elements " + product);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter elements ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sum(arr);
        product(arr);
    }
}