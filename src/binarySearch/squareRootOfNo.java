package binarySearch;
import java.util.Scanner;
public class squareRootOfNo {

    static double squareRoot(int x) {
        int start = 0;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            double value = (double) mid * mid;

            if (value == x) {
                return mid;
            }
            else if (value < x) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // for finding the decimal part of the square root
        double root = ans;
        double increment = 0.1;
        for (int i = 0; i < 5; i++) {

            while (root * root <= x) {
                root = root + increment;
            }
            root = root - increment;
            increment = increment / 10;
        }
        return root;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for square root:");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Square root is not defined for negative numbers.");
            return;
        }

        double result1 = squareRoot(x);
        System.out.println("Square root of " + x + " is " + result1);
    }
}

/*
this code can't find square root of float value. eg - 24.6 etc.
*/