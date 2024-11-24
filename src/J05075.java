import java.util.ArrayList;
import java.util.Scanner;

public class J05075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        int k = test;
        ArrayList<SinhVien5075> arrSinhVien = new ArrayList<>();
        while (test-- > 0) {
            SinhVien5075 x = new SinhVien5075(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arrSinhVien.add(x);
        }

        while (k-- > 0) {
            DiemChuyenCan5075 y = new DiemChuyenCan5075(sc.next(), sc.next());
//            System.out.println(y.msv);
            for (SinhVien5075 x : arrSinhVien) if (x.msv.equals(y.msv)) x.DiemChuyenCan5075 = y;

        }
        sc.nextLine();
        String tmp = sc.nextLine();
//        System.out.println(tmp);
        for (SinhVien5075 x : arrSinhVien) {
            x.TinhToan();
            if (tmp.equals(x.lop)) System.out.println(x);
        }
    }
}

class SinhVien5075 {
    public String msv, hoTen, lop;
    public DiemChuyenCan5075 DiemChuyenCan5075;
    public int diemCC = 10;
    public String nameStringDiemCC;

    public SinhVien5075(String msv, String hoTen, String lop) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public void TinhToan() {
        for (int i = 0; i < DiemChuyenCan5075.maDiemDanh.length(); ++i) {
            if (DiemChuyenCan5075.maDiemDanh.charAt(i) == 'v') diemCC -= 2;
            else if (DiemChuyenCan5075.maDiemDanh.charAt(i) == 'm') diemCC -= 1;
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

class DiemChuyenCan5075 {
    public String msv;
    public String maDiemDanh;


    public DiemChuyenCan5075(String msv, String maDiemDanh) {
        this.msv = msv;
        this.maDiemDanh = maDiemDanh;
    }


}