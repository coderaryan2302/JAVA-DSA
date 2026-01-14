//       this is only for notes..................
//    bitwise OR  ( iske case mai ek bhi bit one hai to one hee dey ga )
//            9 =1001
//            10=1010
//            1001 OR 1010=1011=(11)
//
//    bitwise AND ( isle case mai ek bhi bit zero hua hai to zero dey ga  )
//            9=1001
//            10=1010
//            1001 AND 1010=1000=(8)
//
//
//    bitwise exclusive OR {XOR}
//       ( iske case mai agr dono bit same hai to zero dey ga
//        or agr same nhi hai to one dey ga )
//            9=1001
//            10=1010
//            1001 XOR 1010 =0011=(3)
//
//
//    bitwise complement
//            isme inverts all the bits
//    9=1001
//    ~9=0110


//    left shift
//             a<<b=a*2^b
//
//    right shift
//            a>>b=a/2^b


//program


package basicjava;
public class bitwiseOpertor {
    public static void main(String[] args) {
        int p = 9;
        int q = 10;
        System.out.println(p|q); // or
        System.out.println(p&q); // and
        System.out.println(p^q); // exclusive or (xor)

        System.out.println(p<<1); // left shift 1 times
        System.out.println(p>>1); // right shift 1 times
        System.out.println(q<<1); //left shift 1 times
        System.out.println(q>>1); //right shift 1 times

        System.out.println(p<<2); //left shift 2 times
        System.out.println(p>>2); //right shift 2 times
        System.out.println(q<<2); //left shift 2  times
        System.out.println(q>>2); //right shift 2 times
    }
}















