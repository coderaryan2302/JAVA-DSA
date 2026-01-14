package arrays;
import java.util.Scanner;
public class changeArrayvalue {
    static void changeValue(int arr[]) {
        for (int i=0; i<arr.length;i++) {
            arr[i]=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("after changing the value ");
        changeValue(arr);
        for (int i=0 ; i< arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
