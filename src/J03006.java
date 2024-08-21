import java.util.Scanner;

public class J03006 {
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
            ++l;
            --r;
        }

        for(int i=0;i<tmp.length();++i) if((int)tmp.charAt(i) % 2 != 0) return false;
        return true;
    }
}
