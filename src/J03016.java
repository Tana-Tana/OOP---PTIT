import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = a.mod(BigInteger.valueOf(11));
            if (b.equals(BigInteger.valueOf(0))) System.out.println(1);
            else System.out.println(0);
        }
    }
}
