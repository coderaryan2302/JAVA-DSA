package arrays;
class arraysExample{             //another class bna ke kr skte ho ... main class ye nhi hai
     void demoArryas(){
        int ages[]=new int[3];  // new int[] aise hee size declare krte hai (big bracket ke andar size likhna hai)
                                // int ages[] aise array ka name or array ko create krte hai uske name ke sath
        ages[0]=10;// array ke indexing ke andar value assign kiye hai
        ages[1]=20;
        ages[2]=30;
//        ages[5]=40;// out of array size

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);


//        System.out.println(ages.length);         // ye arrname.length ek inbuilt function hai jo array ke andar jitne bhi element utna total no. bata deta hai..

//        for loop lga ke print kiya ya phir traverse kiya array ko
        for (int i = 0; i < 3; i++) {  // 3 ke jagah pe arrname.lengh bhi likh skte hai
            System.out.println(ages[i]);
        }
    }
}
    public class basicarrayeg {                   // main class
    public static void main(String[] args) {
//        demoArrays();                          // ye bhi rasta hai call krne ka function name laga ke ... pr ye bina another class create kr ke ho ga ... function main class ke andar rahega or call psvm ke andar function name lga ke or parasthenis....
        arraysExample obj=new arraysExample();   // obj create kr ke tb krna hai jab another class banayenge
        obj.demoArryas();                        // or obj create krne ke bdd , object ki help se call krenge obj.functionname
    }
}
