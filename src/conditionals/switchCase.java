//  switch(expression){
//    case x:
//        code
//        break;
//    case y:
//        code
//        break;
//    default:
//        code
//  }
// switch case mai jo bhi expression  aaya uske according case bana ke
// code execute krwate hai
//expression kuch bhi ho skta hai integer,character



package conditionals;
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("conditions");
        int conditions = sc.nextInt();

        switch (conditions) {
            case 1:
                System.out.println("a");
                break;

            case 2:
                System.out.println("b");
                break;

            case 3:
                System.out.println("c");
                break;

            default:
                System.out.println("no changes");

        }
    }
}





