import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<CongNhan5045> arr = new ArrayList<>();
        while (test-- > 0) {
            CongNhan5045 x = new CongNhan5045(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for (CongNhan5045 x : arr) System.out.println(x);
    }
}

class CongNhan5045 implements Comparable<CongNhan5045> {
    public String ma;
    public static int cnt = 1;
    public String ten;
    public String chucVu;
    public int luongCoBan;
    public int soNgayCong;

    public int phuCapChucVu;
    public int luongChinh;
    public int tamUng;
    public int conLai;
    public int thuThap;

    public CongNhan5045(String ten, String chucVu, int luongCoBan, int soNgayCong) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.ma = String.format("NV%02d", cnt++);
    }

    public void TinhToan() {
        luongChinh = luongCoBan * soNgayCong;
        if (chucVu.equals("GD")) phuCapChucVu = 500;
        else if (chucVu.equals("PGD")) phuCapChucVu = 400;
        else if (chucVu.equals("TP")) phuCapChucVu = 300;
        else if (chucVu.equals("KT")) phuCapChucVu = 250;
        else phuCapChucVu = 100;

        thuThap = luongChinh + phuCapChucVu;

        if ((phuCapChucVu + luongChinh) * 2 / 3 < 25000) {
            tamUng = (int) Math.round((double) ((phuCapChucVu + luongChinh) * 2) / 3000.0) * 1000;
        } else tamUng = 25000;
        conLai = thuThap - tamUng;
    }

    @Override
    public int compareTo(CongNhan5045 o) {
        if (o.thuThap == thuThap) {
            if (o.ma.compareTo(ma) > 0) return -1;
            return 1;
        } else {
            if (o.thuThap > thuThap) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phuCapChucVu + " " + luongChinh + " " + tamUng + " " + conLai;
    }
}
