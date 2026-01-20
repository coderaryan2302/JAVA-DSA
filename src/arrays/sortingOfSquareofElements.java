package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class sortingOfSquareofElements {
    static void square(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
    }

//    short method for swapping by the help of inbuilt function ... 2no import file is for this ..
//    static void swapping(int arr[]){
//        Arrays.sort(arr);
//    }

//    without inbuilt function, swapping method
    static void swapping(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("square of elements ");
        square(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("sorting of square of elements ");
        swapping(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}


