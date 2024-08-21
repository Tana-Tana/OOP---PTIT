import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;++i) a[i] = scanner.nextInt();
        int cnt = 1;
        for(int i=0;i<n-1;++i){
            int m = i;
            for(int j = i+1;j<n;++j){
                if(a[m] > a[j]) m =j;
            }
            int tmp = a[m];
            a[m] = a[i];
            a[i] = tmp;

            System.out.print("Buoc " + cnt + ":");
            ++cnt;
            for(int j=0;j<n;++j) System.out.print(" " + a[j]);
            System.out.println();
        }
    }
}
