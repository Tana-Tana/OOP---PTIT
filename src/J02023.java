import java.util.Scanner;

public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        String minString = "";
        String maxString = "";
        //
        if (9 * n < s || s > 0 && n == 0 || s == 0 && n > 0) {
            minString = "-1";
            maxString = "-1";
        } else {
            while (s >= 9 && n > 0) {
                maxString += "9";
                s -= 9;
                --n;
            }

            if (s == 0 && n > 0 || n == 0 && s > 0) {
                minString = "-1";
                maxString = "-1";
            } else {
                --n;
                maxString += String.valueOf(s);
                while (n-- > 0) maxString += "0";
//                System.out.println(maxString);
                StringBuilder sb1 = new StringBuilder(maxString);
                StringBuilder sb = sb1.reverse();
                int cnt = 0;
                while (sb.charAt(cnt) == '0') {
                    ++cnt;
                }
//                System.out.println(cnt);
                if (cnt > 0) {
                    sb.insert(0, 1);
                    sb.delete(cnt + 1, cnt + 2);
                    sb.insert(cnt, s - 1);
                    sb.delete(cnt + 1, cnt + 2);
                }
                minString = sb.toString();
            }
        }
        /*if (minString.equals(maxString)) System.out.println("-1 -1");
        else*/
        System.out.println(minString + " " + maxString);
    }
}
