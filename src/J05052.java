import java.util.Scanner;

public class J05052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            DonHang5052 x = new DonHang5052(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
            x.TinhToan();
            System.out.println(x);
        }
    }
}

class DonHang5052 implements Comparable<DonHang5052> {
    public String tenHang;
    public String maDonHang;
    public int donGia;
    public int soLuong;
    public String stt;

    public int giamGia;
    public int thanhTien;

    public DonHang5052(String tenHang, String maDonHang, int donGia, int soLuong) {
        this.tenHang = tenHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void TinhToan() {
        this.stt = this.maDonHang.substring(1, 4);

        float tmp = 0f;
        if (maDonHang.charAt(maDonHang.length() - 1) == '1') tmp = 0.5f;
        else tmp = 0.3f;

        this.giamGia = (int) (tmp * soLuong * donGia);
        thanhTien = donGia * soLuong - giamGia;
    }

    @Override
    public int compareTo(DonHang5052 o) {
        return 0;
    }

    @Override
    public String toString() {
        return tenHang + " " + maDonHang + " " + stt + " " + giamGia + " " + thanhTien;
    }
}
