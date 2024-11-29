//import java.util.Scanner;
//
//public class Bai1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        NhanVien x  = new NhanVien(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
//        x.TinhToan();
//        System.out.println(x);
//    }
//}
//
//class NhanVien {
//    public String ten;
//    public int luong;
//    public int soNgayCong;
//    public String chucVu;
//    public int luongThang;
//    public int thuong;
//    public int phuCap;
//    public int thuNhap;
//    public String id  = "NV01";
//    public NhanVien(String ten, int luong, int soNgayCong, String chucVu) {
//        this.ten = ten;
//        this.luong = luong;
//        this.soNgayCong = soNgayCong;
//        this.chucVu = chucVu;
//    }
//
//    public void TinhToan() {
//        luongThang = luong * soNgayCong;
//        // thuong
//        double tmp = 0;
//        if(soNgayCong >= 25) tmp = 0.2;
//        else if(soNgayCong >= 22) tmp = 0.1;
//
//        thuong = (int) (luongThang * tmp);
//
//        // phu cap
//        if(chucVu.equals("GD")) phuCap = 250000;
//        else if(chucVu.equals("PGD")) phuCap = 200000;
//        else if(chucVu.equals("TP")) phuCap = 180000;
//        else if(chucVu.equals("NV")) phuCap = 150000;
//
//        // thu nhap
//        thuNhap = luongThang + thuong + phuCap;
//    }
//
//    @Override
//    public String toString() {
//        return id + " " + ten + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
//    }
//}