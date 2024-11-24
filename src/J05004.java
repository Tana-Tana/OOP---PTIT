import java.util.Scanner;

public class J05004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            SinhVien5004 sv = new SinhVien5004(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
            sv.ChuanHoaNgaySinh();
            sv.ChuanHoaTen();
            System.out.println(sv.toString());
        }
    }
}

class SinhVien5004 {
    public static int cnt = 1;
    public String id;
    public String ten;
    public String lop;
    public String ngaySinh;
    public double GPA;

    public SinhVien5004(String ten, String lop, String ngaySinh, double GPA) {
        this.id = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.GPA = GPA;
    }

    public void ChuanHoaNgaySinh() {
        StringBuilder sb = new StringBuilder(ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        this.ngaySinh = sb.toString();
    }

    public void ChuanHoaTen() {
        String[] tmp = ten.toLowerCase().trim().split("\\s+");
        String res = "";
        for (int i = 0; i < tmp.length; ++i) {
            res += String.valueOf(Character.toUpperCase(tmp[i].charAt(0))) + tmp[i].substring(1);
            if (i != tmp.length - 1) res += " ";
        }
        this.ten = res;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", GPA);
    }
}