import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J06004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soSinhVien = sc.nextInt();
        int soNhom = sc.nextInt();
        sc.nextLine();

        ArrayList<SinhVien6004> arrSinhVien = new ArrayList<>();
        while (soSinhVien-- > 0) {
            SinhVien6004 x = new SinhVien6004(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arrSinhVien.add(x);
        }

        for (int i = 1; i <= soNhom; ++i) {
            String tmp = sc.nextLine();
            for (SinhVien6004 x : arrSinhVien) {
                if (x.sttNhom.equals(String.valueOf(i))) {
                    x.baiTapDangKy = tmp;
                }
            }
        }

        Collections.sort(arrSinhVien);
        for (SinhVien6004 x : arrSinhVien) System.out.println(x);
    }
}

class SinhVien6004 implements Comparable<SinhVien6004> {
    public String msv;
    public String hoTen;
    public String sdt;
    public String sttNhom;
    public String baiTapDangKy;

    public SinhVien6004(String msv, String hoTen, String sdt, String sttNhom) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.sttNhom = sttNhom;
    }

    @Override
    public String toString() {
        return msv + " " + hoTen + " " + sdt + " " + sttNhom + " " + baiTapDangKy;
    }

    @Override
    public int compareTo(SinhVien6004 o) {
        if (o.msv.compareTo(msv) > 0) return -1;
        return 1;
    }
}
