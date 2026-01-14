//  while(condition){
//       code
//        }



package loops;
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner ( System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        int num=1;
        while(num<=n){
            System.out.println(num);
            num++;   //isko number ko increase krne ke liye kiye hai (increment opertor)
        }
    }
}




// isme sabse phle number starting intialise kiye uske badd
// while ke andar condition check hua or agr condition true hua
// to andar gye or phir jo kaam mila usko kiye . uske bdd
// increase kr diye by 1unit se . uske bdd bahar aa gye loop
