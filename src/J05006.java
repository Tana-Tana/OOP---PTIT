import java.util.Scanner;

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            System.out.println(nv.toString());
        }
    }
}

class NhanVien {
    public static int cnt = 1;
    public String id;
    public String ten;
    public String gioiTinh;
    public String ngaySinh;
    public String diaChi;
    public String mst;
    public String ngayKiHopDong;

    public NhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String mst, String ngayKiHopDong) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.mst = mst;
        this.ngayKiHopDong = ngayKiHopDong;
        this.id = String.format("%05d", cnt++);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + mst + " " + ngayKiHopDong;
    }
}
