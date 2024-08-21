import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int z=1;z<=test;++z){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i=1;i<=n;++i) a[i] = sc.nextInt();

            // cong don
            int[] cd = new int[n+1];
            cd[1] = a[1];
            for(int i=2;i<=n;++i) cd[i] = cd[i-1] + a[i];

            //kiem tra
            boolean check = false;
            if(n < 3) System.out.println(-1);
            else{
                for(int i = 2;i<n;++i){
                    if(cd[i-1] == cd[n] - cd[i]){
                        check = true;
                        System.out.println(i);
                        break;
                    }
                }
                if(check == false) System.out.println(-1);
            }
        }
    }
}
