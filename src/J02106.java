import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n+1][4];
        for(int i=1;i<=n;++i){
            for(int j =1;j<=3;++j) a[i][j] = scanner.nextInt();
        }
        int res = 0;
        for(int i=1;i<=n;++i){
            int cnt = 0;
            for(int j =1;j<=3;++j) cnt += a[i][j];
            if(cnt > 3 - cnt) ++res;
        }
        System.out.println(res);
    }
}
