import java.util.Scanner;
public class Coins {
    public static int changeCoin(int n) {
        int coin = (n/2) + (n/3) + (n/4);
        return coin>n?coin:n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(changeCoin(n));
        }
    }
}
