public class Employee {
    private String mnv;
    private String name;
    private String gt;
    private String ngayS;
    private String dc;
    private String mst;
    private String ngayKD;

    public Employee(String name, String gt, String ngayS, String dc, String mst, String ngayKD) {
        this.name = name;
        this.gt = gt;
        this.ngayS = ngayS;
        this.dc = dc;
        this.mst = mst;
        this.ngayKD = ngayKD;
        this.mnv = "00001";
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNgayS() {
        return ngayS;
    }

    public void setNgayS(String ngayS) {
        this.ngayS = ngayS;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getNgayKD() {
        return ngayKD;
    }

    public void setNgayKD(String ngayKD) {
        this.ngayKD = ngayKD;
    }
}
