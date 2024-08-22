import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test  = scanner.nextInt();
        int cnt = 1;
        while(test-- != 0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[][] a = new int[n+5][m+5];
            int[][] b = new int[m+5][n+5];
            for(int i =1;i<=n;++i){
                for(int j=1;j<=m;++j){
                    a[i][j] = scanner.nextInt();
                }
            }

            for(int i=1;i<=m;++i){
                for(int j =1;j<=n;++j){
                    b[i][j] = a[j][i];
                }
            }
            System.out.println("Test " + cnt + ":");
            Multi(a,b,n,m);
            ++cnt;
        }
    }

    private static void Multi(int[][] a, int[][] b,int n,int m) {

        for(int i=1;i<=n;++i){
            for(int j=1;j<=n;++j){
                int sum = 0;
                for(int z =1;z<=m;++z){
                    sum+=(a[i][z] * b[z][j]);
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
