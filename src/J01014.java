import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        for (int i = 0; i < a; i++) {
            long n = scanner.nextLong();
            long res = 0;
            for (long j=2;j<=Math.sqrt(n);++j){
                while(n%j==0){
                    if(res < j) res = j;
                    n/=j;
                }
            }
            if(n > 1) if(res < n) res = n;
            System.out.println(res);
        }


    }
}
