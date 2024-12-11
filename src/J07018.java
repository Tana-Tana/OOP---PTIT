import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J07018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("SINHVIEN.in"));
        int test = Integer.parseInt(bf.readLine());
        while (test-- > 0) {
            SinhVien1 x = new SinhVien1(bf.readLine(), bf.readLine(), bf.readLine(), Float.parseFloat(bf.readLine()));
            x.TinhToan();
            System.out.println(x);
        }
    }
}

class SinhVien1 {
    public String ten;
    public String lop;
    public String ngaySinh;
    public float gpa;

    public String id;
    public static int cnt = 1;

    public SinhVien1(String ten, String lop, String ngaySinh, float gpa) {
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public void TinhToan() {
        // id
        id = String.format("B20DCCN%03d", cnt++);

        // chuan hoa ten
        String[] tmp = ten.toLowerCase().split("\\s+");
        String res = "";
        for (int i = 0; i < tmp.length; ++i) {
            res += String.valueOf(Character.toUpperCase(tmp[i].charAt(0))) + tmp[i].substring(1);
            if (i != tmp.length - 1) res += " ";
        }
        ten = res;

        // chuan hoa ngay sinh
        String tmpNgaySinh = ngaySinh;
        if (tmpNgaySinh.charAt(1) == '/') tmpNgaySinh = "0" + tmpNgaySinh;
        if (tmpNgaySinh.charAt(4) == '/') tmpNgaySinh = tmpNgaySinh.substring(0, 3) + "0" + tmpNgaySinh.substring(3);
        ngaySinh = tmpNgaySinh;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}
