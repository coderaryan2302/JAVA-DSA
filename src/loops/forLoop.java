//    for (initialisation statement;condition;final expression){
//              code
//        }
//
//        isme sabse phle initialisation ho ga uske bdd condition check
//        uske badd loop ke andar entry code execute then final expression ke tarf phir as usual
//        condition check uske bdd  start ho jayega step .
//

package loops;
import java.util.Scanner;
public class forLoop {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int num=1;num<=n;num++){
            System.out.println(num);
        }
    }
}

