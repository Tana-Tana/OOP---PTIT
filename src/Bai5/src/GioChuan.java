public class GioChuan {
    private String idMon;
    private String idGiangVien;
    private double gioChuan;
    private String tenGiangVien;
    private String infor;

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public GioChuan(String infor) {
        this.infor = infor;
    }

    public String getIdMon() {
        return idMon;
    }

    public String getIdGiangVien() {
        return idGiangVien;
    }

    public double getGioChuan() {
        return gioChuan;
    }

    public void XacDinhThongTin(){
        String[] nameString = this.infor.split("\\s+");
        this.idGiangVien = nameString[0];
        this.idMon = nameString[1];
        this.gioChuan = Double.parseDouble(nameString[2]);
    }
}
