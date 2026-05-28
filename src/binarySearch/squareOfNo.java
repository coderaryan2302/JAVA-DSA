package binarySearch;
import java.util.Scanner;
public class squareOfNo {

    static double squareOf(double y) {
        int start = 0;
        double end = y;

        while (start <= end) {
            double mid = start + (end - start) / 2;
            if (mid == y) {
                return (double) mid * mid;
            }
            else if (mid < y) {
                start = (int) mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return y * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for square:");
        double y = sc.nextDouble();

        double result2 = squareOf(y);
        System.out.println("Square of " + y + " is " + result2);
    }
}