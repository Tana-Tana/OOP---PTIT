import java.util.Scanner;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameString = sc.next();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < nameString.length(); ++i) {
            //
            if (nameString.charAt(i) == '<') {
                if (cnt == 0) {
                    continue;
                } else --cnt;
            }
            //
            if (nameString.charAt(i) == '>') {
                if (cnt == sb.length() || sb.length() == 0) continue;
                else ++cnt;
            }
            //
            if (nameString.charAt(i) == '-') {
                if (sb.length() == 0 || cnt == 0) continue;
                else {
                    if (cnt != sb.length()) {
                        sb.delete(cnt, cnt + 1);
                    } else sb.delete(cnt - 1, cnt);
                    --cnt;
                }
            }

            //
            if (nameString.charAt(i) != '>' && nameString.charAt(i) != '<' && nameString.charAt(i) != '-') {
                sb.insert(cnt++, nameString.charAt(i));
            }
            //System.out.println(sb.toString() + ": " + cnt);
        }
        System.out.println(sb.toString());
    }
}
