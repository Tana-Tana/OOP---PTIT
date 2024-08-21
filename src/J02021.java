import java.util.Scanner;

public class J02021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        a[0] = 0;
        Try(n,k,1);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
    private  static int[] a = new int[25];
    private static int cnt = 0;
    private static void Print(int k){
        ++cnt;
        for(int i=1;i<=k;++i) System.out.print(a[i]);
        System.out.print(" ");
    }

    private static void Try(int n,int k,int i){
        for(int j = a[i-1] + 1; j <= n-k+i;++j){
            a[i] = j;
            if(i == k) Print(k);
            else Try(n,k,i+1);
        }
    }
}
