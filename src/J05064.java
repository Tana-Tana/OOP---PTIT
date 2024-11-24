import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class J05064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien5064> arr = new ArrayList<>();
        TreeMap<String, Integer> tm = new TreeMap<>();
        for (int i = 1; i <= test; ++i) {
            GiaoVien5064 x = new GiaoVien5064(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            x.Solve();
            if (tm.containsKey(x.maNgach.substring(0, 2))) {
                int k = tm.get(x.maNgach.substring(0, 2));
                tm.put(x.maNgach.substring(0, 2), ++k);
            } else tm.put(x.maNgach.substring(0, 2), 1);

            if (x.maNgach.substring(0, 2).equals("HT") && tm.get("HT") > 1 || x.maNgach.substring(0, 2).equals("HP") && tm.get("HP") > 2) {
                //
            } else arr.add(x);

        }
        for (GiaoVien5064 x : arr) System.out.println(x);
    }
}

class GiaoVien5064 implements Comparable<GiaoVien5064> {
    public String maNgach;
    public String hoTen;
    public int luong;
    public int bacLuong;
    public int phuCap;
    public int thuNhap;

    public GiaoVien5064(String maNgach, String hoTen, int luong) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public void Solve() {
        // phu cap
        String tmp = maNgach.substring(0, 2);
        if (tmp.equals("HT")) phuCap = 2000000;
        else if (tmp.equals("HP")) phuCap = 900000;
        else phuCap = 500000;

        // bac luong
        bacLuong = Integer.parseInt(maNgach.substring(maNgach.length() - 2, maNgach.length()));

        //thu nhap
        thuNhap = luong * bacLuong + phuCap;
    }

    @Override
    public int compareTo(GiaoVien5064 o) {
        return 0;
    }

    @Override
    public String toString() {
        return maNgach + " " + hoTen + " " + bacLuong + " " + phuCap + " " + thuNhap;
    }
}