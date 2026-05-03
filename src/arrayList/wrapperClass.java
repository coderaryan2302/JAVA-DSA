// wrapper class = a classs whose object contains or wraps primitive datatype...

package arrayList;
public class wrapperClass {
    public static void main(String[] args) {
        //  Integer i = new Integer(3);        // ye tarika se depreciated ho chuka hai intelijidea se
        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(5.5f);
        System.out.println(f);
    }
}