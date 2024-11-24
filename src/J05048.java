import java.util.ArrayList;
import java.util.Scanner;

public class J05048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
//        ArrayList<DonHang> arr = new ArrayList<>();
        while (test-- > 0) {
            DonHang donHang = new DonHang(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            donHang.TinhToan();
//            arr.add(donHang);
            System.out.println(donHang);
        }
    }
}

class DonHang implements Comparable<DonHang> {
    public String ma;
    public int soLuongNhap;
    public int soLuongXuat;
    public int donGia;
    public int tien;
    public int thue;

    public DonHang(String ma, int soLuongNhap) {
        this.ma = ma.toUpperCase();
        this.soLuongNhap = soLuongNhap;
    }

    public void TinhToan() {
        if (ma.charAt(0) == 'A') soLuongXuat = (int) Math.round((1.0 * 60 * soLuongNhap) / 100);
        else soLuongXuat = (int) Math.round((1.0 * 70 * soLuongNhap) / 100);

        // don gia
        if (ma.charAt(ma.length() - 1) == 'Y') donGia = 110000;
        else donGia = 135000;

        // tien
        tien = soLuongXuat * donGia;

        // thue
        float thueFloat = 0;
        if (ma.charAt(0) == 'A' && ma.charAt(ma.length() - 1) == 'Y') thueFloat = 0.08f * tien;
        else if (ma.charAt(0) == 'A' && ma.charAt(ma.length() - 1) == 'N') thueFloat = 0.11f * tien;
        else if (ma.charAt(0) == 'B' && ma.charAt(ma.length() - 1) == 'Y') thueFloat = 0.17f * tien;
        else if (ma.charAt(0) == 'B' && ma.charAt(ma.length() - 1) == 'N') thueFloat = 0.22f * tien;
        thue = Math.round(thueFloat / 10) * 10;
    }

    @Override
    public int compareTo(DonHang o) {
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien + " " + thue;
    }
}