package codechef;//public class codechef.Random {
//    public static void main(String[] args){
//        int[] arr = new int[] {10,20,30,40,50,60,70,80,90,100};
//        for (int i=arr.length;i>=1;i--) {
//            System.out.println(arr[i]);
//        }
//    }
//}
import java.util.*;
import java.lang.*;
class Random {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0) {
            int x = sc.nextInt();
            int rev=0;
            while(x!=0) {
                int y=x%10;
                rev = rev*10+y;
                x=x/10;
            }
            System.out.println(rev);
            n--;
        }
    }
}