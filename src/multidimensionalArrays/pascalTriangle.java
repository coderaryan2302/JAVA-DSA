package multidimensionalArrays;
import java.util.Scanner;
public class pascalTriangle {

    static void printMatrix(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int ans[][]=new int[n][];        // n rows ka 2D array banaya (har row ka size baad me decide hoga)
        for (int i = 0; i<n ; i++) {
            ans[i]=new int[i+1];         // har row me i+1 elements honge (Pascal triangle ka rule)
            ans[i][0]=ans[i][i]=1;       // har row ka first aur last element hamesha 1 hota hai
            for (int j = 1; j<i ; j++) {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];  // beech ke elements upar ke do numbers ka sum hote hain
            }
        }
        return(ans);                     // pura Pascal triangle return kar diya
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter N no. of rows");
        int n=sc.nextInt();
        int [][] ansPascal=pascal(n);
        System.out.println("Pascal Triangle");
        printMatrix(ansPascal);
    }
}
