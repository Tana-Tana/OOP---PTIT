import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;
        for(int i=1;i<=n;++i){
            long tmp = 1;
            for(int j =1;j<=i;++j) tmp*=j;
            result += tmp;
        }
        System.out.println(result);
    }
}
