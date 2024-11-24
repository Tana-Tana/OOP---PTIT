import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    public static int cnt = 1;

    public String getId() {
        return id;
    }

    private String id;
    private String ma;
    private String ten;
    private String diaChi;
    private int soLuongMua;
    private String thoiGianMua;
    private SanPham sanPham;
    private int tongTien;
    private int thoiHanBaoHanh;
    private String ngayHetHan;

    public KhachHang(String ten, String diaChi, String ma, int soLuongMua, String thoiGianMua) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.ma = ma;
        this.soLuongMua = soLuongMua;
        this.thoiGianMua = thoiGianMua;
        this.id = String.format("KH%02d", cnt++);
    }

    public String getMa() {
        return ma;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
    public String getThoiGianMua() {
        return thoiGianMua;
    }

    public void SetThoiHanBaoHanh() throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date thoiGianMua = df.parse(getThoiGianMua());
        thoiHanBaoHanh = (int) (thoiGianMua.getTime() + (sanPham.getThoiHanBaoHanh() * 60 * 1000));
    }

    public void SetNgayHetHan(){
        int ngayRes = Integer.parseInt(thoiGianMua.substring(0,2));
        int thangRes = Integer.parseInt(thoiGianMua.substring(3,5));
        int namRes = Integer.parseInt(thoiGianMua.substring(6));

        thangRes += sanPham.getThoiHanBaoHanh();
        namRes += thangRes/12;
        thangRes = thangRes -  (thangRes/12)*12;
        ngayHetHan = String.format("%02d/%02d/%04d",ngayRes,thangRes,namRes);
    }

    public void SetTongTien(){
        tongTien = soLuongMua * sanPham.getGia();
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + diaChi + " " + ma + " " +tongTien + " " + ngayHetHan;
    }

    @Override
    public int compareTo(KhachHang o) {
        if(o.thoiHanBaoHanh == thoiHanBaoHanh) {
            if(o.getId().compareTo(getId()) > 0 ) return -1;
            return 1;
        }
        else {
            if(o.thoiHanBaoHanh > thoiHanBaoHanh) return -1;
            return 1;
        }
    }
}
