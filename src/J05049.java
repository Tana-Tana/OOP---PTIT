import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang5049> arr = new ArrayList<>();
        while (test-- > 0) {
            DonHang5049 donHang5049 = new DonHang5049(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            donHang5049.TinhToan();
            arr.add(donHang5049);
        }
        Collections.sort(arr);
        String character = sc.nextLine();
        for (DonHang5049 x : arr) if (character.charAt(0) == x.ma.charAt(0)) System.out.println(x);
    }
}

class DonHang5049 implements Comparable<DonHang5049> {
    public String ma;
    public int soLuongNhap;
    public int soLuongXuat;
    public int donGia;
    public int tien;
    public int thue;

    public DonHang5049(String ma, int soLuongNhap) {
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
    public int compareTo(DonHang5049 o) {
        if (o.thue > thue) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien + " " + thue;
    }
}