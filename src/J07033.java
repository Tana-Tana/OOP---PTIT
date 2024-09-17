import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07033 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("SINHVIEN.in"));
        int t = Integer.parseInt(bf.readLine());
        ArrayList<SinhVien> arrayList = new ArrayList<>();
        while (t-- > 0) {
            SinhVien sinhVien = new SinhVien(bf.readLine(), bf.readLine(), bf.readLine(), bf.readLine());
            sinhVien.ChuanHoaTen();
            arrayList.add(sinhVien);
        }
        Collections.sort(arrayList);
        for (SinhVien sinhVien : arrayList) {
            System.out.println(sinhVien.toString());
        }
    }
}

// class Sinh vien
class SinhVien implements Comparable<SinhVien> {

    private String msv;
    private String ten;
    private String lop;
    private String email;

    public String getMsv() {
        return msv;
    }

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public void ChuanHoaTen() {
        ten = ten.trim();
        ten = ten.toLowerCase();
        String[] string = ten.split("\\s+");
        StringBuilder tmp = new StringBuilder("");
        for (String x : string) {
            tmp.append(String.valueOf(Character.toUpperCase(x.charAt(0))) + x.substring(1) + " ");
        }
        ten = tmp.toString();
    }

    @Override
    public int compareTo(SinhVien sinhVien) {
        if (this.msv.compareTo(sinhVien.getMsv()) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }
}
