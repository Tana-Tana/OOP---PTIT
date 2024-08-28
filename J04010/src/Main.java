
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while( test --> 0){
            Point point1 = new Point(scanner.nextDouble(),scanner.nextDouble());
            Point point2 = new Point(scanner.nextDouble(),scanner.nextDouble());
            Point point3 = new Point(scanner.nextDouble(),scanner.nextDouble());

            // 3 canh
            double a = point1.Distance(point2);
            double b = point1.Distance(point3);
            double c = point2.Distance(point3);

            if(a + b <= c || a + c <= b || b + c <= a){
                System.out.println("INVALID");
            } else {
                double p = (a + b + c) / 2.0;
                double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                double R = a*b*c / (4*S);
                System.out.println(String.format("%.3f",Math.PI * R * R));
            }
        }
    }
}