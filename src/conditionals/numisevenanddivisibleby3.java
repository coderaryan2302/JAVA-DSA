package conditionals;
import java.util.Scanner;
public class numisevenanddivisibleby3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        if(number%2==0 && number %3==0){
            System.out.println("ans");
        }
        else{
            System.out.println("not found ans");
        }

    }
}
