import java.util.ArrayList;
import java.util.Scanner;

public class J06003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soSinhVien = sc.nextInt();
        int soNhom = sc.nextInt();
        sc.nextLine();

        ArrayList<SinhVien6003> arrSinhVien = new ArrayList<>();
        while (soSinhVien-- > 0) {
            SinhVien6003 x = new SinhVien6003(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arrSinhVien.add(x);
        }

        for (int i = 1; i <= soNhom; ++i) {
            String tmp = sc.nextLine();
            for (SinhVien6003 x : arrSinhVien) {
                if (x.sttNhom.equals(String.valueOf(i))) {
                    x.baiTapDangKy = tmp;
                }
            }
        }

        int quest = Integer.parseInt(sc.nextLine());
        while (quest-- > 0) {
            int nhom = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + nhom + ":");
            String res = "";
            for (SinhVien6003 x : arrSinhVien) {
                if (x.sttNhom.equals(String.valueOf(nhom))) {
                    System.out.println(x);
                    res = x.baiTapDangKy;
                }
            }
            System.out.println("Bai tap dang ky: " + res);
        }
    }
}

class SinhVien6003 {
    public String msv;
    public String hoTen;
    public String sdt;
    public String sttNhom;
    public String baiTapDangKy;

    public SinhVien6003(String msv, String hoTen, String sdt, String sttNhom) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.sttNhom = sttNhom;
    }

    @Override
    public String toString() {
        return msv + " " + hoTen + " " + sdt;
    }
}
