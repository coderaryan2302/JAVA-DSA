package arrays;
import java.util.Arrays; // 6no line ke liye import kiya gaya hai..
import java.util.Scanner;
public class smallestandlargestelementinarray {
    static void smallestandlargest(int arr[]) {
        Arrays.sort(arr); // inbuilt function hai jisey array sort ho jata hai..
        System.out.println("smallest element =" + arr[0] + " largest element =" + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter the elemnts");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        smallestandlargest(arr);
        System.out.println("sorted array");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

