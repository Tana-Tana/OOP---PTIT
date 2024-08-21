import java.util.Scanner;

public class J03008 {
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

        while(l <= r){
            if(tmp.charAt(l)!=tmp.charAt(r)) return false;
            if(snt((int)(tmp.charAt(l)) - '0') == false || snt((int)(tmp.charAt(r)) - '0') == false) return false;
            ++l;
            --r;
        }
        return true;

    }

    private static boolean snt(int i) {
        if(i < 2) return false;
        for(int j=2;j<Math.sqrt(i);++j){
            if(i%j == 0 ) return  false;

        }
        return true;
    }
}
