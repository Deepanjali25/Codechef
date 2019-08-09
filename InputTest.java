package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputTest {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] ab = s.split("\\s",2);
        int n = Integer.parseInt(ab[0]);
        int k = Integer.parseInt(ab[1]);
        int c=0;
        while(n-- > 0){
            int t = Integer.parseInt(br.readLine());
            if(t%k == 0)
                c++;
        }
        System.out.println(c);
    }
}