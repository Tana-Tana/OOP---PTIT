//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new FileReader("DANHSACH.in"));
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        while(bf.ready()) {
//            SinhVien sv = new SinhVien(bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine());
//            arr.add(sv);
//        }
//        Collections.sort(arr);
//        for(SinhVien x : arr) System.out.println(x);
//    }
//}