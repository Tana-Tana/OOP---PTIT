import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07075 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader("MONHOC.in"));
        BufferedReader bf2 = new BufferedReader(new FileReader("LICHGD.in"));

        ArrayList<MonHoC> arrMH = new ArrayList<>();
        ArrayList<LichGD> arrLGD = new ArrayList<>();

        int test;
        test = Integer.parseInt(bf1.readLine());
        while (test-- > 0) {
            MonHoC x = new MonHoC(bf1.readLine(), bf1.readLine(), bf1.readLine());
            arrMH.add(x);
        }
        test = Integer.parseInt(bf2.readLine());
        while (test-- > 0) {
            LichGD x = new LichGD(bf2.readLine(), bf2.readLine(),
                    bf2.readLine(), bf2.readLine(), bf2.readLine());
            arrLGD.add(x);
        }

        ArrayList<KetQuaNe> arr = new ArrayList<>();
        String tenGiangVien = bf2.readLine();
        for (LichGD x : arrLGD) {
            if (x.tenGiangVien.equals(tenGiangVien)) {
                String tenMonHoc = "";
                // tim ten mon hoc
                for (MonHoC z : arrMH) {
                    if (z.maMon.equals(x.maMon)) {
                        tenMonHoc = z.tenMon;
                        break;
                    }
                }
                KetQuaNe y = new KetQuaNe(x.maNhom, tenMonHoc, x.thu, x.kip, x.phongHoc, x.tenGiangVien);
                arr.add(y);
            }
        }
        Collections.sort(arr);
        System.out.println("LICH GIANG DAY GIANG VIEN " + tenGiangVien + ":");
        for (KetQuaNe x : arr) {
            System.out.println(x);
        }
    }
}

class MonHoC {
    public String maMon;
    public String tenMon;
    public String soTinChi;

    public MonHoC(String maMon, String tenMon, String soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }
}

class LichGD {
    public String maNhom;
    public static int cnt = 1;
    public String maMon;
    public String thu;
    public String kip;
    public String tenGiangVien;
    public String phongHoc;

    public LichGD(String maMon, String thu, String kip, String tenGiangVien, String phongHoc) {
        this.maMon = maMon;
        this.thu = thu;
        this.kip = kip;
        this.tenGiangVien = tenGiangVien;
        this.phongHoc = phongHoc;
        this.maNhom = String.format("HP%03d", cnt++);
    }

}

class KetQuaNe implements Comparable<KetQuaNe> {
    public String maNhom;
    public String tenMonHoc;
    public String thu;
    public String kip;
    public String phongHoc;
    public String tenGiangVien;

    public KetQuaNe(String maNhom, String tenMonHoc, String thu, String kip, String phongHoc, String tenGiangVien) {
        this.maNhom = maNhom;
        this.tenMonHoc = tenMonHoc;
        this.thu = thu;
        this.kip = kip;
        this.phongHoc = phongHoc;
        this.tenGiangVien = tenGiangVien;
    }

    @Override
    public String toString() {
        return maNhom + " " + tenMonHoc + " " + thu + " " + kip + " " + phongHoc;
    }

    @Override
    public int compareTo(KetQuaNe o) {
        if (o.thu.compareTo(thu) == 0) {
            if (o.kip.compareTo(kip) == 0) {
                if (o.tenGiangVien.compareTo(tenGiangVien) > 0) return -1;
                return 1;
            } else {
                if (o.kip.compareTo(kip) > 0) return -1;
                return 1;
            }
        } else {
            if (o.thu.compareTo(thu) > 0) return -1;
            return 1;
        }
    }
}