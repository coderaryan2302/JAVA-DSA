package arrays;
import java.util.Scanner;
public class reverseOfarrayByswapping {
   static void reverseOfarray(int arr[]){
       int i=0;
       int j= arr.length-1;
       while(i<j){
           int temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;
           i++;
           j--;
           }
       }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter elements");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Reversed array");
        reverseOfarray(arr);
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
    }
}
