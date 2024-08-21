import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        for(int i =1;i<=test;++i){
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            BigInteger x = new BigInteger(a,10);
            BigInteger y = new BigInteger(b,10);

            BigInteger gcd = x.gcd(y);
            x = x.divide(gcd);
            x = x.multiply(y);
            System.out.println(x);
        }
    }
}
