//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class Bai4 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new FileReader("SV.in"));
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        int test = Integer.parseInt(bf.readLine());
//        for(int i = 1;i<=test;++i){
//            SinhVien sv = new SinhVien(bf.readLine(),bf.readLine(),bf.readLine(),Double.parseDouble(bf.readLine()));
//            sv.ChuanHoa(i);
//            arr.add(sv);
//        }
//
//        for(SinhVien x : arr) System.out.println(x);
//    }
//}
//
//class SinhVien {
//    public String MSV;
//    public String ten;
//    public String lop;
//    public String ngaySinh;
//    public double GPA;
//
//    public SinhVien(String ten, String lop, String ngaySinh, double GPA) {
//        this.MSV = "B20DCCN";
//        this.ten = ten;
//        this.lop = lop;
//        this.ngaySinh = ngaySinh;
//        this.GPA = GPA;
//    }
//
//    public void ChuanHoa(int stt){
//        // msv
//        String tmp = String.valueOf(stt);
//        while(tmp.length() != 3) tmp = "0" + tmp;
//        MSV += tmp;
//        // ngay sinh
//        if(ngaySinh.charAt(1) == '/') ngaySinh = "0" + ngaySinh;
//        if(ngaySinh.charAt(4) == '/'){
//            StringBuilder sb = new StringBuilder(ngaySinh);
//            sb.insert(3,"0");
//            ngaySinh = sb.toString();
//        }
//    }
//
//    @Override
//    public String toString() {
//        return MSV + " " + ten
//                + " " + lop + " " + ngaySinh + " " + String.format("%.2f",GPA);
//    }
//}
