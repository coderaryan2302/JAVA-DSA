package recursion;
import java.util.Scanner;
public class sumOfElementsOfArray {

    static int sum (int[] arr,int index){
        if(index == arr.length){                        // base case : when index reaches end of array, return 0 as sum of empty array is 0
            return 0;
        }
        int ans = sum(arr,index+1);               // recursive work: sum of elements from index+1 to end of array
        return ans+arr[index];                          // self work: add current element to the sum obtained from recursive call
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();

        if  (n <= 0) {
            System.out.println("Invalid array size");
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