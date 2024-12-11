import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J07078 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("STRING.in"));
        int test = Integer.parseInt(bf.readLine());
        while (test-- > 0) {
            String a = bf.readLine();
            String b = bf.readLine();

            for (int i = 0; i < a.length() - b.length(); ++i) {
                if (b.equals(a.substring(i, i + b.length()))) System.out.print(String.valueOf(i + 1) + " ");
            }
            System.out.println();
        }
    }
}
