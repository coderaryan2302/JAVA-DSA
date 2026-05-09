package recursion;
import java.util.Scanner;
public class targetValueInArray {
    static boolean targetFinding(int arr [], int index, int target, boolean found) {
        if (index == arr.length) {                                    // base case: agar index array ke length ke barabar ho jaye to target nahi mila hai, to function stop karo
            return found;
        }
        if (arr[index] == target) {                                  // self work: agar current index par target value mil jaye to uska index print karo aur found variable ko true kar do
            System.out.println("Target found at index: " + index);
            found = true;
        }
        return targetFinding(arr, index + 1, target, found);   // recursion call: next index par target value check karne ke liye recursion call karo, found variable ko pass karo taaki agar target mil jaye to uska index print ho jaye
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int arr [] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target value:");
        int target = sc.nextInt();

        boolean found = targetFinding(arr, 0, target, false);
        if (!found) {
            System.out.println("Target not found");
        }
    }
}