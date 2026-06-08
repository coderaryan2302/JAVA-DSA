package string;
import java.util.*;
public class countTheCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        int vowels = 0;
        int digits = 0;
        int special = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if(ch >= '0' && ch <= '9'){
                digits++;

            }else if(!(ch >= 'a' && ch <= 'z') && ch != ' '){
                special++;
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Digits = " + digits);
        System.out.println("Special = " + special);
    }
}

/*
Input:
Aryan@123

Output:
Vowels = 2
Digits = 3
Special = 1

Logic:
Check Every Character.
Count Vowels, Digits And Special Characters.

Complexity:
Time -> O(n)
Space -> O(1)
*/