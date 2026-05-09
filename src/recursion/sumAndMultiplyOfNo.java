package recursion;
import java.util.Scanner;
public class sumAndMultiplyOfNo {

    static int sum(int x, int y) {
        if (x == 0) {                                         // base case
            return y;
        }
        if (x > 0) {                                         // recursive call:  +ve no
            return sum(x - 1, y + 1);
        }
        return sum(x + 1, y - 1);                      // recursive call:  -ve no
    }

    static int multiply(int x, int y) {
        if (y == 0){                                         // base case
            return 0;
        }
        if (y > 0) {                                         // recursive call:  +ve no
            return x + multiply(x, y - 1);
        }
        return -x + multiply(x, y + 1);                   // recursive call:  -ve no
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int x = sc.nextInt();
        System.out.println("enter y");
        int y = sc.nextInt();
        System.out.println("sum = " + sum(x,y));
        System.out.println("multiply = " + multiply(x,y));
    }
}

/*
SUM
 Goal: x → 0
x > 0 → x--, y++
x < 0 → x++, y--

MULTIPLY
 Goal: y → 0
y > 0 → +x
y < 0 → -x
 */