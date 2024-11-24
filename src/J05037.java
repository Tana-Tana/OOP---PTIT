import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang5037> arr = new ArrayList<>();
        while (test-- > 0) {
            MatHang5037 x = new MatHang5037(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for (MatHang5037 x : arr) System.out.println(x);
    }
}

class MatHang5037 implements Comparable<MatHang5037> {
    public String ma;
    public static int cnt = 1;
    public String ten;
    public String donVi;
    public float donGia;
    public int soLuong;

    public int phiVanChuyen;
    public int thanhTien;
    public int giaBan;

    public MatHang5037(String ten, String donVi, float donGia, int soLuong) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    @Override
    public int compareTo(MatHang5037 o) {
        if (o.giaBan > giaBan) return 1;
        return -1;
    }

    public void TinhToan() {
        phiVanChuyen = Math.round((donGia * soLuong) * 5 / 100);
        thanhTien = Math.round(donGia * soLuong + phiVanChuyen);
        giaBan = (thanhTien + 2 * thanhTien / 100) / soLuong;
        giaBan = (int) (Math.ceil(giaBan / 100.0) * 100);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
    }
}
