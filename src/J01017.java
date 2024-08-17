import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 0; i < test; ++i){
            String tmp = scanner.next();
            int check  = 1;
            for(int j=0;j<tmp.length()-1;++j){
                if(Math.abs(tmp.charAt(j) - tmp.charAt(j+1)) != 1){
                    System.out.println("NO");
                    check =0;
                    break;
                }
            }
            if(check==1) System.out.println("YES");
        }
    }
}
