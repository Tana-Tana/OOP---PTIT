import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- != 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());

            BigInteger gcd = a.max(b).mod(a.min(b));

            if (gcd.equals(new BigInteger("0"))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
