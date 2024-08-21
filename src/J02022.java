import java.util.ArrayList;
import java.util.Scanner;

public class J02022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            arrayList.clear();
            for(int i=0;i<100;++i) {
                vs[i] = 0;
                a[i] = 0;
            }
            int n = scanner.nextInt();
            Try(n,1);
            // kiểm tra số nào là số xa cách rồi in ra.
            for(long x : arrayList){
                if(Check(x)) System.out.println(x);
            }
        }


    }

    private static boolean Check(long x) {
        String tmp = String.valueOf(x);
        for(int i =0;i<tmp.length()-1;++i){
            if(Math.abs(tmp.charAt(i) - tmp.charAt(i+1)) == 1 ) return false;
        }
        return true;
    }

    private static int[] vs = new int[100];
    private static long[] a = new long[100];
    private static ArrayList<Long> arrayList = new ArrayList<>();
    private static void Try(int n,int i) {
        for(int j = 1;j<=n;++j){
            if(vs[j] == 0){
                a[i] = j;
                vs[j] = 1;
                if(i == n) WriteList(n);
                else Try(n,i+1);
                vs[j] = 0;
            }
        }
    }

    private static void WriteList(int n) {
        long number = 0;
        for(int i = 1; i <= n;++i) number = number*10 + a[i];
        arrayList.add(number);
    }


}
