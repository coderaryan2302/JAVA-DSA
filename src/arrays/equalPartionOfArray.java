package arrays;
import java.util.Scanner;
public class equalPartionOfArray {
    public static int findtotalSum(int arr[]){            // total sum find ho gya hai
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static boolean equalPartionSum(int arr[]){
        int totalSum =  findtotalSum(arr);               // total sum ko store krwa diye

        int prefixSum =0;
        for(int i = 0; i < arr.length; i++){
            prefixSum=prefixSum+arr[i];                  // prefix sum nikal rhe hai current i ke value ke acc.

            int suffixSum = totalSum-prefixSum;          // suffix sum nikal rhe hai
            if(suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("equal partion of array is = " + equalPartionSum(arr));
    }
}
