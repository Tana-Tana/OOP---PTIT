import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J07053 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("XETTUYEN.in"));
        int test = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= test; ++i) {
            Ts x = new Ts(bf.readLine(), bf.readLine(), Double.parseDouble(bf.readLine()), Double.parseDouble(bf.readLine()));
            x.Solve(i);
            System.out.println(x);
        }
    }
}

class Ts {
    public String ten;
    public String ngaySinh;
    public double lt;
    public double th;
    public String id;
    public double them;
    public String xepLoai;
    public int tong;
    public int tuoi;

    public Ts(String ten, String ngaySinh, double lt, double th) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.lt = lt;
        this.th = th;
        this.id = "PH";
    }

    public void Solve(int i) {
        // xet id
        String tmp = String.valueOf(i);
        while (tmp.length() != 2) tmp = "0" + tmp;
        id += tmp;
        // xet diem them
        if (lt >= 8 && th >= 8) them = 1f;
        else if (lt >= 7.5f && th >= 7.5f) them = 0.5f;
        else them = 0;

        // tong diem de xep loai
        double tongTB = (lt + th) / 2;
        tongTB += them;
        if (tongTB > 10) tongTB = 10f;
        tong = (int) Math.round(tongTB);

        // xep loai
        if (tong < 5) xepLoai = "Truot";
        else if (tong <= 6) xepLoai = "Trung binh";
        else if (tong <= 7) xepLoai = "Kha";
        else if (tong <= 8) xepLoai = "Gioi";
        else xepLoai = "Xuat sac";

        // tuoi
        if (ngaySinh.charAt(1) == '/') ngaySinh = "0" + ngaySinh;
        if (ngaySinh.charAt(4) == '/') {
            StringBuilder sb = new StringBuilder(ngaySinh);
            sb.insert(3, "0");
            ngaySinh = sb.toString();
        }
        int tmp2 = Integer.parseInt(ngaySinh.substring(6));
        tuoi = 2021 - tmp2;

        // ten
        String[] nameString = ten.trim().toLowerCase().split("\\s+");
        String tmp1 = "";
        for (String string : nameString) {
            tmp1 += String.valueOf(Character.toUpperCase(string.charAt(0))) + string.substring(1) + " ";
        }
        ten = tmp1;
    }

    @Override
    public String toString() {
        return id + " " + ten + tuoi + " " + tong + " " + xepLoai;
    }
}
