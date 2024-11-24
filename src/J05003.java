import java.util.Scanner;

public class J05003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            SinhVien5003 sv = new SinhVien5003(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
            sv.ChuanHoaNgaySinh();
            System.out.println(sv.toString());
        }
    }
}

class SinhVien5003 {
    public static int cnt = 1;
    public String id;
    public String ten;
    public String lop;
    public String ngaySinh;
    public double GPA;

    public SinhVien5003(String ten, String lop, String ngaySinh, double GPA) {
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

    @Override
    public String toString() {
        return id + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", GPA);
    }
}
