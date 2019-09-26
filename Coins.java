package codechef;
import java.util.Scanner;
class Coins {
    public static int getChange(int coins) {
        int n = coins;
        int change = (n/2) + (n/3) + (n/4);
        if (change > n) {
            n = change;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<=9;i++) {
            int n = scanner.nextInt();
            System.out.println(getChange((n)));
        }
    }
}