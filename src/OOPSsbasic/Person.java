// Eg: classes name is car.   (class keyboard ka c letter capital mai nahi ho ga)
//      toyota,bmw,alto etc all are objects
// objects =instances of class.
// clasess= blueprint/template of real world entities or objects
//  modelno,color,year of manufacture all are these attributes..
//  brake,accleration all are these functionality or methods..
//
// 3 chractersrtics of an object
//     * identity=unique name of obj...... bmw,toyota
//     * state=attributes.......red,750i(model.no)
//     * behaviour=what it can do(methods)..........acceleration,brake
//
//access modifiers
//*public ....... roads
//*private ........ your phone
//*protected ........ assets of your parents or property (only you have a right to take it)
//*default........ tv(within home acess use but outside home not)
//
//syntax of create an object:
//     ClassName ObjectName=new CLassName();
//     "new" keyword is ued to allocate memory for an object in java
//eg:     Person  Rohan   =  new  Person();
//
//syntax of object calling:
// objectName.attribute/methods():
//eg:     Person  Rohan   =  new  Person()
//        System.out.println(Rohan.age);

package OOPSsbasic;
public class Person {
    int age =20;
    public static void main(String[] args) {
        Person Rohan=new Person();
        System.out.println(Rohan.age);
    }
}
