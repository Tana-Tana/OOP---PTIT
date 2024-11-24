import java.util.Scanner;

public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        long sum = 0;
        while (test-- > 0) {
            NhanVien5038 x = new NhanVien5038(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            x.TinhToan();
            System.out.println(x);
            sum += x.thucLinh;
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}

class NhanVien5038 implements Comparable<NhanVien5038> {
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

    public NhanVien5038(String ten, int luongNgay, int soNgayCong, String chucVu) {
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
    public int compareTo(NhanVien5038 o) {
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongThang + " " + thuong + " " + phuCapChucVu + " " + thucLinh;
    }
}
