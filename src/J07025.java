import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class J07025 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bf = new BufferedReader(new FileReader("KHACHHANG.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        while (test-- > 0) {
            KhachHang x = new KhachHang(bf.readLine(), bf.readLine(), bf.readLine(), bf.readLine());
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for (KhachHang x : arr) System.out.println(x);
    }
}

class KhachHang implements Comparable<KhachHang> {
    public String ten;
    public String gioiTinh;
    public String ngaySinh;
    public String diaChi;
    public String id;
    public static int cnt = 1;

    public long tuoi;

    public KhachHang(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.id = String.format("KH%03d", cnt++);
    }

    public void TinhToan() throws ParseException {
        // ten
        String[] tmp1 = ten.trim().toLowerCase().split("\\s+");
        String res = "";
        for (int i = 0; i < tmp1.length; ++i) {
            res += String.valueOf(Character.toUpperCase(tmp1[i].charAt(0))) + tmp1[i].substring(1);
            if (i != tmp1.length - 1) res += " ";
        }
        ten = res;

        // ngay sinh
        res = ngaySinh;
        if (res.charAt(1) == '/') res = "0" + res;
        if (res.charAt(4) == '/') res = res.substring(0, 3) + "0" + res.substring(3);
        ngaySinh = res;

        // tinh tuoi
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse(ngaySinh);
        tuoi = date.getTime();
    }

    @Override
    public int compareTo(KhachHang o) {
        if (o.tuoi > tuoi) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
    }
}