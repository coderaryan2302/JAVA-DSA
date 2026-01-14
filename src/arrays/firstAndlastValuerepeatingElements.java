package arrays;
import java.util.Scanner;
public class firstAndlastValuerepeatingElements {

    static int firstRepeated(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }

    static int lastRepeated(int arr[]) {
        int ans = -1;   // default if no repeat found

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("first value repeated " + firstRepeated(arr));
        System.out.println("last repeated value " + lastRepeated(arr));
    }
}
