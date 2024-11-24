import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J05061 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<PhuHo5061> arr = new ArrayList<>();
        while (test-- > 0) {
            PhuHo5061 x = new PhuHo5061(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for (PhuHo5061 x : arr) System.out.println(x);
    }
}

class PhuHo5061 implements Comparable<PhuHo5061> {
    public String hoTen;
    public String ngaySinh;
    public float diemLyThuyet;
    public float diemThucHanh;
    public int tuoi;
    public String ma;
    public static int cnt = 1;
    public int diem;
    public float diemThuong;
    public String xepLoai;

    public PhuHo5061(String hoTen, String ngaySinh, float diemLyThuyet, float diemThucHanh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        this.ma = String.format("PH%02d", cnt++);
    }

    public void TinhToan() throws ParseException {
        // tuoi
        tuoi = 2021 - Integer.parseInt(ngaySinh.substring(ngaySinh.length() - 4, ngaySinh.length()));

        // diem thuong
        if (diemLyThuyet >= 8 && diemThucHanh >= 8) diemThuong = 1f;
        else if (diemLyThuyet >= 7.5f && diemThucHanh >= 7.5f) diemThuong = 0.5f;
        else diemThuong = 0;

        // diem trung binh
        diem = Math.round((diemLyThuyet + diemThucHanh) / 2 + diemThuong);
        if (diem > 10) diem = 10;

        // xep loai
        if (diem < 5) xepLoai = "Truot";
        else if (diem <= 6) xepLoai = "Trung binh";
        else if (diem == 7) xepLoai = "Kha";
        else if (diem == 8) xepLoai = "Gioi";
        else xepLoai = "Xuat sac";
    }

    @Override
    public int compareTo(PhuHo5061 o) {
        if (o.diem == diem) {
            if (o.ma.compareTo(ma) < 0) return 1;
            return -1;
        } else {
            if (o.diem > diem) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + tuoi + " " + diem + " " + xepLoai;
    }
}
