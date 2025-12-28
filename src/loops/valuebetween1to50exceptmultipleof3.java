package loops;

public class valuebetween1to50exceptmultipleof3 {
    public static void main(String[] args) {
        int num=1;
        for(;num<=50;num++){
            if (num%3==0){
                continue;   //continu keyword isliye use kiye hai code lagatar run kr rha hai pr 3 ke multiple ko chorte hue krna hai
            }
            System.out.println(num);
        }
    }
}
