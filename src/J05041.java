import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien5041> arr = new ArrayList<>();
        while (test-- > 0) {
            NhanVien5041 x = new NhanVien5041(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for (NhanVien5041 x : arr) System.out.println(x);
    }
}

class NhanVien5041 implements Comparable<NhanVien5041> {
    public String ma;
    public String ten;
    public int luongNgay;
    public int soNgayCong;
    public String chucVu;
    public static int cnt = 1;

    public int luongThang;
    public int thuong;
    public int phuCapChucVu;
    public int thucLinh;

    public NhanVien5041(String ten, int luongNgay, int soNgayCong, String chucVu) {
        this.ten = ten;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        this.ma = String.format("NV%02d", cnt++);
    }

    public void TinhToan() {
        luongThang = luongNgay * soNgayCong;
        if (soNgayCong >= 25) thuong = 20 * luongThang / 100;
        else if (soNgayCong >= 22) thuong = 10 * luongThang / 100;
        else thuong = 0;

        if (chucVu.equals("GD")) phuCapChucVu = 250000;
        else if (chucVu.equals("PGD")) phuCapChucVu = 200000;
        else if (chucVu.equals("TP")) phuCapChucVu = 180000;
        else if (chucVu.equals("NV")) phuCapChucVu = 150000;

        thucLinh = luongThang + thuong + phuCapChucVu;
    }

    @Override
    public int compareTo(NhanVien5041 o) {
        if (o.thucLinh > thucLinh) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongThang + " " + thuong + " " + phuCapChucVu + " " + thucLinh;
    }
}
