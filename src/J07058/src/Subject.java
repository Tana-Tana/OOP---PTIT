public class Subject implements Comparable<Subject>{
    private String maMon;
    private String tenMon;
    private String hinhThuc;

    public Subject(String maMon, String tenMon, String hinhThuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    @Override
    public int compareTo(Subject subject) {
        if(this.maMon.compareTo(subject.getMaMon()) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + hinhThuc;
    }
}
