//package danhsachsinhvien1;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.text.ParseException;
//import java.util.ArrayList;
//
//public class J07013 {
//    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
//        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("SV.in"));
//        ArrayList<SinhVien> arr = (ArrayList<SinhVien>) oi.readObject();
//        for (SinhVien x : arr) {
////            x.ChuanHoa();
//            System.out.println(x);
//        }
//    }
//}
//
////class SinhVien {
//    public String ma;
//    public String ten;
//    public String lop;
//    public String ngaySinh;
//    public float gpa;
//
//    public SinhVien(int cnt, String ten, String lop, String ngaySinh, float gpa) {
//        this.ma = String.format("B20DCCN%03d", cnt);
//        this.ten = ten;
//        this.lop = lop;
//        this.ngaySinh = ngaySinh;
//        this.gpa = gpa;
//    }
//
//    public void ChuanHoa() {
//        String tmp = ngaySinh;
//        if (tmp.charAt(1) == '/') tmp = "0" + tmp;
//        if (tmp.charAt(4) == '/') {
//            tmp = tmp.substring(0, 3) + "0" + tmp.substring(3);
//        }
//        ngaySinh = tmp;
//    }
//
//    @Override
//    public String toString() {
//        return ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
//
//    }
//}