import java.util.ArrayList;
import java.util.Scanner;

public class J02101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0) {
            int n = scanner.nextInt();
            int[][] a = new int[n+1][n+1];
            for(int i = 1;i<=n;++i){
                for(int j=1;j<=n;++j) a[i][j] = scanner.nextInt();
            }
            for(int i=1;i<=n;++i){
                if(i%2==0){
                    for(int j=n;j>=1;--j) System.out.print(a[i][j] + " ");
                }
                else for(int j=1;j<=n;++j) System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
