package arrays;
import java.util.Scanner;
public class maxAndminValueofArraywithoutArraysorting {


   static void maximum(int arr[]) {
       int max = arr[0];
       for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
       }
        System.out.println("max is " + max );
   }

    static void minimum(int arr[]) {
       int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min is " + min);
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

       System.out.println("maximum elements ");
        maximum(arr);
       System.out.println("minimum elements");
        minimum(arr);
    }
}

