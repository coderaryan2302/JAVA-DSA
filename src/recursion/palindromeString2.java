package recursion;
import java.util.Scanner;
public class palindromeString2 {

    static boolean Method2ByTwoPointers(String s, int l, int r) {
        if (l >= r) {                              // base case: sab characters match ho gaye
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {          // self work: mismatch mila
            return false;
        }
        return Method2ByTwoPointers(s, l + 1, r - 1);    // recursive call for next inner characters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any word:");
        String s = sc.nextLine();

        System.out.println(Method2ByTwoPointers(s, 0, s.length() - 1));
    }
}

/*
Method2ByTwoPointers()

Ye method recursion ki help se string ko
left aur right side se check karta hai.

l -> left pointer
r -> right pointer

Har recursion call me:
left aur right characters compare hote hain

Agar dono same hain:
to function next inner characters check karta hai

Agar koi bhi character match nahi karta:
to function false return kar deta hai

Jab l >= r ho jaye:
matlab pura string successfully match ho gaya
aur string palindrome hai.
*/