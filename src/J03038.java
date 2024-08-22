import java.util.HashSet;
import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < tmp.length(); ++i) hs.add(tmp.charAt(i));
        System.out.println(hs.size());
    }
}
