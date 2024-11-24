import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class J05046 {
    public static <Map> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<LoHang> arr = new ArrayList<>();
        while (test-- > 0) {
            LoHang loHang = new LoHang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            loHang.TinhToan();
            arr.add(loHang);
        }

        TreeMap<String, Integer> tm = new TreeMap<>();
        for (LoHang x : arr) {
            if (tm.containsKey(x.ma)) {
                int cnt = tm.get(x.ma);
                ++cnt;
                tm.put(x.ma, cnt);

                x.ma += String.format("%02d", cnt);
                System.out.println(x);
            } else {
                tm.put(x.ma, 1);
                x.ma += "01";
                System.out.println(x);
            }
        }

    }
}

class LoHang implements Comparable<LoHang> {
    public String ma = "";
    public String ten;
    public int soLuong;
    public int donGia;

    public int tienChietKhau;
    public int thanhTien;

    public LoHang(String ten, int soLuong, int donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        String[] tmp = this.ten.split("\\s+");
        for (int i = 0; i < 2; ++i) ma += String.valueOf(Character.toUpperCase(tmp[i].charAt(0)));
    }

    public void TinhToan() {
        tienChietKhau = donGia * soLuong;
        if (soLuong > 10) tienChietKhau = (tienChietKhau * 5) / 100;
        else if (soLuong >= 8) tienChietKhau = (tienChietKhau * 2) / 100;
        else if (soLuong >= 5) tienChietKhau = (tienChietKhau) / 100;
        else tienChietKhau = 0;

        thanhTien = donGia * soLuong - tienChietKhau;
    }

    @Override
    public int compareTo(LoHang o) {
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienChietKhau + " " + thanhTien;
    }
}
