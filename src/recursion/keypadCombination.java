package recursion;
import java.util.Scanner;
public class keypadCombination {

    static String[] keypad = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static void keypadCombination(String digit, String ans) {
        if (digit.length() == 0) {         // base case          // agar saare digits khatam ho gaye
            System.out.println(ans);                             // jo combination bana hai usko print karo
            return;                                              // function yahi stop ho jayega
        }

        // self work
        for (int i = 0; i < keypad[digit.charAt(0) - '0'].length(); i++) {                  // current digit ke saare letters par loop chalao
            char ch = keypad[digit.charAt(0) - '0'].charAt(i);                              // current digit ka ek letter nikalo

            // recursive work
            keypadCombination(digit.substring(1), ans + ch);                 // next digit ke liye recursive call karo aur current letter ko answer me add karo
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter digits: ");

        keypadCombination(sc.next(), "");
    }
}


/*
 * ===================== SIMPLE EXPLANATION =====================
 *
 * Ye program mobile keypad ke combinations print karta hai.
 *
 * Jaise mobile keypad me:
 *
 * 2 -> abc
 * 3 -> def
 * 4 -> ghi
 *
 * Agar input ho:
 * 23
 *
 * To:
 *
 * 2 se letters milenge:
 * a b c
 *
 * 3 se letters milenge:
 * d e f
 *
 * Ab program:
 *
 * 2 wale har letter ko
 * 3 wale har letter ke saath jodega.
 *
 * Isliye output aayega:
 *
 * ad
 * ae
 * af
 * bd
 * be
 * bf
 * cd
 * ce
 * cf
 *
 * =============================================================
 *
 * ---------------------- PROGRAM KAAM KAISE KARTA HAI ----------------------
 *
 * Maan lo input hai:
 *
 * 23
 *
 * Sabse pehle program:
 *
 * 2 ko dekhega.
 *
 * 2 ke letters hain:
 *
 * a b c
 *
 * -------------------------------------------------------------
 *
 * Pehle:
 *
 * a choose hoga
 *
 * Ab bacha:
 *
 * 3
 *
 * 3 ke letters:
 *
 * d e f
 *
 * Ab combinations banenge:
 *
 * a + d = ad
 * a + e = ae
 * a + f = af
 *
 * -------------------------------------------------------------
 *
 * Fir:
 *
 * b choose hoga
 *
 * Combinations:
 *
 * b + d = bd
 * b + e = be
 * b + f = bf
 *
 * -------------------------------------------------------------
 *
 * Fir:
 *
 * c choose hoga
 *
 * Combinations:
 *
 * c + d = cd
 * c + e = ce
 * c + f = cf
 *
 * =============================================================
 *
 * ---------------------- BASE CASE ----------------------
 *
 * Base case recursion ko rokne ke liye hota hai.
 *
 * Code:
 *
 * if(digit.length() == 0)
 *
 * Iska matlab:
 *
 * Ab process karne ke liye koi digit nahi bacha.
 *
 * Matlab:
 *
 * Ek complete combination ban gaya.
 *
 * Isliye:
 *
 * System.out.println(ans);
 *
 * answer print ho jata hai.
 *
 * Example:
 *
 * keypadCombination("", "ad")
 *
 * Yaha:
 *
 * digit empty hai
 * ans = "ad"
 *
 * To:
 *
 * ad print hoga.
 *
 * =============================================================
 *
 * ---------------------- SELF WORK ----------------------
 *
 * Self work matlab:
 *
 * Function apna current kaam kya kar raha hai.
 *
 * Yaha function ka current kaam hai:
 *
 * Current digit ke saare letters nikalna.
 *
 * Example:
 *
 * digit = "23"
 *
 * Current digit:
 *
 * 2
 *
 * keypad[2] = "abc"
 *
 * Ab function:
 *
 * a
 * b
 * c
 *
 * ko ek-ek karke choose karega.
 *
 * Yehi function ka self work hai.
 *
 * =============================================================
 *
 * ---------------------- RECURSIVE WORK ----------------------
 *
 * Recursive work matlab:
 *
 * Function baaki ka kaam
 * khud ko dobara call karke karwata hai.
 *
 * Example:
 *
 * Agar:
 *
 * a choose ho gaya
 *
 * To:
 *
 * function next call karega:
 *
 * keypadCombination("3", "a")
 *
 * Ab next function:
 *
 * 3 ke letters handle karega.
 *
 * Fir:
 *
 * d
 * e
 * f
 *
 * ko add karega.
 *
 * Isi tarah recursion saare combinations bana deta hai.
 *
 * =============================================================
 *
 * ---------------------- DRY RUN ----------------------
 *
 * Input:
 *
 * 23
 *
 * -------------------------------------------------------------
 *
 * First Call:
 *
 * keypadCombination("23", "")
 *
 * Current digit:
 *
 * 2
 *
 * Letters:
 *
 * a b c
 *
 * -------------------------------------------------------------
 *
 * First iteration:
 *
 * ch = a
 *
 * Recursive call:
 *
 * keypadCombination("3", "a")
 *
 * -------------------------------------------------------------
 *
 * Second Call:
 *
 * digit = "3"
 * ans = "a"
 *
 * Current digit:
 *
 * 3
 *
 * Letters:
 *
 * d e f
 *
 * -------------------------------------------------------------
 *
 * First iteration:
 *
 * ch = d
 *
 * Recursive call:
 *
 * keypadCombination("", "ad")
 *
 * digit empty ho gaya.
 *
 * Base case chalega.
 *
 * Output:
 *
 * ad
 *
 * -------------------------------------------------------------
 *
 * Next:
 *
 * keypadCombination("", "ae")
 *
 * Output:
 *
 * ae
 *
 * -------------------------------------------------------------
 *
 * Next:
 *
 * keypadCombination("", "af")
 *
 * Output:
 *
 * af
 *
 * -------------------------------------------------------------
 *
 * Fir recursion wapas jayega.
 *
 * Ab:
 *
 * b choose hoga.
 *
 * Output:
 *
 * bd
 * be
 * bf
 *
 * -------------------------------------------------------------
 *
 * Fir:
 *
 * c choose hoga.
 *
 * Output:
 *
 * cd
 * ce
 * cf
 *
 * =============================================================
 *
 * ---------------------- FINAL OUTPUT ----------------------
 *
 * ad
 * ae
 * af
 * bd
 * be
 * bf
 * cd
 * ce
 * cf
 *
 * =============================================================
 */