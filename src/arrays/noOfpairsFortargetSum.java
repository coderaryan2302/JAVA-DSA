package arrays;
import java.util.Scanner;
public class noOfpairsFortargetSum {
    static void targetSum(int arr[], int x) {
        int ans = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    ans++;
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        System.out.println("total no of pairs " + ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();

        int arr[]=new int[size];

        System.out.println("enter elements");
        for (int i=0; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("target sum x = ");
            int x= sc.nextInt();

        System.out.println("no of pairs for target sum x = ");
        targetSum(arr,x);
    }
}


