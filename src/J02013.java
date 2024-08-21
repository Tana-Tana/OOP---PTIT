import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;++i) a[i] = scanner.nextInt();

        int check = 0;
        int cnt = 1;
        for(int i = 0;i<n-1;++i){
            check = 0;
            for(int j = 0;j < n-1;++j){
                if(a[j] > a[j+1]){
                    check = 1;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if(check == 1){

                System.out.print("Buoc " + cnt + ":");
                for(int j =0;j<n;++j) System.out.print(" " + a[j]);
                System.out.println();
                ++cnt;
            }
        }
    }
}
