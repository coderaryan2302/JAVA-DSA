package recursion;
import java.util.Scanner;
public class palindromeString {

    static String Method1ByReverse(String s, int idx) {
        if (idx == s.length()) {                           // base case: jab string ka last index cross ho jaye tab recursion stop karo
            return "";
        }
        String ans = Method1ByReverse(s, idx + 1);    // recursive call for next index
        char ch = s.charAt(idx);                          // self work: current index ka character nikalo
        return ans + ch;                                  // self work: current character ko reverse string ke end me add karo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any word:");
        String s = sc.nextLine();

        String ansString = Method1ByReverse(s, 0);        // function call karke reversed string store karo

        if (s.equals(ansString)) {                            // original aur reversed string compare karo
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

/*
s.equals(ansString) dono strings ka content compare karta hai

s -> original string
ansString -> reversed string

agar dono same hain:
equals() true return karega
matlab string palindrome hai

agar same nahi hain:
equals() false return karega
matlab string palindrome nahi hai

Note:
strings compare karne ke liye equals() use karte hain
'==' nahi, kyuki '==' sirf memory address compare karta hai
*/