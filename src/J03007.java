import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-- != 0){
            String tmp = scanner.nextLine();
            if(CheckNumber(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean CheckNumber(String tmp) {
        int l = 0;
        int r = tmp.length() - 1;
        int sum = 0;
        if(tmp.charAt(l) != '8' || tmp.charAt(r) != '8') return false;

        while(l <= r){
            if(tmp.charAt(l)!=tmp.charAt(r)) return false;
            sum += ((int)(tmp.charAt(l) - '0'));
            sum += ((int)(tmp.charAt(r) - '0'));
            ++l;
            --r;
        }
        //System.out.println(sum);
        if(sum%10 != 0) return false;
        return true;

    }
}
