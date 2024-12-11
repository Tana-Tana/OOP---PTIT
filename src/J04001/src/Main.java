//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int test = scanner.nextInt();
//        while (test-- != 0) {
//            PointClass pointClassOne = new PointClass(scanner.nextDouble(), scanner.nextDouble());
//            PointClass pointClassTwo = new PointClass(scanner.nextDouble(), scanner.nextDouble());
//            Distance(pointClassTwo, pointClassOne);
//        }
//    }
//
//    private static void Distance(PointClass a, PointClass b) {
//        double x = (a.getX() - b.getX()) * (a.getX() - b.getX());
//        double y = (a.getY() - b.getY()) * (a.getY() - b.getY());
//        double result = Math.sqrt(x + y);
//        System.out.printf("%.4f\n", result);
//    }
//
//}