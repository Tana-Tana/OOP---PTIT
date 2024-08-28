import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- != 0) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            if (a.equals(b)) System.out.println(-1);
            else System.out.println(Math.max(a.length(), b.length()));
        }
    }


}
