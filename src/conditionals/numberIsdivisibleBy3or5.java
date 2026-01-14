package conditionals;
import java.util.Scanner;
public class numberIsdivisibleBy3or5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int number =sc.nextInt();

        if(number%3==0 || number%5==0){
            System.out.println("the no is divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}
