public class Employee {
    private String mnv;
    private String ten;
    private long luong;
    private long ngay;
    private String cv;
    private long pc;
    private long thuong;
    public long getPc() {
        return pc;
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public void setPc(long pc) {
        this.pc = pc;
    }

    public long getThuong() {
        return thuong;
    }

    public void setThuong(long thuong) {
        this.thuong = thuong;
    }

    public Employee(String ten, long luong, long ngay, String cv) {
        this.ten = ten;
        this.luong = luong;
        this.ngay = ngay;
        this.cv = cv;
        if(this.cv.equals("GD")) pc =250000;
        else if(this.cv.equals("PGD")) pc = 200000;
        else if(this.cv.equals("TP")) pc = 180000;
        else if(this.cv.equals("NV")) pc =150000;

        if(this.ngay < 22) thuong = 0;
        else if(this.ngay <= 25) thuong = this.luong * this.ngay / 10;
        else thuong = this.luong *2 * this.ngay /10;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public long getNgay() {
        return ngay;
    }

    public void setNgay(long ngay) {
        this.ngay = ngay;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
