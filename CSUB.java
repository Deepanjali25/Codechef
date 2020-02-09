import java.util.Scanner;
class CSUB {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        try {
            int test = sc.nextInt();
            for(int k = 0 ; k < test ; k++){
                long count = 0;
                int len = sc.nextInt();
                String str = sc.next();
                for(int i = 0 ; i < len ; i++) {
                    if(str.charAt(i) == '1') {
                        count++;
                    }
                }
                System.out.println((count*(count+1))/2);
            }
        } catch(Exception e) {
            return;
        }
    }
}
