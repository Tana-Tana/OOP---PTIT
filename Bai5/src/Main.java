import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader("MONHOC.in"));
        BufferedReader bf2 = new BufferedReader(new FileReader("GIANGVIEN.in"));
        BufferedReader bf3 = new BufferedReader(new FileReader("GIOCHUAN.in"));

        int testbf1 = Integer.parseInt(bf1.readLine());
        int testbf2 = Integer.parseInt(bf2.readLine());
        int testbf3 = Integer.parseInt(bf3.readLine());

        ArrayList<GioChuan> arr = new ArrayList<>();
        ArrayList<MonHoc> arrMonHoc = new ArrayList<>();
        ArrayList<GiangVien> arrGiangVien = new ArrayList<>();

        while(testbf1-- > 0){
            MonHoc monHoc = new MonHoc(bf1.readLine());
            monHoc.XacDinhThongTin();
            arrMonHoc.add(monHoc);
        }

        while(testbf2-->0){
            GiangVien gv = new GiangVien(bf2.readLine());
            gv.XacDinhThongTin();
            arrGiangVien.add(gv);
        }

        while(testbf3-->0){
            GioChuan gc = new GioChuan(bf3.readLine());
            gc.XacDinhThongTin();
            arr.add(gc);
        }

        for(GiangVien giangVien : arrGiangVien){
            double sum = 0;
            for(GioChuan gioChuan : arr){
                if(giangVien.getId().equals(gioChuan.getIdGiangVien())) {
                    sum += gioChuan.getGioChuan();
                }
            }
            System.out.println(giangVien.getTen() + " " + String.format("%.2f",sum));
        }
    }
}