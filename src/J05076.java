import java.util.ArrayList;
import java.util.Scanner;

public class J05076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang5076> arr = new ArrayList<>();
        while (test-- > 0) {
            MatHang5076 x = new MatHang5076(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            ThongTin5076 x = new ThongTin5076(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            for (MatHang5076 y : arr)
                if (y.ma.equals(x.ma)) {
                    y.thongTin5076 = x;
                    y.thongTin5076.Solve(y);
                    System.out.println(y);
                    break;
                }

        }


    }
}

class MatHang5076 {
    public String ma;
    public String ten;
    public String xepLoai;
    public ThongTin5076 thongTin5076;

    public MatHang5076(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + thongTin5076.giaTriNhap + " " + thongTin5076.giaTriXuat;
    }
}

class ThongTin5076 {
    public String ma;
    public int soLuongNhap;
    public int donGia;
    public int soLuongXuat;

    public int giaTriNhap;
    public int giaTriXuat;

    public ThongTin5076(String ma, int soLuongNhap, int donGia, int soLuongXuat) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        this.donGia = donGia;
        this.soLuongXuat = soLuongXuat;
    }

    public void Solve(MatHang5076 x) {
        giaTriNhap = donGia * soLuongNhap;

        // gia Tri xuat
        giaTriXuat = donGia * soLuongXuat;
        double tmp;
        String loai;
        if (x.xepLoai.equals("A")) tmp = 0.08;
        else if (x.xepLoai.equals("B")) tmp = 0.05;
        else tmp = 0.02;

        giaTriXuat = giaTriXuat + (int) (giaTriXuat * tmp);
    }
}
