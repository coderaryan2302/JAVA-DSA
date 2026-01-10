package arrays;
import java.util.Scanner;
public class changearrayvalue {
    static void changevalue(int arr[]) {
        for (int i=0; i<arr.length;i++) {
            arr[i]=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // taking input element from user
        System.out.println("enter elements ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("after changing the value ");
        changevalue(arr);
        for (int i=0 ; i< arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
