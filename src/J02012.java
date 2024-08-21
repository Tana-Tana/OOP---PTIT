import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;++i) a[i] = scanner.nextInt();

        System.out.println("Buoc 0: " + a[0]);

        for(int i=1;i<n;++i){
            int index = i -1;
            int tmp = a[i];
            while(index >= 0 && tmp < a[index]){
                a[index+1] = a[index];
                --index;
            }
            a[index+1] = tmp;
            System.out.print("Buoc "+ i + ":");
            for(int j = 0;j<=i;++j){
                System.out.print(" " + a[j]);
            }
            System.out.println();
        }
    }
}
