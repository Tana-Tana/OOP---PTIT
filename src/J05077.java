import java.util.ArrayList;
import java.util.Scanner;

public class J05077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        ArrayList<PhongBan> arrPhongBan = new ArrayList<>();
        while (test-- > 0) {
            PhongBan x = new PhongBan(sc.next(), sc.nextLine());
            arrPhongBan.add(x);
        }
        test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            NhanVienCuaPhongBan x = new NhanVienCuaPhongBan(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            for (PhongBan y : arrPhongBan) {
                if (x.ma.substring(x.ma.length() - 2).equals(y.maPhong)) {
                    x.phongBan = y;
                    break;
                }
            }
            x.TinhToan();
            System.out.println(x);
        }
    }
}

class PhongBan {
    public String maPhong;
    public String tenPhong;

    public PhongBan(String maPhong, String tenPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
    }
}

class NhanVienCuaPhongBan {
    public String ma;
    public String ten;
    public int luongCoBan;
    public int soNgayCong;
    public int luongThang;
    public PhongBan phongBan;
    public int heSoNhan;
    public int soNamCongTac;

    public NhanVienCuaPhongBan(String ma, String ten, int luongCoBan, int soNgayCong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public void TinhToan() {
        soNamCongTac = Integer.parseInt(ma.substring(1, 3));
        if (ma.charAt(0) == 'A') {
            if (soNamCongTac <= 3) heSoNhan = 10;
            else if (soNamCongTac <= 8) heSoNhan = 12;
            else if (soNamCongTac <= 15) heSoNhan = 14;
            else heSoNhan = 20;
        } else if (ma.charAt(0) == 'B') {
            if (soNamCongTac <= 3) heSoNhan = 10;
            else if (soNamCongTac <= 8) heSoNhan = 11;
            else if (soNamCongTac <= 15) heSoNhan = 13;
            else heSoNhan = 16;
        } else if (ma.charAt(0) == 'C') {
            if (soNamCongTac <= 3) heSoNhan = 9;
            else if (soNamCongTac <= 8) heSoNhan = 10;
            else if (soNamCongTac <= 15) heSoNhan = 12;
            else heSoNhan = 14;
        } else if (ma.charAt(0) == 'D') {
            if (soNamCongTac <= 3) heSoNhan = 8;
            else if (soNamCongTac <= 8) heSoNhan = 9;
            else if (soNamCongTac <= 15) heSoNhan = 11;
            else heSoNhan = 13;
        }

        // luong thang
        luongThang = luongCoBan * 1000 * soNgayCong * heSoNhan;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phongBan.tenPhong + " " + luongThang;
    }
}
