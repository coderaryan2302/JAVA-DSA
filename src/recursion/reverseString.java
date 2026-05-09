package recursion;
import java.util.Scanner;
public class reverseString {

    static String reverse(String s , int idx){
        if (idx == s.length()){      // base case: jab pura string check ho jaye tab function stop karo
            return "";
        }

        String ans = reverse(s, idx + 1);   // recursive call: next character check karne ke liye
        char ch = s.charAt(idx);                // self work: current character nikalo
        return ans + ch;                        // self work: current character ko answer ke end me add karo
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word:");
        String s = sc.nextLine();

        System.out.println("Reversed string: " + reverse(s, 0) );
    }
}

