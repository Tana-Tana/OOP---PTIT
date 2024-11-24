import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class J05060 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<PhuHo> arr = new ArrayList<>();
        while (test-- > 0) {
            PhuHo x = new PhuHo(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            x.TinhToan();
            System.out.println(x);
        }
    }
}

class PhuHo implements Comparable<PhuHo> {
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

    public PhuHo(String hoTen, String ngaySinh, float diemLyThuyet, float diemThucHanh) {
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
    public int compareTo(PhuHo o) {
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + tuoi + " " + diem + " " + xepLoai;
    }
}
