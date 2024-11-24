import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<DonHang5053> arr = new ArrayList<>();
        while (test-- > 0) {
            DonHang5053 x = new DonHang5053(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for (DonHang5053 x : arr) System.out.println(x);
    }
}

class DonHang5053 implements Comparable<DonHang5053> {
    public String tenHang;
    public String maDonHang;
    public int donGia;
    public int soLuong;
    public String stt;

    public int giamGia;
    public int thanhTien;
    public int maInt;

    public DonHang5053(String tenHang, String maDonHang, int donGia, int soLuong) {
        this.tenHang = tenHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void TinhToan() {
        this.stt = this.maDonHang.substring(1, 4);
        maInt = Integer.parseInt(String.valueOf(maDonHang.charAt(maDonHang.length() - 1)));
        float tmp = 0f;
        if (maInt == 1) tmp = 0.5f;
        else tmp = 0.3f;

        this.giamGia = (int) (tmp * soLuong * donGia);
        thanhTien = donGia * soLuong - giamGia;
    }

    @Override
    public int compareTo(DonHang5053 o) {
        if (o.stt.compareTo(stt) < 0)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return tenHang + " " + maDonHang + " " + stt + " " + giamGia + " " + thanhTien;
    }
}
