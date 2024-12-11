//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Student student = new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextDouble());
//        System.out.print(student.getMsv() + " " + student.getName() + " " + student.getLop() + " ");
//
//        // chuan hoa ngay thang nam sinh
//        String tmp = student.getNgay();
//        if(tmp.charAt(2)!='/') tmp = "0" + tmp;
//        if(tmp.charAt(5) != '/') {
//            StringBuilder sb = new StringBuilder(tmp);
//            sb.insert(3,"0");
//            tmp = sb.toString();
//        }
//        student.setNgay(tmp);
//        System.out.print(student.getNgay() + " ");
//        System.out.printf("%.2f",student.getGpa());
//    }
//}