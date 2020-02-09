import java.util.Scanner;
class LECANDY {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0) {
            int totalNumberOfElephants = scan.nextInt();
            int totalNumberOfCandies = scan.nextInt();
            int[] N = new int[totalNumberOfElephants];
            for (int i = 0; i < N.length; i++) {
                N[i] = scan.nextInt();
                sum += N[i];
            }
            if (sum<=totalNumberOfCandies) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}