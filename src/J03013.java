import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test--  != 0 ){
            String a1 = scanner.next();
            String b1 = scanner.next();
            int ma1x = a1.length();
            if(ma1x < b1.length()) ma1x = b1.length();
            BigInteger a = new BigInteger(a1,10);
            BigInteger b = new BigInteger(b1,10);
            BigInteger c = a.subtract(b);
            c = c.abs();
            StringBuilder c1 = new StringBuilder(c.toString());
            while(c1.length() < ma1x) c1.insert(0, "0");
            System.out.println(c1);
        }
    }
}
