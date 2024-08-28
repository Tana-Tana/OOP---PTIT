import java.math.BigInteger;
import java.util.Scanner;

public class J03014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        BigInteger res = a.add(b);
        System.out.println(res);

    }
}
