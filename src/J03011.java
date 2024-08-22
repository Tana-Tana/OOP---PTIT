import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-- != 0){
            String a = scanner.nextLine();
            String b = scanner.nextLine();

            BigInteger c = new BigInteger(a);
            BigInteger d = new BigInteger(b);
            BigInteger gcd = c.gcd(d);
            System.out.println(gcd);
        }
    }
}
