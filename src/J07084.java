import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class J07084 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bf = new BufferedReader(new FileReader("ONLINE.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<QuanLiSinhVien> arr = new ArrayList<>();
        while (test-- > 0) {
            QuanLiSinhVien x = new QuanLiSinhVien(bf.readLine(), bf.readLine(), bf.readLine());
            x.TinhThoiGian();
            arr.add(x);
        }
        Collections.sort(arr);
        for (QuanLiSinhVien x : arr) {
            System.out.println(x);
        }
    }
}

class QuanLiSinhVien implements Comparable<QuanLiSinhVien> {
    public String hoTen;
    public String thongTinBatDau;
    public String thongTinKetThuc;
    public String ngayBatDau;
    public String gioBatDau;
    public String ngayKetThuc;
    public String gioKetThuc;
    public long thoiGian;

    public QuanLiSinhVien(String hoTen, String thongTinBatDau, String thongTinKetThuc) {
        this.hoTen = hoTen;
        this.thongTinBatDau = thongTinBatDau;
        this.thongTinKetThuc = thongTinKetThuc;
    }

    public void TinhThoiGian() throws ParseException {
        //
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat tf = new SimpleDateFormat("HH:mm:ss");

        //
        String[] tmp = thongTinBatDau.split("\\s+");
        String[] tmp1 = thongTinKetThuc.split("\\s+");
        //
        int cnt = 0;
        ngayBatDau = tmp[cnt];
        ngayKetThuc = tmp1[cnt];
//        System.out.println(ngayBatDau + " " + ngayKetThuc);
        //
        ++cnt;
        gioBatDau = tmp[cnt];
        gioKetThuc = tmp1[cnt];
//        System.out.println(gioBatDau + " " + gioKetThuc);
        //
        thoiGian = -(df.parse(ngayBatDau)).getTime() - (tf.parse(gioBatDau)).getTime()
                + ((df.parse(ngayKetThuc)).getTime() + (tf.parse(gioKetThuc)).getTime());
    }

    @Override
    public int compareTo(QuanLiSinhVien o) {
        if (o.thoiGian == thoiGian) {
            if (o.hoTen.compareTo(hoTen) > 0) return -1;
            return 1;
        } else {
            if (o.thoiGian > thoiGian) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return hoTen + " " + String.valueOf(thoiGian / (1000 * 60));
    }
}
