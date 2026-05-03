package recursion;
import java.util.Scanner;
public class sumOfElementsOfArray {

    static int sum (int[] arr,int index){
        if(index==arr.length){                          // base case
            return 0;
        }
        int ans = sum(arr,index+1);               // recursive work
        return ans+arr[index];                          // self work
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();

        if  (n < 0) {
            System.out.println("Invalid Input");
            return;
        }
        if (n == 0) {
            System.out.println("Array is Empty");
            return;
        }

        int arr[]=new int[n];

        System.out.println("enter elements");
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }

        int index = 0;

        System.out.println("sum = " + sum(arr,index));
    }
}