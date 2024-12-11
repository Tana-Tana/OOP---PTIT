import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07038 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfFileSinhVien = new BufferedReader(new FileReader("SINHVIEN.in"));
        BufferedReader bfFileDN = new BufferedReader(new FileReader("DN.in"));
        BufferedReader bfFileThucTap = new BufferedReader(new FileReader("THUCTAP.in"));

        ArrayList<SinhVien> arrSinhVien = new ArrayList<>();
        ArrayList<DoanhNghiep> arrDoanhNghiep = new ArrayList<>();
        ArrayList<ThucTap> arrThucTap = new ArrayList<>();

        int test;

        test = Integer.parseInt(bfFileSinhVien.readLine());
        while (test-- > 0) {
            SinhVien x = new SinhVien(bfFileSinhVien.readLine(), bfFileSinhVien.readLine(), bfFileSinhVien.readLine(), bfFileSinhVien.readLine());
            arrSinhVien.add(x);
        }

        test = Integer.parseInt(bfFileDN.readLine());
        while (test-- > 0) {
            DoanhNghiep x = new DoanhNghiep(bfFileDN.readLine(), bfFileDN.readLine(), Integer.parseInt(bfFileDN.readLine()));
            arrDoanhNghiep.add(x);
        }

        test = Integer.parseInt(bfFileThucTap.readLine());
        while (test-- > 0) {
            String[] tmp = bfFileThucTap.readLine().trim().split("\\s+");
            ThucTap x = new ThucTap(tmp[0], tmp[1]);
            arrThucTap.add(x);
        }

        // xu li

        int quest = Integer.parseInt(bfFileThucTap.readLine());
        while (quest-- > 0) {
            ArrayList<KetQua> arrKetQua = new ArrayList<>();

            String idDoanhNghiep = bfFileThucTap.readLine();
            String tenDoanhNghiep = "";
            int soLuongCongNhan = 0;
            for (DoanhNghiep x : arrDoanhNghiep) {
                if (x.id.equals(idDoanhNghiep)) {
                    tenDoanhNghiep = x.ten;
                    soLuongCongNhan = x.soLuongNhanVien;
                    break;
                }
            }

            // duyet mang thuc tap de xem lay nhung thang msv nao
            for (ThucTap x : arrThucTap) {
                if (x.id.equals(idDoanhNghiep)) {
                    for (SinhVien y : arrSinhVien) {
                        if (y.msv.equals(x.msv)) {
                            KetQua z = new KetQua(y.msv, tenDoanhNghiep, y.lop, y.ten);
                            arrKetQua.add(z);
                        }
                    }
                }
            }

            Collections.sort(arrKetQua);
            System.out.println("DANH SACH THUC TAP TAI " + tenDoanhNghiep + ":");
            int cnt = 0;
            for (KetQua x : arrKetQua) {
                System.out.println(x);
                ++cnt;
                if (cnt == soLuongCongNhan) break;
            }
        }
    }
}

class SinhVien {
    public String ten;
    public String msv;
    public String lop;
    public String email;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        String[] tmp = ten.trim().toLowerCase().split("\\s+");
        String res = "";
        for (int i = 0; i < tmp.length; ++i) {
            res += String.valueOf(Character.toUpperCase(tmp[i].charAt(0))) + tmp[i].substring(1);
            if (i != tmp.length - 1) res += " ";
        }
        ten = res;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

}

class DoanhNghiep {
    public String id;
    public String ten;
    public int soLuongNhanVien;

    public DoanhNghiep(String id, String ten, int soLuongNhanVien) {
        this.id = id;
        this.ten = ten;
        this.soLuongNhanVien = soLuongNhanVien;
    }
}

class ThucTap {
    public String msv;
    public String id;

    public ThucTap(String msv, String id) {
        this.msv = msv;
        this.id = id;
    }
}

class KetQua implements Comparable<KetQua> {
    public String msvSinhVien;
    public String tenDoanhNghiep;
    public String lopSinhVien;
    public String tenSinhVien;

    public KetQua(String msvSinhVien, String tenDoanhNghiep, String lopSinhVien, String tenSinhVien) {
        this.msvSinhVien = msvSinhVien;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.lopSinhVien = lopSinhVien;
        this.tenSinhVien = tenSinhVien;
    }

    @Override
    public int compareTo(KetQua o) {
        if (o.msvSinhVien.compareTo(msvSinhVien) < 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return msvSinhVien + " " + tenSinhVien + " " + lopSinhVien;
    }
}