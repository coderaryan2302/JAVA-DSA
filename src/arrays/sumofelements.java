package arrays;
import java.util.Scanner;
public class sumofelements {

   static void demosum(int arr[]) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
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
        System.out.println("sum of elements ");
        demosum(arr);
    }
}