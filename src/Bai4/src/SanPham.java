public class SanPham {
    private String ma;
    private String ten;
    private int gia;
    private int thoiHanBaoHanh;

    public SanPham(String ma, String ten, int gia, int thoiHanBaoHanh){
        this.ma = ma;
        this.ten= ten;
        this.gia = gia;
        this.thoiHanBaoHanh =thoiHanBaoHanh;
    }

    public String getMa() {
        return ma;
    }

    public int getThoiHanBaoHanh() {
        return thoiHanBaoHanh;
    }

    public int getGia() {
        return gia;
    }
}
