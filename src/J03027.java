import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J03027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder tmp = new StringBuilder(scanner.next());
        int check = 0;
        while (tmp.length() > 0) {
            check = 0;
            for (int i = 0; i < tmp.length() - 1; ++i) {
                if (tmp.charAt(i) == tmp.charAt(i + 1)) {
                    check = 1;
                    tmp.delete(i, i + 2);
                    break;
                }
            }
            if (check == 0) break;
        }
        if (tmp.length() == 0) System.out.println("Empty String");
        else System.out.println(tmp);
    }
}
