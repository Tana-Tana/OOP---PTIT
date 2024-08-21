import java.util.Scanner;



public class J02010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<n;++i) arr[i] = scanner.nextInt();

        int cnt = 1;

        for(int i=0;i<n-1;++i){
            int check = 0;
            for(int j=i+1;j<n;++j){
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    check = 1;
                }
            }
            if(check == 1){
                System.out.print("Buoc " + cnt + ":");
                for(int j =0 ;j<n;++j) System.out.print(" " + arr[j]);
                System.out.println();
                ++cnt;
            }
            else break;
        }
    }
}
