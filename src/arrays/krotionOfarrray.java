package arrays;
import java.util.Scanner;
public class krotionOfarrray {
    static void rotation(int arr[], int k, int ansarr2[]) {
        k = k % arr.length;
        int j = 0;

       for(int i = arr.length-k; i < arr.length; i++){
                 ansarr2[j] = arr[i];
                 j++;
            }

       for(int i = 0 ; i < arr.length-k ;i++){
                ansarr2[j] = arr[i];
                j++;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int ansarr2[] = new int[size];

        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of k ");
        int k = sc.nextInt();

        System.out.println("after kth rotation ");
        rotation(arr, k, ansarr2);
        for (int j=0;j<arr.length;j++){
            System.out.print(ansarr2[j]+" ");
        }
    }
}
