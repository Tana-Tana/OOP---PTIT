import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1  = scanner.nextInt();
        int y1  = scanner.nextInt();
        int x2  = scanner.nextInt();
        int y2  = scanner.nextInt();

        int x3  = scanner.nextInt();
        int y3  = scanner.nextInt();
        int x4  = scanner.nextInt();
        int y4  = scanner.nextInt();

        int x5,x6,y5,y6;
        if(x1 < x3) x5 = x1;
        else x5 = x3;

        if(y1 < y3) y5 = y1;
        else y5 = y3;


        if(x2 > x4) x6 = x2;
        else x6 = x4;

        if(y2 > y4) y6 = y2;
        else y6 = y4;

        if(x6 - x5 > y6 - y5) System.out.println(String.valueOf((x6-x5)*(x6-x5)));
        else System.out.println(String.valueOf((y6-y5)*(y6-y5)));
    }
}
