package codechef;

import java.util.Scanner;
public class ATM {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        float amount, balance, charges= (float) 0.50;
        amount=sc.nextFloat();
        balance=sc.nextFloat();
        if (amount>0 && amount<=2000 && amount%5==0 && (amount+charges)<balance) {
            balance=balance-(amount+charges);
        }
        System.out.printf("%.2f",balance);
    }
}