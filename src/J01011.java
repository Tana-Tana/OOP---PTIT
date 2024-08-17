import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- != 0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(b>a) {
                long tmp = a;
                a = b;
                b = tmp;
            }
            long res2 = getUCLN(a,b);
            long res1 = (a/res2) * b;

            System.out.println(res1 + " " + res2);
        }
    }

    private static long getUCLN(long a, long b) {
        if(b == 0) return a;
        return getUCLN(b,a%b);
    }


}
