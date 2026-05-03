package recursion;
import java.util.Scanner;
public class LCM {

    static int lcm(int a,int b,int max){
        if (a==0 || b==0){
            return 0;
        }
        if(max%a==0 && max%b==0){
            return max;
        }
        return lcm(a,b, max+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        int max = Math.max(a,b);
        System.out.println("lcm = "+lcm(a,b,max));
    }
}

/*
 Math.max(a,b) dono values compare karta hai
 aur jo bada (maximum) number hota hai, usse return karta hai
 */