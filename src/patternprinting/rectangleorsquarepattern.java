package patternprinting;
import java.util.Scanner;
public class rectangleorsquarepattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r=sc.nextInt();
        System.out.println("enter c");
        int c=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
              //  System.out.print("*"); // ek star ke badd space nahi rahega
             //   System.out.print("*" + " "); // ek star ke baad space rahega
            }
            System.out.println(" "); // dusra row mai jane se phle space rahega
            System.out.println(); // next line mai jane ke liye (next row mai)
             }
    }
}
