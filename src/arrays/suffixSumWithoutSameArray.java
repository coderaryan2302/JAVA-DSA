package arrays;
import java.util.Scanner;
public class suffixSumWithoutSameArray {
    static void suffixSum(int arr[] , int anssuffix[]){
        int n=arr.length;
        anssuffix[n-1]=arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            anssuffix[i]=anssuffix[i+1]+arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int anssuffix[]=new int[size];

        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("suffix sum array");
        suffixSum(arr,anssuffix);
        int n=arr.length;
        for (int i = n-1; i >= 0 ; i--) {
            System.out.println(anssuffix[i]);
        }

    }
}
