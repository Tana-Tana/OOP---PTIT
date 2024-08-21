import java.util.Scanner;

public class J01022 {
    public static void main(String[] args) {
        long[] fibo = new long[95];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3;i<=92;++i) fibo[i] = fibo[i-1] + fibo[i-2];

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            char res = FindChar(n,k,fibo);
            System.out.println(res);
        }
    }

    private static char FindChar(long n, long k, long[] fibo) {
        if(n == 1) return '0';
        else if(n == 2) return '1';
        else {
            if(k <= fibo[(int)n-2]) return FindChar(n-2,k,fibo);
            else return FindChar(n-1,k - fibo[(int)n-2],fibo);
        }
    }
}
