package recursion;
import java.util.Scanner;
public class sumOfAllSubsets {

    static void sumOfSubsets(int[] arr, int idx, int sum, String subset) {
        if (idx == arr.length) {                                         // base case: agar index array ke length ke barabar ho jaye to subset complete ho chuka hai
            System.out.println("{" + subset + "} -> Sum = " + sum);      // subset aur uska sum print karo
            return;
        }
        sumOfSubsets(arr, idx + 1, sum, subset);                     // recursion call: current element ko subset me include mat karo, sum bhi same rahega

        sumOfSubsets(arr, idx + 1, sum + arr[idx],subset + arr[idx] + " ");    // recursion call: current element ko subset me include karo, sum me current element ka value add karo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subsets with sums:");
        sumOfSubsets(arr, 0, 0, "");
    }
}


/*
String subset:
yeh ek string variable hai jo current subset ko store karta hai....

recursion me jab koi element include hota hai,
to woh subset string me add ho jata hai

example:
""        -> empty subset
"1 "      -> subset me 1
"1 2 "    -> subset me 1 aur 2
"1 2 3 "  -> subset me 1, 2 aur 3

String subset variable me har included element ke baad
ek space add karte hain taaki elements alag-alag clearly dikh sakein.

Jab subset print karte hain, to usko curly braces ke andar
dikhate hain, jaise:
{1 2 } -> Sum = 3
*/



/*
Base case:
jab idx array ke end tak pahunch jaye,
matlab ek subset complete ban gaya hai
if (idx == arr.length) {

    // subset aur uska sum print karo
    System.out.println("{" + subset + "} -> Sum = " + sum);

    return; // function stop
}

Recursive call 1:
current element ko mat lo
subset aur sum same rahenge
sumOfSubsets(arr, idx + 1, sum, subset);

Recursive call 2:
current element ko lo
sum me current element add hoga
subset me bhi current element add hoga
sumOfSubsets(arr, idx + 1, sum + arr[idx], subset + arr[idx] + " ");
*/