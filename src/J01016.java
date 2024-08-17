import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp =  scanner.next();
        int cnt4 = 0;
        int cnt7 = 0;
        for(int i =0;i<tmp.length();++i) {
            if(tmp.charAt(i) == '4') cnt4++;
            else if(tmp.charAt(i) == '7') cnt7++;
        }
        if(cnt4 + cnt7 == 4) System.out.println("YES");
        else if(cnt4 + cnt7 == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
