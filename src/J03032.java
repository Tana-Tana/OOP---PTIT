import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- != 0) {
            String s = scanner.nextLine();
            String[] tmp = s.split("\\s+");
            for (String x : tmp) {
                StringBuilder kama = new StringBuilder(x);
                kama.reverse();
                System.out.print(kama + " ");
            }
            System.out.println();
        }
    }
}
