import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            long n1 = scanner.nextLong();
            double n = (double)n1;
            long h1 = scanner.nextLong();
            double h = (double)h1;

            for(int i = 1;i<n;++i){
                double result =  h*h*(double) i/n;
                System.out.printf("%.6f ",Math.sqrt(result));
            }
            System.out.println();
        }
    }
}
