package JustPlayAround;
import java.util.Scanner;
public class ProfitSort {
    public static int numOfDays(int[] profit, int l, int r){
        int numOfDays=0;
        for (int i = 0; i < profit.length; i++) {
            if (profit[i]>=l && profit[i]<=r)
                numOfDays++;
        }
        return numOfDays;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int[] profit = new int[days];
        for (int i = 0; i < profit.length; i++) {
            profit[i] = scan.nextInt();
        }
        int queries = scan.nextInt();
        while (queries-->0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            System.out.println(numOfDays(profit,l,r));
        }
    }
}