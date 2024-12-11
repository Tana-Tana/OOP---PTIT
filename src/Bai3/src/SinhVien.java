//public class SinhVien implements Comparable<SinhVien>{
//    private String msv;
//    private String hoTen;
//    private String lop;
//    private String email;
//    private String sdt;
//
//    public SinhVien(String msv, String hoTen, String lop, String email, String sdt) {
//        this.msv = msv;
//        this.hoTen = hoTen;
//        this.lop = lop;
//        this.email = email;
//        this.sdt = sdt;
//    }
//
//    public String getLop() {
//        return this.lop;
//    }
//
//    public String getMsv() {
//        return this.msv;
//    }
//
//    @Override
//    public int compareTo(SinhVien o) {
//        if(o.getLop().compareTo(getLop()) == 0){
//            if(o.getMsv().compareTo(getMsv()) >0 ) return -1;
//            return 1;
//        }
//        else{
//            if(o.getLop().compareTo(getLop()) > 0 ) return -1;
//            return 1;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return msv + " " + hoTen + " " + lop + " " + email + " 0" + sdt;
//    }
//}
