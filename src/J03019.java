import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        char maxCharacter = 'a';
        int len = tmp.length();
        ArrayList<Character> a = new ArrayList<>();
        for (int i = len - 1; i >= 0; --i) {
            if (tmp.charAt(i) >= maxCharacter) {
                a.add(tmp.charAt(i));
                maxCharacter = tmp.charAt(i);
            }
        }
        Collections.sort(a, Collections.reverseOrder());
        for (Character c : a) System.out.print(c);
    }
}
