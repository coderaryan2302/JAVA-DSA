//if (condition){
//    code
//}
//  else{
//      code
//  }
//agr if ka condition nhi chalta (i.e code jo likha hai uske andar) hai to else statement chalega..

package conditionals;
import java.util.Scanner;
public class oddeven {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int number=sc.nextInt();

        if (number%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}



