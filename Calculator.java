package codechef;
import java.util.*;
import java.lang.*;
class Calculator {
    public static void main (String[] args) throws java.lang.Exception {
        Calculator cal = new Calculator();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char ch = sc.next().charAt(0);
        if(ch=='+') {
            long ans=a+b;
            System.out.println(ans);
        }
        else if(ch=='-') {
            long ans=a-b;
            System.out.println(ans);
        }
        else if(ch=='*') {
            long ans=a*b;
            System.out.println(ans);
        }
        else {
            double ans=(double)a/b;
            System.out.println(ans);
        }
    }
}
