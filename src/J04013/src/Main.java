//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        SinhVien sinhVien = new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat());
//
//        String tmp = sinhVien.getMSV().substring(0,3);
//        if(tmp.equals("KV1")) sinhVien.setKv(0.5f);
//        else if(tmp.equals("KV2")) sinhVien.setKv(1);
//        else sinhVien.setKv(2.5f);
//
//        float tong = sinhVien.getHoa()  + sinhVien.getLi() + sinhVien.getToan()*2 + sinhVien.getKv();
//            sinhVien.setDiem(tong);
//            System.out.print(sinhVien.getMSV() + " " + sinhVien.getName() + " ");
//            if(sinhVien.getKv() == (int)sinhVien.getKv()) System.out.printf("%.0f ",sinhVien.getKv());
//            else System.out.printf("%.1f ",sinhVien.getKv());
//
//            float diem = tong - sinhVien.getKv();
//            if(diem == (int)diem) System.out.printf("%.0f ",diem);
//            else System.out.printf("%.1f ",diem);
//
//            if(sinhVien.getDiem() < 24){
//                System.out.println("TRUOT");
//            } else System.out.println("TRUNG TUYEN");
//    }
//}