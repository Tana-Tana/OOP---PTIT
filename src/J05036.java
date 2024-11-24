import java.util.Scanner;

public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            MatHang5036 x = new MatHang5036(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            x.TinhToan();
            System.out.println(x);
        }
    }
}

class MatHang5036 implements Comparable<MatHang5036> {
    public String ma;
    public static int cnt = 1;
    public String ten;
    public String donVi;
    public float donGia;
    public int soLuong;

    public int phiVanChuyen;
    public int thanhTien;
    public int giaBan;

    public MatHang5036(String ten, String donVi, float donGia, int soLuong) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    @Override
    public int compareTo(MatHang5036 o) {
        return 0;
    }

    public void TinhToan() {
        phiVanChuyen = Math.round((donGia * soLuong) * 5 / 100);
        thanhTien = Math.round(donGia * soLuong + phiVanChuyen);
        giaBan = Math.round(thanhTien + (float) 2 * thanhTien / 100);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
    }
}
