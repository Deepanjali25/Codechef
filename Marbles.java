import java.lang.String;
import java.lang.System;
import java.util.Scanner;
public class Marbles {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0) {
            int marbles = in.nextInt();
            int colours = in.nextInt();
            marbles = marbles - colours;
            long result = 1;
            for(int i = 1; i < colours; i++) {
                result = (result * (marbles + i)) / i;
            }
            System.out.println(result);
        }
    }
}