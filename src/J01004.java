import java.util.Scanner;

public class J01004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0) {
            int number = scanner.nextInt();
            if(Sub(number) != 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static int Sub(int number) {
        if(number < 2) return 0;
        for(int i=2;i<=Math.sqrt((double) number);++i){
            if(number % i == 0 ) return 0;
        }
        return  1;
    }

}
