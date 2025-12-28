package basicjava;

public class assignmentopertor  {
    public static void main (String[] args){
        int p=10;
        int q;

        //=
        q=p; // p ki value q mai ja rhi hai ( assign the value from ryt to left always )
        System.out.println(p);

        //+=
        p+=q;//p=p+q
        System.out.println(p);

        //-=
        p-=q;//p=p-q
        System.out.println(p);

        //*=
        p*=q;//p=p*q
        System.out.println(p);

        // /=
        p/=q;//p=p/q
        System.out.println(p);

    }
}
