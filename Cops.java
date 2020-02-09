import java.util.Scanner;
public class Cops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-->0) {
            int M = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] copHouse = new int[M];
            int housesCoveredByPolice=0;
            int houseToHide=0;
            for (int i = 0; i < copHouse.length; i++) {
                copHouse[i] = scanner.nextInt();
                housesCoveredByPolice=((copHouse[i]) + (x*y));
                if (copHouse[i]!=housesCoveredByPolice){
                    houseToHide++;
                }
            }
            System.out.println(houseToHide);
        }
    }
}
