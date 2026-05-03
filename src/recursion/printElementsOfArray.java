package recursion;
import java.util.Scanner;
public class printElementsOfArray {

    static void printArray(int[] arr , int index){
        if (index == arr.length){                            // base case
            return;
        }
        else{
            System.out.print(arr[index] + " ");             // self work ...   arr[0] ko khud print kiya
            printArray(arr, index+1);                 // recursive work
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid size! Array cannot be negative");
            return;
        }
        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }

        int arr[]=new int[n];

        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index = 0 ;

        System.out.println("print array");
        printArray(arr, index);
    }
}
