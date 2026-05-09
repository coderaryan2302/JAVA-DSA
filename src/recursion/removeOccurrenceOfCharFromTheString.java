package recursion;
import java.util.Scanner;

public class removeOccurrenceOfCharFromTheString {

    // method 1: using index
    static String removeChar(String s , int index, char removeCh){
        if (index == s.length()){      // base case: jab pura string check ho jaye tab function stop karo
            return "";
        }

        String ans = removeChar(s, index + 1, removeCh);   // recursive call: next character check karne ke liye

        char ch = s.charAt(index);    // self work: current character nikalo

        if(ch != removeCh){         // self work: agar current character remove karne wala character nahi hai
            return ch + ans;        // to usko final answer me add karo
        }
        else{                       // self work: agar current character remove karne wala character hai
            return ans;             // to us character ko skip kar do
        }
    }

    // method 2: using substring
    static String removeChar2(String s, char removeCh){
        if (s.length() == 0){       // base case: jab string empty ho jaye tab function stop karo
            return "";
        }

        char ch = s.charAt(0);      // self work: string ka first character nikalo

        String ans = removeChar2(s.substring(1), removeCh); // recursive call: first character hata kar baaki string par recursion lagao

        if(ch != removeCh){         // self work: agar current character remove wala character nahi hai
            return ch + ans;        // to usko answer me add karo
        }
        return ans;                 //self work: agar current character remove wala character hai to us character ko skip kar do
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter any word");
        String s = sc.nextLine();

        System.out.println("enter character to remove");
        char ch = sc.next().charAt(0);

        System.out.println("after removing character by method 1 : " + removeChar(s, 0, ch));
        System.out.println("after removing character by method 2 : " + removeChar2(s, ch));
    }
}