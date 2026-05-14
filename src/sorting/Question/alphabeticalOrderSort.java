package sorting.Question;
import java.util.Scanner;
public class alphabeticalOrderSort {

    static void sorting(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {     // compare strings lexicographically and update minimum index
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        String arr[] = new String[n];

        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        sorting(arr);
        System.out.println("String array sorted in lexicographical order : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


// compareTo() method is used to compare two strings lexicographically.
/*
compareTo() method 2 strings ko alphabetically compare karta hai

Syntax:
firstString.compareTo(secondString)

Example 1:
"Apple".compareTo("Banana")
Apple pehle aata hai
isliye negative value aayegi
"Apple".compareTo("Banana") < 0
ye true hoga

Example 2:
"Mango".compareTo("Apple")
Mango baad me aata hai
isliye positive value aayegi
"Mango".compareTo("Apple") < 0
ye false hoga

Example 3:
"Orange".compareTo("Orange")
dono same hain
isliye 0 aayega
"Orange".compareTo("Orange") < 0
ye false hoga


if(arr[j].compareTo(arr[minIndex]) < 0)
Yaha current string ko minimum string se compare kar rahe hain

Agar current string alphabetically pehle aati hai
to negative value aayegi

Tab condition true hogi aur minIndex update ho jayega
*/
