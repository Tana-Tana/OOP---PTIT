import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            int n = scanner.nextInt();
            double number = Math.sqrt(n);
            int numberInt = (int)Math.sqrt(n);
            if(number == numberInt) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
