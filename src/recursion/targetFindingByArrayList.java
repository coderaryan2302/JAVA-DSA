package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class targetFindingByArrayList {

    static ArrayList<Integer> allIndices(int arr[], int target, int index) {
        if (index == arr.length) {         // base case: jab pura array check ho jaye tab recursion stop karo
            return new ArrayList<>();      // empty ArrayList return karo
        }

        ArrayList<Integer> ans = allIndices(arr, target, index + 1);   // recursive call: remaining array check karo

        if (arr[index] == target) {      // self work: agar current index par target mil jaye
            ans.add(0, index);     // current index ko list ke starting me add karo
        }
        return ans;                      // final answer list return karo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array is empty");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        ArrayList<Integer> ans = allIndices(arr, target, 0);

        if (ans.size() == 0) {
            System.out.println("Target not found");
        } else {
            System.out.println(ans);
        }
    }
}


/*
ans.add(0, index);

// add() method ka format hota hai:
// add(position , value)

// Yaha pehla argument 0 hai
// iska matlab:
// list ke kis position par value add karni hai

// 0th position ka matlab hota hai:
// list ki starting

// Yaha dusra argument index hai
// iska matlab:
// current index ki value add karo

// Example:
// maan lo current index = 1 hai
// aur ans list = [3,4] hai

// ans.add(0, index)
// matlab:
// index ki value yani 1 ko
// 0th position yani starting me add karo

// to final list ban jayegi:
// [1,3,4]

// Agar hum sirf:
// ans.add(index)
// likhte

// to value end me add hoti
// aur output reverse order me aata

// isliye add(0, index) use kiya
// taki indices correct ascending order me aaye
 */