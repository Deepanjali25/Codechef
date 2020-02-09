import java.util.*;
import java.lang.*;
class CNOTE {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if(T > 100000) {
            return;
        }
        while(T>0){
            int x = sc.nextInt();
            int y= sc.nextInt();
            int k = sc.nextInt();
            int N = sc.nextInt();
            if(x >1000 || y>1000 || k>1000 || N > 100000) {
                return;
            }
            int[] p = new int[N];
            int[] c = new int[N];
            for(int i=0 ; i<N ; i++) {
                p[i] =sc.nextInt();
                c[i] = sc.nextInt();
                if(p[i] >1000 || c[i] > 1000) {
                    return;
                }
            }
            boolean flag = false;
            for(int i=0 ; i<N; i++) {
                if(p[i] >= (x-y)) {
                    if(c[i]<=k) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag) {
                System.out.println("LuckyChef");
            }
            else {
                System.out.println("UnluckyChef");
            }
            T--;
        }
        sc.close();
    }
}