import java.lang.*;
import java.io.*;
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String in;
        while((in=br.readLine())!=null) {
            int N=Integer.parseInt(in);
            String str[]=br.readLine().split(" ");
            int ar[]=new int[N];
            for(int i=0;i<N;i++){
                ar[i]=Integer.parseInt(str[i]);
            }
            System.out.println(MCM(ar));
        }
    }
    static int MCM(int ar[]) {
        if(ar.length==2){
            return ar[0]*ar[1];
        }
        int dp[][]=new int[ar.length][ar.length];
        int color[][]=new int[ar.length][ar.length];
        for(int i=0;i<ar.length;i++){
            color[i][i]=ar[i];
        }
        int mul=0;
        for(int l=2;l<=ar.length;l++) {
            for(int i=0;i<=ar.length-l;i++) {
                int j=i+l-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    mul=dp[i][k]+dp[k+1][j]+(color[i][k]*color[k+1][j]);
                    if(mul<dp[i][j]){
                        dp[i][j]=mul;
                        color[i][j]=(color[i][k]+color[k+1][j])%100;
                    }
                }
            }
        }
        return dp[0][ar.length-1];
    }
}