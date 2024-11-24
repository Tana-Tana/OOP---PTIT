
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05055 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<DongVien> arr = new ArrayList<>();
        TreeMap<Long, Integer> hm = new TreeMap<>();
        while (test-- > 0) {
            DongVien x = new DongVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.TinhToan();
            if (hm.containsKey(x.timeXepHang)) {
                int k = hm.get(x.timeXepHang);
                hm.put(x.timeXepHang, ++k);
            } else hm.put(x.timeXepHang, 1);
            arr.add(x);
        }
        // xep hang
        int cnt = 1;
        for (Map.Entry<Long, Integer> entry : hm.entrySet()) {
            int cntCurrent = 0;
            for (DongVien x : arr) {
                if (x.timeXepHang == entry.getKey()) {
                    x.xepHang = cnt;
                    ++cntCurrent;
                }
            }
            cnt += cntCurrent;
        }

        // in
        for (DongVien x : arr) System.out.println(x);
    }
}

class DongVien implements Comparable<DongVien> {
    public String hoTen;
    public String ngaySinh;
    public String thoiGianXuatPhat;
    public String thoiGianDenDich;

    public String ma;
    public static int cnt = 1;

    public String thanhTichThucTe;
    public String uuTien;
    public String thanhTichXepHang;
    public int xepHang;
    public long timeXepHang;

    public DongVien(String hoTen, String ngaySinh, String thoiGianXuatPhat, String thoiGianDenDich) {
        this.ma = String.format("VDV%02d", cnt++);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.thoiGianXuatPhat = thoiGianXuatPhat;
        this.thoiGianDenDich = thoiGianDenDich;
    }

    public void TinhToan() throws ParseException {
        int namSinh = Integer.parseInt(ngaySinh.substring(ngaySinh.length() - 4, ngaySinh.length()));
        int tuoi = 2021 - namSinh;

        // thoi gian uu tien
        if (tuoi < 18) uuTien = "00:00:00";
        else if (tuoi < 25) uuTien = "00:00:01";
        else if (tuoi < 32) uuTien = "00:00:02";
        else uuTien = "00:00:03";
//        System.out.println(uuTien);

        // thoi gian thuc te
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date d1 = df.parse(thoiGianXuatPhat);
        Date d2 = df.parse(thoiGianDenDich);
        int timeGio = (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60));
        int timePhut = (int) ((d2.getTime() - d1.getTime()) / (1000 * 60)) - timeGio * 60;
        int timeGiay = (int) ((d2.getTime() - d1.getTime()) / (1000)) - timePhut * 60 - timeGio * 60 * 60;

        thanhTichThucTe = String.format("%02d:%02d:%02d", timeGio, timePhut, timeGiay);
//        System.out.println(thanhTichThucTe);

        // thoi gian xep hang
        Date d3 = df.parse(uuTien);
        Date d4 = df.parse(thanhTichThucTe);
        timeXepHang = (d4.getTime() - d3.getTime()) / 1000;

        timeGio = (int) timeXepHang / (60 * 60);
        timePhut = (int) timeXepHang / (60) - timeGio * 60;
        timeGiay = (int) (timeXepHang) - timeGio * 60 * 60 - timePhut * 60;
        thanhTichXepHang = String.format("%02d:%02d:%02d", timeGio, timePhut, timeGiay);

    }

    @Override
    public int compareTo(DongVien o) {
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + thanhTichThucTe + " " + uuTien + " " + thanhTichXepHang + " " + xepHang;
    }
}
