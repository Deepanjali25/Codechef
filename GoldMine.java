package JustPlayAround;
import java.util.Scanner;
public class GoldMine {
    public static void main(String[] args) {
        int a[][]=new int[10][10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the matrix row and column");
        int n=s.nextInt();
        int m=s.nextInt();
        int q=s.nextInt();
        System.out.println("Enter elements of a matrix");
        for(int i=0;i<n;i++)
            for (int j=0;j<m ;j++ )
                a[i][j]=s.nextInt();
        //System.out.println("Entered Matrix elements are");
        //for(int i=0;i<m;i++) {
            //System.out.println();
            //for (int j=0;j<n ;j++ ) {
                //System.out.print(a[i][j]);
            //}
        //}
        System.out.println("Enter the matrix from where u want to display");
        int sum=0;
        for (int i = 1; i <= q; i++) {
            int n1 = s.nextInt();
            int m1 = s.nextInt();
            int n2 = s.nextInt();
            int m2 = s.nextInt();
            for (int j = n1; j < n; j++)
                for (int k = m1; k < m; k++)
                    sum += a[j][k];
            System.out.println(sum);
        }
    }
}