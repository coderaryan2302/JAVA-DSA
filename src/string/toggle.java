package string;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);                  // Current Character
            if(ch == ' '){
                continue;                             // Skip Space
            }
            if(ch >= 'a' && ch <= 'z') {
                str.setCharAt(i, (char) (ch - 32));   // Small To Capital
            }else if(ch >= 'A' && ch <= 'Z'){
                str.setCharAt(i,(char)(ch + 32));     // Capital To Small
            }
        }
        System.out.println("final ans: " + str);                      // Toggle String
    }
}

/*
Input:
PhySiCs Wallah

Output:
pHYsIcS wALLAH

Logic:
Traverse String.
If Character Is Small -> Convert To Capital.
If Character Is Capital -> Convert To Small.
Ignore Spaces.

ASCII:
a-z -> 97-122
A-Z -> 65-90

Small To Capital -> -32
Capital To Small -> +32

Important:
setCharAt(index,ch): Used To Modify Character In StringBuilder.
StringBuilder -> Mutable

Complexity:
Time -> O(n)
Space -> O(1)

*/