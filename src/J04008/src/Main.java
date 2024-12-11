//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int test = scanner.nextInt();
//        while(test-- != 0){
//            Point point1 = new Point(scanner.nextDouble(),scanner.nextDouble());
//            Point point2 = new Point(scanner.nextDouble(),scanner.nextDouble());
//            Point point3 = new Point(scanner.nextDouble(),scanner.nextDouble());
//
//            double a = point1.Distance(point2);
//            double b = point1.Distance(point3);
//            double c = point2.Distance(point3);
//
//            // kiểm tra có phải tam giác không
//            if(a < b + c && a > Math.abs(b-c)  || b > Math.abs(a-c) && b < a + c || c < a + b && c > Math.abs(a-b)){
//                double cv = a + b + c;
//                System.out.printf("%.3f\n",cv);
//            }
//            else System.out.println("INVALID");
//        }
//    }
//}