package basicjava;
import java.util.Scanner;
public class simpleInterest {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
                System.out.println("enter principal");
        float p =sc.nextFloat();

        System.out.println("rate of interest ");
        float r =sc.nextFloat();

         System.out.println("time duration");
                 float t = sc.nextFloat();

                 float si=(p*r*t) /100;
                         System.out.println("SI is "+ si);
    }


}
