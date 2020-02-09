package JustPlayAround;
import java.util.Arrays;
import java.util.Scanner;
public class Denominations {
    public static int count(int n ) {
        int S[] = {3,5,10};
        int m = S.length;
        int table[]=new int[n+1];
        table[0] = 1;
        for(int i=0; i<m; i++)
            for(int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
        return table[n];
    }
    public static int numOfWays(int n) {
        int v[] = new int[n + 1], i;
        Arrays.fill(new int[]{n + 1}, 0);
        v[0] = 1;
        for (i = 3; i <= n; i++)
            v[i] += v[i - 3];
        for (i = 5; i <= n; i++)
            v[i] += v[i - 5];
        for (i = 10; i <= n; i++)
            v[i] += v[i - 10];
        return v[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            System.out.println(numOfWays(n));
            System.out.println(count(n));
        }
    }
}
