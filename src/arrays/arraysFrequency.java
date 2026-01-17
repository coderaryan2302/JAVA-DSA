package arrays;
import java.util.Scanner;
public class arraysFrequency {

    // frequency array banane ka function
    static int[] FrequencyArray(int arr[], int maxRange) {
        int frequency[] = new int[maxRange + 1];            // 0 se maxRange tak count store karne ke liye

        for (int i = 0; i < arr.length; i++) {              // poora array traverse
            if (arr[i] >= 0 && arr[i] <= maxRange) {        // safe check (out of bounds se bachne ke liye)
                frequency[arr[i]]++;                        // jis number ka index, uski count +1
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter maximum possible number");
        int maxRange = sc.nextInt();                       // frequency array ka maximum index

        int frequency[] = FrequencyArray(arr, maxRange);   // frequency array create kiya

        System.out.println("enter number of queries");
        int queries = sc.nextInt();                       // kitni baar search karna hai

        while (queries > 0) {                             // jab tak queries bachi hain
            System.out.println("enter number to search");
            int search = sc.nextInt();

            if (search >= 0 && search <= maxRange && frequency[search] > 0) {
                System.out.println("YES");                                 // number present hai
                System.out.println("count = " + frequency[search]);        // kitni baar aaya
            } else {
                System.out.println("NO");                                  // number present nahi hai
                System.out.println("count = 0");                           // count zero
            }
            queries--;
        }
    }
}
