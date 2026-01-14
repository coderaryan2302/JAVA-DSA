package arrays;
import java.util.Scanner;
public class noOftripletFortargetSum {
    static void targetSum(int arr[],int x){
        int ans=0;
        for (int i=0; i<arr.length ; i++) {
            for (int j=i+1; j<arr.length ; j++) {
                for (int k=j+1; k<arr.length ; k++) {
                    if(arr[i]+arr[j]+arr[k]==x){
                        ans++;
                        System.out.println("(" + arr[i] +"," + arr[j] +"," + arr[k] +")");
                    }
                }
            }
        }
        System.out.println("target sum = " + ans);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();

        int arr[]=new int[size];

        System.out.println("enter elements");
        for (int i=0; i< arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target x = ");
        int x= sc.nextInt();

        targetSum(arr,x);
    }
}
