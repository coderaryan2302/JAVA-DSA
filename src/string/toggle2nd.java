package string;
import java.util.*;
public class toggle2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);                 // Current Character
            if(ch == ' '){
                continue;                            // Skip Space
            }
            int ascii = (int) ch;
            if(ascii >= 97 && ascii <= 122){
                ascii = ascii - 32;                 // Small To Capital
            }
            else if(ascii >= 65 && ascii <= 90){
                ascii = ascii + 32;                 // Capital To Small
            }
            char ab = (char) ascii;                 // Toggled Character
            str = str.substring(0,i) + ab + str.substring(i+1);
        }
        System.out.println("final ans; " + str);                    // Toggle String
    }
}

/*
Input:
PhySiCs Wallah

Output:
pHYsIcS wALLAH

Logic:
String Immutable Hai.

Isliye Character Direct Change Nahi Kar Sakte.
1. Character Toggle Karo.
2. New String Banao Using Substring.
3. Old Character Ki Jagah New Character Rakho.

Important:
substring(0,i) + newChar + substring(i+1)
Used To Replace Character In String.

Complexity:
Time -> O(n²)
Space -> O(n)

Revision:
String -> Immutable
Character Replace -> substring()
Small -> Capital => -32
Capital -> Small => +32
*/