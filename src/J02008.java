import java.util.Scanner;

public class J02008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            int n = scanner.nextInt();
            long res = 1;
            for(long i=1;i<=n;++i){
                res = LCM(i,res);
            }
            System.out.println(res);
        }
    }

    private static long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b,a%b);
    }
    private static long LCM(long i, long res) {
        long gcd = GCD(i,res);
        return i/gcd * res;
    }
}
