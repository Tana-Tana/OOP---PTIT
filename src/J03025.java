import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- != 0) {
            StringBuilder tmp = new StringBuilder(scanner.nextLine());

            int l = 0;
            int r = tmp.length() - 1;
            while (l <= r) {
                if (tmp.charAt(l) != tmp.charAt(r)) break;
                ++l;
                --r;
            }

            if (l > r) {
                if (tmp.length() % 2 == 0) System.out.println("NO");
                else System.out.println("YES");
            } else {
                tmp.setCharAt(l, tmp.charAt(r));
                while (l <= r) {
                    if (tmp.charAt(l) != tmp.charAt(r)) break;
                    ++l;
                    --r;
                }
                if (l > r) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
