package recursion;
import  java.util.Scanner;
public class maxElementOfArray {

    static int max(int arr [], int index){
        if(index == arr.length-1){                                   // Base case: last element
            return arr[index];
        }
        int ans = max(arr,index+1);                          // Recursive call
        return Math.max(arr[index],ans);                           // Self work: compare current element with answer
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

        System.out.println("max element = " + max(arr,index));
    }
}

