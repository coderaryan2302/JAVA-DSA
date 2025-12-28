// if(condition 1){
//    code
// }
// else if ( condition 2){
//    code
// }
// else{
//    code
// }



package conditionals;
import java.util.Scanner;
public class agegroup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a age");
        int age=sc.nextInt();

        if(age<=10){
            System.out.println("child");
        }
        else if (age>10 && age<=18){
            System.out.println("younger");
        }
        else{
            System.out.println("adult");
        }
    }
}
