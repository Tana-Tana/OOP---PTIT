//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) throws IOException, ParseException {
//        BufferedReader bf = new BufferedReader(new FileReader("Data/MUAHANG.in"));
//        int test = Integer.parseInt(bf.readLine());
//        ArrayList<SanPham> arrSanPham = new ArrayList<>();
//
//        while(test-->0){
//            SanPham sanPham = new SanPham(bf.readLine(),bf.readLine(),Integer.parseInt(bf.readLine()),Integer.parseInt(bf.readLine()));
//            arrSanPham.add(sanPham);
//        }
//
//        ArrayList<KhachHang> arrKhachHang = new ArrayList<>();
//        test = Integer.parseInt(bf.readLine());
//        while(test-- >0) {
//            KhachHang khachHang = new KhachHang(bf.readLine(),bf.readLine(),bf.readLine(),Integer.parseInt(bf.readLine()),bf.readLine());
//            for(SanPham sanPham : arrSanPham){
//                if(sanPham.getMa().equals(khachHang.getMa())){
//                    khachHang.setSanPham(sanPham);
//                }
//            }
//
//            khachHang.SetTongTien();
//            khachHang.SetThoiHanBaoHanh();
//            khachHang.SetNgayHetHan();
//            arrKhachHang.add(khachHang);
//        }
//        Collections.sort(arrKhachHang);
//        for(KhachHang khachHang : arrKhachHang) System.out.println(khachHang);
//
//
//
//    }
//}