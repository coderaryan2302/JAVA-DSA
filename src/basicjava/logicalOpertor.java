package basicjava;

public class logicalOpertor {
public static void main(String[] args ){
    int p=15,q=10,r=5;

    //  &&(and opertor)
    System.out.println((p>q)&&(p<r));
    System.out.println((p<q)&&(p>r));

    //  ||(or opertor)
    System.out.println((p<q)||(p>r));
    System.out.println((p>q)||(p<r));

    // !(logical not opertor)
    System.out.println(!(p>q));
    System.out.println(!(p==q));
}
}
