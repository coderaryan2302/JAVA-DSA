package arrays;
import java.util.Scanner;
public class prefixSumWithoutSameArray {
    static void prefixSum (int arr[],int ansprefix[]){
       ansprefix[0]=arr[0];
        for(int i=1; i<arr.length; i++){
         ansprefix[i] = ansprefix[i-1]+arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size");
        int size=sc.nextInt();
        int arr[] = new int[size];
        int ansprefix[] = new int[size];

        System.out.println("enter array elements");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("prefix sum array");
        prefixSum(arr,ansprefix);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(ansprefix[i]);
        }
    }
}
