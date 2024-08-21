import java.util.Scanner;

public class J01021 {
    private static int MOD = (int) (1e9 + 7);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a==0 && b==0) break;
            System.out.println(String.valueOf((long)Solve(a,b)));
        }
    }

    private static long Solve(long a, long b) {
        long res = 1;
        while(b!=0) {
            if (b % 2 != 0) {
                res *= a;
                res %= MOD;
            }
            b /= 2;
            a *= a;
            a %= MOD;
        }
        return res;
    }
}
