//import java.util.Scanner;
//
//public class Bai2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ThiSinh x = new ThiSinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),
//                Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
//        x.TinhToan();
//        System.out.println(x);
//    }
//}
//
//class ThiSinh {
//    public String maThiSinh;
//    public String hoTen;
//    public double diemToan;
//    public double diemLy;
//    public double diemHoa;
//
//    public double diemUuTien;
//    public double tongDiem;
//    public String diemUuTienString;
//    public String tongDiemString;
//    public String trangThai;
//
//    public ThiSinh(String maThiSinh, String hoTen, double diemToan, double diemLy, double diemHoa) {
//        this.maThiSinh = maThiSinh;
//        this.hoTen = hoTen;
//        this.diemToan = diemToan;
//        this.diemLy = diemLy;
//        this.diemHoa = diemHoa;
//    }
//
//    public void TinhToan(){
//        // diem uu tien
//        String tmp = maThiSinh.substring(0,3);
//        if(tmp.equals("KV1")) diemUuTien = 0.5;
//        else if(tmp.equals("KV2")) diemUuTien = 1.0;
//        else diemUuTien = 2.5;
//
//        int diem = (int) diemUuTien;
//        if(diem == diemUuTien) diemUuTienString = String.format("%.0f",diemUuTien);
//        else diemUuTienString = String.format("%.1f",diemUuTien);
//
//        // diem tong
//        tongDiem = diemHoa + diemLy + diemToan*2;
//        diem = (int) tongDiem;
//        if(diem == tongDiem) tongDiemString = String.format("%.0f",tongDiem);
//        else tongDiemString = String.format("%.1f",tongDiem);
//
//        // tinh trang
//        if(tongDiem + diemUuTien >= 24) trangThai = "TRUNG TUYEN";
//        else trangThai = "TRUOT";
//    }
//    @Override
//    public String toString() {
//        return maThiSinh + " " + hoTen + " " + diemUuTienString + " " + tongDiemString +" " + trangThai;
//    }
//}
