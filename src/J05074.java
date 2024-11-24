import java.util.ArrayList;
import java.util.Scanner;

public class J05074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        int k = test;
        ArrayList<SinhVien5074> arrSinhVien = new ArrayList<>();
        while (test-- > 0) {
            SinhVien5074 x = new SinhVien5074(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arrSinhVien.add(x);
        }

        while (k-- > 0) {
            DiemChuyenCan y = new DiemChuyenCan(sc.next(), sc.next());
//            System.out.println(y.msv);
            for (SinhVien5074 x : arrSinhVien) if (x.msv.equals(y.msv)) x.diemChuyenCan = y;

        }

        for (SinhVien5074 x : arrSinhVien) {
            x.TinhToan();
            System.out.println(x);
        }
    }
}

class SinhVien5074 {
    public String msv, hoTen, lop;
    public DiemChuyenCan diemChuyenCan;
    public int diemCC = 10;
    public String nameStringDiemCC;

    public SinhVien5074(String msv, String hoTen, String lop) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public void TinhToan() {
        for (int i = 0; i < diemChuyenCan.maDiemDanh.length(); ++i) {
            if (diemChuyenCan.maDiemDanh.charAt(i) == 'v') diemCC -= 2;
            else if (diemChuyenCan.maDiemDanh.charAt(i) == 'm') diemCC -= 1;
        }
        if (diemCC < 0) diemCC = 0;
        if (diemCC == 0) nameStringDiemCC = "0 KDDK";
        else nameStringDiemCC = String.valueOf(diemCC);
    }

    @Override
    public String toString() {
        return msv + " " + hoTen + " " + lop + " " + nameStringDiemCC;
    }
}

class DiemChuyenCan {
    public String msv;
    public String maDiemDanh;


    public DiemChuyenCan(String msv, String maDiemDanh) {
        this.msv = msv;
        this.maDiemDanh = maDiemDanh;
    }


}