// if ( condition 1){
//      if ( condition 2){
//          code
//        }
//           else{
//          code
//           }
//    }
//  else{
//        code
//      }
//
//   isme if condition1 ke inside another if condition2 rehta hai or iska else if . or jab andar wla execute hota ya nahi hua agr to bahar ka else phie execute hota hai



package conditionals;
import java.util.Scanner;
public class nestedif {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a");
        int a= sc.nextInt();

        if (a>0) {
            if (a % 2 == 0) {
                System.out.println("multiple of 2");
            }
            else if (a % 3 == 0) {
                System.out.println("multiple of 3");
            }
            else {
                System.out.println("not a multiple of 2 and 3");
            }
        }
        else {
                System.out.println("negative no");
            }

        }
    }



