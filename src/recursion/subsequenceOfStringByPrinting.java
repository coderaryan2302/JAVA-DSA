package recursion;
import java.util.Scanner;
public class subsequenceOfStringByPrinting {

    static void printSubsequences(String s, String ans) {
        if (s.length() == 0) {                                 // base case: agar string empty ho gayi
            System.out.println(ans);
            return;
        }
        printSubsequences(s.substring(1), ans);     // recursive call: current character ko include mat karo

        printSubsequences(s.substring(1), ans + s.charAt(0));     // self work + recursive call: current character ko include karo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.println("All subsequences are:");
        printSubsequences(s, "");
    }
}

/*
Har character ke liye recursion 2 kaam karta hai:
1. Character ko lena
2. Character ko na lena
Isi liye function ko 2 baar call karte hain.

---------------------------------------------------
printSubsequences(s.substring(1), ans);
Yaha current character ko answer me add nahi karte.
Matlab character ko skip kar dete hain.

---------------------------------------------------
printSubsequences(s.substring(1), ans + s.charAt(0));
Yaha current character ko answer me add kar dete hain.


Example:
String = "ab"
'a' ke liye 2 choices:
1. 'a' ko skip karo
   -> ""
   -> "b"
2. 'a' ko add karo
   -> "a"
   -> "ab"
Is tarah recursion har character ke liye
include aur exclude dono possibilities check karta hai.
Isi se sare subsequences mil jate hain.
Total subsequences = 2^n
yaha n = string ki length
*/