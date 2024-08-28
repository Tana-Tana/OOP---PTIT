import java.util.ArrayList;
import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            String tmp = scanner.nextLine();
            String[] nameString = tmp.split("\\s+");

            int cntChan = 0;
            int cntLe = 0;
            int len = 0;
            for (String x : nameString) {
                try {
                    ++len;
                    int number = Integer.parseInt(x);
                    if (number % 2 == 0) ++cntChan;
                    else ++cntLe;
                } catch (NumberFormatException e) {
                    //
                }
            }
            if (len % 2 == 0 && cntChan > cntLe || len % 2 != 0 && cntLe > cntChan) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
