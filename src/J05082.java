import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J05082 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang5082> arr = new ArrayList<>();
        while (test-- > 0) {
            KhachHang5082 x = new KhachHang5082(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.ChuanHoa();
            arr.add(x);
        }
        Collections.sort(arr);
        for (KhachHang5082 x : arr) System.out.println(x);
    }
}

class KhachHang5082 implements Comparable<KhachHang5082> {
    public String ten;
    public String gioiTinh;
    public String ngaySinh;
    ;
    public String diaChi;
    public static int cnt = 1;
    public String id;

    public long ngaysinhLong;

    public KhachHang5082(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.id = String.format("KH%03d", cnt++);
    }

    public void ChuanHoa() throws ParseException {
        String[] tmp = ten.trim().toLowerCase().split("\\s+");
        String res = "";
        for (int i = 0; i < tmp.length; ++i) {
            res += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1);
            if (i != tmp.length - 1) res += " ";
        }
        ten = res;

        if (ngaySinh.charAt(1) == '/') ngaySinh = "0" + ngaySinh;
        if (ngaySinh.charAt(4) == '/') {
            StringBuilder sb = new StringBuilder(ngaySinh);
            sb.insert(3, '0');
            ngaySinh = sb.toString();
        }
        int nam = Integer.parseInt(ngaySinh.substring(6));
        String namString = String.format("%04d", nam);
        ngaySinh = ngaySinh.substring(0, 6) + namString;

        // tinh ngaySinh
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse(ngaySinh);
        ngaysinhLong = (int) (date.getTime() / 1000);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
    }

    @Override
    public int compareTo(KhachHang5082 o) {
        if (o.ngaysinhLong > ngaysinhLong) return -1;
        return 1;
    }
}