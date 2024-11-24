import java.util.ArrayList;
import java.util.Scanner;

public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<CongNhan5044> arr = new ArrayList<>();
        while (test-- > 0) {
            CongNhan5044 x = new CongNhan5044(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            x.TinhToan();
            arr.add(x);
        }
        String nameString = sc.nextLine();
        for (CongNhan5044 x : arr) if (x.chucVu.equals(nameString)) System.out.println(x);
    }
}

class CongNhan5044 implements Comparable<CongNhan5044> {
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

    public CongNhan5044(String ten, String chucVu, int luongCoBan, int soNgayCong) {
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
    public int compareTo(CongNhan5044 o) {
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phuCapChucVu + " " + luongChinh + " " + tamUng + " " + conLai;
    }
}
