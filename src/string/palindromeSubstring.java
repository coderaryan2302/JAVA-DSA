package string;
import java.util.*;
public class palindromeSubstring {

    static boolean palindrome(String str) {    // Palindrome Check
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;    // Not Palindrome
            }
            i++;
            j--;
        }
        return true;             // Palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        int count = 0;                                 // Total Palindromes
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);      // Current Substring
                if (palindrome(sub)) {
                    System.out.println(sub);           // Print Palindrome
                    count++;
                }
            }
        }
        System.out.println("Count = " + count);        // Total Palindromes
    }
}

/*
Input: aba
Output:
a
aba
b
a
Count = 4

Logic:
Generate All Substrings.
Check Every Substring For Palindrome.
If Palindrome Then Print And Increase Count.

Example:
aba
Substrings:
a ab aba b ba a
Palindromes:
a aba b a

Important:
substring(i,j)
i -> Inclusive
j -> Exclusive
j = i + 1
Invalid substring(i,j) se bachne ke liye.

Complexity:
Time -> O(n³)
Space -> O(1)

Revision:
Palindrome -> Same Forward & Backward
Generate All Substrings -> 2 Loops
Palindrome Check -> 2 Pointers
*/