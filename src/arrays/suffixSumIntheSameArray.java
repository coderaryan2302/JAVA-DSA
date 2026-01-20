package arrays;
import java.util.Scanner;
public class suffixSumIntheSameArray {
    static void suffixSum(int arr[]){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i+1]+arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("suffix sum array");
        suffixSum(arr);
        int n=arr.length;
        for (int i = n-1; i>=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
