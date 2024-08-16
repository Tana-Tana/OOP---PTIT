import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test != 0){
            --test;
            int n = scanner.nextInt();
            System.out.println(String.valueOf((long)(n+1)*n/2));
        }
    }
}
