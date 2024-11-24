import javax.net.ssl.SSLContextSpi;
import java.util.ArrayList;
import java.util.Scanner;

public class J05067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = Long.parseLong(sc.nextLine());
        ArrayList<XangDau> arr = new ArrayList<>();

        while (test-- > 0) {
            XangDau x = new XangDau(sc.next(), sc.nextInt());
            x.Solve();
            System.out.println(x);
        }
    }
}

class XangDau implements Comparable<XangDau> {
    public String maDonHang;
    public int soluong;

    public String hangSanXuat;
    public int donGia;
    public long thue;
    public long thanhTien;

    public XangDau(String maDonHang, int soluong) {
        this.maDonHang = maDonHang;
        this.soluong = soluong;
    }

    public void Solve() {
        // ma
        String tmpMa = maDonHang.substring(0, 1);
        double tmpThue = 0;
        if (tmpMa.equals("X")) {
            donGia = 128000;
            tmpThue = 0.03;
        } else if (tmpMa.equals("D")) {
            donGia = 11200;
            tmpThue = 0.035;
        } else if (tmpMa.equals("N")) {
            donGia = 9700;
            tmpThue = 0.02;
        }

        // hang xang
        String tmp = maDonHang.substring(maDonHang.length() - 2);
        if (tmp.equals("BP")) hangSanXuat = "British Petro";
        else if (tmp.equals("ES")) hangSanXuat = "Esso";
        else if (tmp.equals("SH")) hangSanXuat = "Shell";
        else if (tmp.equals("CA")) hangSanXuat = "Castrol";
        else if (tmp.equals("MO")) hangSanXuat = "Mobil";
        else {
            tmpThue = 0f;
            hangSanXuat = "Trong Nuoc";
        }

        // thanh tien
        thanhTien = (long) donGia * soluong;
        thue = (long) (thanhTien * tmpThue);
        thanhTien += thue;
    }

    @Override
    public int compareTo(XangDau o) {
        return 0;
    }

    @Override
    public String toString() {
        return maDonHang + " " + hangSanXuat + " " + donGia + " " + thue + " " + thanhTien;
    }
}