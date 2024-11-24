import java.util.*;

public class J05005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien5005> arr = new ArrayList<>();
        while (test-- > 0) {
            SinhVien5005 sv = new SinhVien5005(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
            sv.ChuanHoaNgaySinh();
            sv.ChuanHoaTen();
            arr.add(sv);
        }
        Collections.sort(arr);
        for (SinhVien5005 sv : arr) System.out.println(sv.toString());
    }

}

class SinhVien5005 implements Comparable<SinhVien5005> {
    public static int cnt = 1;
    public String id;
    public String ten;
    public String lop;
    public String ngaySinh;
    public double GPA;

    public SinhVien5005(String ten, String lop, String ngaySinh, double GPA) {
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

    @Override
    public int compareTo(SinhVien5005 o) {
        if (o.GPA > GPA) return 1;
        return -1;
    }
}
