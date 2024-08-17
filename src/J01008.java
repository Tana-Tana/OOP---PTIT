
import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i=1;i<=test;++i){
            int n = scanner.nextInt();
            System.out.printf("Test %d:",i);
            for(int j = 2;j<= Math.sqrt(n);++j){
                int cnt = 0;
                while(n%j == 0){
                    ++cnt;
                    n/=j;
                }
                if(cnt!=0) System.out.printf(" %d(%d)",j,cnt);
            }
            if(n!=1) System.out.printf(" %d(1)\n",n);
            else System.out.println();
        }
    }
}
