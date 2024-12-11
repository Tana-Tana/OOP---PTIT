public class Student {
    private String msv;
    private String name;
    private String lop;
    private String ngay;
    private double gpa;

    public Student(String name, String lop, String ngay, double gpa) {
        this.name = name;
        this.lop = lop;
        this.ngay = ngay;
        this.gpa = gpa;
        this.msv = "B20DCCN001";
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
