import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J05007 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien5007> arr = new ArrayList<>();
        while (test-- > 0) {
            NhanVien5007 nv = new NhanVien5007(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            nv.TinhThoiGian();
            arr.add(nv);
        }
        Collections.sort(arr);
        for (NhanVien5007 nv : arr) System.out.println(nv.toString());
    }
}

class NhanVien5007 implements Comparable<NhanVien5007> {
    public static int cnt = 1;
    public String id;
    public String ten;
    public String gioiTinh;
    public String ngaySinh;
    public String diaChi;
    public String mst;
    public String ngayKiHopDong;
    public double thoiGian;

    public NhanVien5007(String ten, String gioiTinh, String ngaySinh, String diaChi, String mst, String ngayKiHopDong) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.mst = mst;
        this.ngayKiHopDong = ngayKiHopDong;
        this.id = String.format("%05d", cnt++);
    }

    public void TinhThoiGian() throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse(this.ngaySinh);
        Date dateCurrent = df.parse("09/11/2024");
        this.thoiGian = dateCurrent.getTime() - date.getTime();
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + mst + " " + ngayKiHopDong;
    }

    @Override
    public int compareTo(NhanVien5007 o) {
        if (o.thoiGian > thoiGian) return 1;
        return -1;
    }
}
