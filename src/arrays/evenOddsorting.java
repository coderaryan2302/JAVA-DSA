package arrays;
import java.util.Scanner;
public class evenOddsorting {
    static void swaping(int arr[] , int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void evenodd(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            if (arr[start]%2==1 && arr[end]%2==0){
                swaping(arr,start,end);
                start++;
                end--;
            }
            if (arr[start]%2==0){
                start++;
            }
            if (arr[end]%2==1){
                end--;
            }
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array ");
    int size = sc.nextInt();
    int arr[]= new int[size];

    System.out.println("Enter array elements ");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
        System.out.print("after even odd sorting ");
        evenodd(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
