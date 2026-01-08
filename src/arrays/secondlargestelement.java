package arrays;
import java.util.Scanner;
public class secondlargestelement {

    static int firstlargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void secondlargest(int arr[]) {
        int max = firstlargest(arr);

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondlargest = firstlargest(arr);

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element is " + secondlargest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        secondlargest(arr);
    }
}
