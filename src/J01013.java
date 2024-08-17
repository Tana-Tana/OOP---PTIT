import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] sumPrimeFactors = new long[2000001];

        // Sàng số nguyên tố kết hợp tính tổng ước số nguyên tố
        for (int i = 2; i <= 2000000; i++) {
            if (sumPrimeFactors[i] == 0) {
                for (int j = i; j <= 2000000; j += i) {
                    long tmp = j;
                    while (tmp % i == 0) {
                        sumPrimeFactors[j] += i;
                        tmp /= i;
                    }
                }
            }
        }

        long a = scanner.nextLong();
        long total = 0;

        for (int i = 0; i < a; i++) {
            int n = scanner.nextInt();
            total += sumPrimeFactors[n];
        }

        System.out.println(total);
    }
}
