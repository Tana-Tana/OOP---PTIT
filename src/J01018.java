import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-- != 0){
            String n = scanner.nextLine();
            int total = CheckSum(n);
            if(total%10==0 && CheckSide(n)!=0) System.out.println("YES");
            else System.out.println("NO");

        }
    }

    private static int CheckSide(String tmp) {
        for(int i = 0 ;i<tmp.length()-1;++i){
            if(Math.abs(tmp.charAt(i) - tmp.charAt(i+1)) != 2) return 0;
        }
        return 1;
    }

    private static int CheckSum(String n) {
        int sum = 0;
        for(int i=0;i<n.length();++i){
            sum += ((int)n.charAt(i) - '0');
        }
        return sum;
    }
}
