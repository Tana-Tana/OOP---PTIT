//import java.util.Scanner;
//
//public class J04019 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
//            if (!a.valid()) {
//                System.out.println("INVALID");
//            } else {
//                System.out.println(a.getPerimeter());
//            }
//        }
//    }
//}
//
//class Point {
//    public double x;
//    public double y;
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public static Point nextPoint(Scanner scanner) {
//        Point x = new Point(scanner.nextDouble(), scanner.nextDouble());
//        return x;
//    }
//
//    public double Distance(Point a) {
//        return Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
//    }
//}
//
//class Triangle {
//    public Point point1;
//    public Point point2;
//    public Point point3;
//
//    public double edgeOne;
//    public double edgeTwo;
//    public double edgeThree;
//    public double chuVi;
//
//    public Triangle(Point point1, Point point2, Point point3) {
//        this.point1 = point1;
//        this.point2 = point2;
//        this.point3 = point3;
//
//        this.edgeOne = point1.Distance(point2);
//        this.edgeTwo = point1.Distance(point3);
//        this.edgeThree = point2.Distance(point3);
//    }
//
//    public boolean valid() {
//        if (edgeOne + edgeTwo > edgeThree && Math.abs(edgeOne - edgeTwo) < edgeThree) return true;
//        return false;
//    }
//
//    public String getPerimeter() {
//        this.chuVi = edgeOne + edgeThree + edgeTwo;
//        return String.format("%.3f", this.chuVi);
//    }
//}