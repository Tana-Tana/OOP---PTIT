import java.util.ArrayList;
import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            int n = scanner.nextInt();
            int[] arr = new int[n+1];
            for(int i=0;i<n;++i) arr[i] = scanner.nextInt();
            int check = 0;
            for(int i=0;i<n/2;++i){
                if(arr[i] != arr[n-i-1]){
                    check = 1;
                    break;
                }
            }
            if(check == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
