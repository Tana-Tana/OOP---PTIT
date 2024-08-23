import java.util.Scanner;

public class J03040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- != 0) {
            String tmp = scanner.next();
            String tmp3 = "";
            for (int i = 5; i <= 7; ++i) {
                tmp3 += (char) tmp.charAt(i);
            }

            String tmp2 = "";
            for (int i = 9; i <= 10; ++i) tmp2 += (char) tmp.charAt(i);
            tmp = tmp3 + tmp2;
            if (Check1(tmp3, tmp2) || Check2(tmp) || Check3(tmp) || Check4(tmp))
                System.out.println("YES");
            else System.out.println("NO");

        }
    }


    private static boolean Check4(String tmp) {
        for (int i = 0; i < tmp.length(); ++i) {
            if (tmp.charAt(i) != '8' && tmp.charAt(i) != '6') return false;
        }
        return true;
    }

    private static boolean Check3(String tmp) {
        for (int i = 0; i < tmp.length() - 1; ++i) {
            if (tmp.charAt(i) != tmp.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean Check2(String tmp) {
        for (int i = 0; i < tmp.length() - 1; ++i) {
            if (tmp.charAt(i) >= tmp.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean Check1(String tmp3, String tmp2) {
        if (tmp3.charAt(0) != tmp3.charAt(1) || tmp3.charAt(1) != tmp3.charAt(2)) {
            return false;
        }
        if (tmp2.charAt(0) != tmp2.charAt(1)) return false;

        return true;
    }
}
