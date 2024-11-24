import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class J05047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<LoHang5047> arr = new ArrayList<>();
        while (test-- > 0) {
            LoHang5047 loHang = new LoHang5047(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            loHang.TinhToan();
            arr.add(loHang);
        }
        Collections.sort(arr);
        for (LoHang5047 x : arr) {
            System.out.println(x);
        }

    }
}

class LoHang5047 implements Comparable<LoHang5047> {
    public static HashMap<String, Integer> map = new HashMap<>();
    public String ma = "";
    public String ten;
    public long soLuong;
    public long donGia;

    public long tienChietKhau;
    public long thanhTien;

    public LoHang5047(String ten, long soLuong, long donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        String[] tmp = this.ten.trim().split("\\s+");
        String[] x = this.ten.toUpperCase().split("\\s+");
        String y = String.valueOf(x[0].charAt(0)) + x[1].charAt(0);
        if (map.containsKey(y)) map.put(y, map.get(y) + 1);
        else map.put(y, 1);
        this.ma = String.format("%s%02d", y, map.get(y));
//        ma += tmp[1].charAt(0);
    }

    public void TinhToan() {
        float tmp = 0f;
        if (soLuong > 10) tmp = 0.05f;
        else if (soLuong >= 8) tmp = 0.02f;
        else if (soLuong >= 5) tmp = 0.01f;

        tienChietKhau = (int) (donGia * soLuong * tmp);

        thanhTien = donGia * soLuong - tienChietKhau;
    }

    @Override
    public int compareTo(LoHang5047 o) {
        if (o.tienChietKhau > tienChietKhau) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienChietKhau + " " + thanhTien;
    }
}
