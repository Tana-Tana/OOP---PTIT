import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien> {
    private String ma;
    private String ten;
    private String thoiGianDen;
    private String thoiGianVe;
    private int gio;
    private int phut;
    private String tinhTrang;
    private int thoiGianLamViec;

    public int getThoiGianLamViec(){
        return this.thoiGianLamViec;
    }
    public String getMa(){
        return this.ma;
    }
    public NhanVien(String ma, String ten, String gioDen, String gioVe) {
        this.ma = ma;
        this.ten = ten;
        this.thoiGianDen = gioDen;
        this.thoiGianVe = gioVe;
    }

    public void XacDinhThoiGian() throws ParseException {
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date checkIn = df.parse(this.thoiGianDen);
        Date checkOut = df.parse(this.thoiGianVe);
        this.thoiGianLamViec = (int)(checkOut.getTime() - checkIn.getTime());
        this.phut = this.thoiGianLamViec/ (1000*60);
        this.phut -= 60; // time break

        this.gio = this.phut/60;
        this.phut = this.phut - this.gio*60;

    }

    public void XacDinhTinhTrang(){
        if(this.gio < 8) this.tinhTrang = "THIEU";
        else this.tinhTrang = "DU";
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.gio + " gio " + this.phut + " phut " + this.tinhTrang;
    }

    @Override
    public int compareTo(NhanVien o) {
        if(o.getThoiGianLamViec() == getThoiGianLamViec()){
            if(o.getMa().compareTo(getMa()) > 0) return -1;
            return 1;
        }
        else{
            if(o.getThoiGianLamViec() > getThoiGianLamViec()) return 1;
            return -1;
        }
    }
}
