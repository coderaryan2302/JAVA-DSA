package arrays;
import java.util.Scanner;
public class elementXisPresentinArray {
    static void presentElement(int arr[], int x) {

        // CASE 1: Element present hai ya nahi
        boolean present = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                present = true;
                break;
            }
        }
        if (present) {
            System.out.println("CASE 1: Element is PRESENT");
        } else {
            System.out.println("CASE 1: Element is NOT PRESENT");
        }

        // CASE 2: Element first time kis index pe aaya
        int ans;
        ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.println("CASE 2 (First index): " + ans);

        // CASE 3: Element kaha-kaha aaya
        System.out.print("CASE 3 (All indexes): ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // CASE 4: Element last index pe kaha aaya
        ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        System.out.println("CASE 4 (Last index): " + ans);


        // CASE 5: Element kitni baar aaya (COUNT)
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("CASE 5 (Count): " + count);


        // CASE 6: Element second time kis index pe aaya
        int c = 0;
        ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                c++;
                if (c == 2) {
                    ans = i;
                    break;
                }
            }
        }
        System.out.println("CASE 6 (Second index): " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        presentElement(arr,x);
    }
}
