package arrays;
import java.util.Scanner;
class sortingOfarrayWithoutInbuiltFunction {
    static void sorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {             // ek number pakdo
            for (int j = i + 1; j < arr.length; j++) {     // baaki numbers compare

                if (arr[i] > arr[j]) {                     // agar chhota mila
                    int temp = arr[i];                     // swap
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("after sorting array ");
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
