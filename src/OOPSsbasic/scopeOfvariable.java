package OOPSsbasic;
class Operation {
//    int a=10; //member variable
//    int b=5;
//
//    int add(){
//        return a+b;
//    }
//
//    int sub(){
//        return a-b;
//    }
//}
//
//    int add(){
//    int p=100;
//    int q=20;
//    return p+q;
//    }
//
//    int sub(){
//    int p=60;
//    int q=20;
//    return p-q;
//    }

void demo() {
    int a = 10;
    System.out.println(a);
    // System.out.println(b);// block ke andar acess ho ga
    {
        int b = 30;
        System.out.println(b);
    }
    // hum yaha pe for loop bhi chala skte hai ek block ke liye
    {
        int b = 10;
        System.out.println(b);
    }
}
}
    public class scopeOfvariable {
        public static void main(String[] args) {
            Operation obj = new Operation();
            obj.demo();
        }
    }



// 3-12 tk class scope bana hai class ke andar bna hai or class ke andar hee acess hee kr skte hai
// 15-25 tk method level scope hai method ke andar hee acess kr skte hai
// 27-39 tk block level scope hai jo sirf block mai acess ho ga
// 40 pr curly braces class operation ka lga hai ( coment out hai baki sab )