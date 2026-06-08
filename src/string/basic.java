package string;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String Declaration
        String str = "Aryan";
        System.out.println("String = " + str);

        // 2. Taking Input
        System.out.print("Enter a sentence : ");
        String input = sc.nextLine();
        System.out.println("Output = " + input);

        // 3. Length
        String s1 = "Hello";
        System.out.println("\nLength = " + s1.length());

        // 4. charAt()
        String s2 = "Physics";
        System.out.println("\n0th Index Character = " + s2.charAt(0));
        System.out.println("3rd Index Character = " + s2.charAt(3));

        // 5. Printing All Characters
        System.out.print("\nCharacters : ");
        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i) + " ");
        }
        System.out.println();

        // 6. indexOf()
        String s3 = "Aryan";
        System.out.println("\nIndex Of 'y' = " + s3.indexOf('y'));
        System.out.println("Index Of 'z' = " + s3.indexOf('z')); // -1

        // 7. lastIndexOf()
        String s4 = "banana";
        System.out.println("\nLast Index Of 'a' = " + s4.lastIndexOf('a'));

        // 8. contains()
        String s5 = "Physics Wallah";
        System.out.println("\nContains \"Wall\" ? " + s5.contains("Wall"));

        // 9. startsWith() and endsWith()
        String s6 = "College Wallah";
        System.out.println("\nStarts With \"Col\" ? " + s6.startsWith("Col"));
        System.out.println("Ends With \"ah\" ? " + s6.endsWith("ah"));

        // 10. substring()
        String s7 = "Physics";
        System.out.println("\nsubstring(2) = " + s7.substring(2));
        System.out.println("substring(2,5) = " + s7.substring(2, 5));

        // 11. toLowerCase()
        String upper = "PHYSICS WALLAH";
        System.out.println("\nLowercase = " + upper.toLowerCase());

        // 12. toUpperCase()
        String lower = "physics wallah";
        System.out.println("Uppercase = " + lower.toUpperCase());

        // 13. concat()
        String a = "abc";
        String b = "xyz";
        System.out.println("\nConcat = " + a.concat(b));

        // 14. String + Number
        System.out.println("\n\"abc\" + 10 + 20 = " + ("abc" + 10 + 20));
        System.out.println("\"abc\" + (10 + 20) = " + ("abc" + (10 + 20)));
        System.out.println("10 + 20 + \"abc\" = " + (10 + 20 + "abc"));

        // 15. replace()
        String s8 = "hello";
        System.out.println("\nReplace = " + s8.replace('l', 'x'));

        // 16. trim()
        String s9 = "     Aryan     ";
        System.out.println("\nTrim = \"" + s9.trim() + "\"");

        // 17. toCharArray()
        String s10 = "Hello";
        char[] arr = s10.toCharArray();
        System.out.print("\nChar Array : ");
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 18. compareTo()
        String x = "cat";
        String y = "dog";
        System.out.println("\ncat vs dog = " + x.compareTo(y));
        System.out.println("dog vs cat = " + y.compareTo(x));
        System.out.println("cat vs cat = " + x.compareTo("cat"));
        /*
         0  -> equal
         +ve -> greater
         -ve -> smaller
        */

        // 19. String Comparison
        String h1 = "hello";
        String h2 = "hello";
        String h3 = new String("hello");
        System.out.println("\nh1 == h2 : " + (h1 == h2));
        System.out.println("h1 == h3 : " + (h1 == h3));
        System.out.println("h1.equals(h2) : " + h1.equals(h2));
        System.out.println("h1.equals(h3) : " + h1.equals(h3));
        /*
            ==      -> address compare
            equals  -> content compare
        */

        // 20. String Immutability
        String test = "hello";
        test.concat("world");
        System.out.println("\nWithout Storing = " + test);
        test = test.concat("world");
        System.out.println("After Storing = " + test);
        /*
         String is Immutable.
         Wrong:
         str.concat("xyz");
         Correct:
         str = str.concat("xyz");
        */

        // 21. isEmpty()
        String s11 = "";
        System.out.println("\nisEmpty() = " + s11.isEmpty());

        // 22. equalsIgnoreCase()
        String s12 = "HELLO";
        String s13 = "hello";
        System.out.println("equalsIgnoreCase() = " + s12.equalsIgnoreCase(s13));
    }
}