import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            int n = scanner.nextInt();
            if(CheckCase(n) == 0 ) System.out.println("NO");
            else System.out.println("YES");
        }
    }

    public  static int CheckCase(int n){
        while(n!=0) {
            if(n%10 != 0 && n%10 != 1 && n%10 != 2) return 0;
            n/=10;
        }
        return 1;
    }
}
