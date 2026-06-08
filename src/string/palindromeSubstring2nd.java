package string;
import java.util.*;
public class palindromeSubstring2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();                           // Reverse String

        if(str.equals(gtr.toString())){          // Compare Original And Reverse
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

/*
Input: aba

Output: Palindrome

Logic:
Store String In StringBuilder.
Reverse The String.
Convert StringBuilder To String.
Compare Original And Reverse String.

Example:
str = aba
reverse = aba
Palindrome

Important:
reverse() -> Reverse String
toString() -> StringBuilder To String

Wrong:
str.equals(gtr)
Because: String != StringBuilder

Correct:
str.equals(gtr.toString())

Complexity:
Time -> O(n)
Space -> O(n)

Revision:
Palindrome -> Original == Reverse
reverse() -> Reverse String
toString() -> StringBuilder To String

*/