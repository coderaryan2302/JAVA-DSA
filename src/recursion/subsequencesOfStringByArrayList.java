package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class subsequencesOfStringByArrayList {

    static ArrayList<String> subsequences(String s) {
        if (s.length() == 0) {                                // base case: agar string khali hai to ek empty string return karo
            ArrayList<String> ans = new ArrayList<>();        // empty ArrayList banao
            ans.add("");                                      // empty string ko list me add karo
            return ans;
        }

        char ch = s.charAt(0);                                            // self work:  string ka first character nikalo

        ArrayList<String> ans = subsequences(s.substring(1));  // recursive call: first character hata kar baaki string ke subsequences nikalne ke liye recursion call karo

        int n = ans.size();                                              // self work: current list me kitne subsequences hain, unki count nikal lo

        for (int i = 0; i < n; i++) {                                    // self work + recursive work: current list ke har subsequence par loop chalao
            ans.add(ch + ans.get(i));                                    // current character ko har subsequence ke starting me add karke new subsequence banao aur usko list me add karo
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        ArrayList<String> ans = subsequences(s);

        System.out.println("All subsequences:");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}