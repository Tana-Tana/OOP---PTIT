import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[250];
        int[] b = new int[250];
        for(int i=0;i<250;++i) b[i] = 0;
        for(int i=0;i<n;++i) {
            a[i] = scanner.nextInt();
            b[a[i]] = 1;
        }
        boolean check = true;
        for(int i = 1;i<=a[n-1];++i){
            if(b[i] == 0) {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true) System.out.println("Excellent!");
    }
}
