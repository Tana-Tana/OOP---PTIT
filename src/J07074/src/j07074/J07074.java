
package j07074;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class J07074 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bfMonHoc = new BufferedReader(new FileReader("MONHOC.in"));
        BufferedReader bfLichGD = new BufferedReader(new FileReader("LICHGD.in"));
        
        ArrayList<MONHOC> arrMonhoc = new ArrayList<>();
        ArrayList<LICHGD> arrLichGD = new ArrayList<>();
        
        int test;
        test = Integer.parseInt(bfMonHoc.readLine());
        while(test-- > 0){
            MONHOC x  =new MONHOC(bfMonHoc.readLine(), bfMonHoc.readLine(), Integer.parseInt(bfMonHoc.readLine()));
            arrMonhoc.add(x);
        }
        
        test = Integer.parseInt(bfLichGD.readLine());
        while(test-- > 0){
            LICHGD x = new LICHGD(bfLichGD.readLine(), bfLichGD.readLine(), bfLichGD.readLine(),bfLichGD.readLine(),bfLichGD.readLine());
            arrLichGD.add(x);
        }
        // xu li
        String maMonHocString = bfLichGD.readLine();
        String tenMonHocString = "";
        ArrayList<KetQua> arr = new ArrayList<>();
        for(MONHOC x : arrMonhoc) {
            if(x.maMonString.equals(maMonHocString)){
                tenMonHocString = x.tenMonString;
                break;
            }
        }
        
        System.out.println("LICH GIANG DAY MON " + tenMonHocString + ":");
        for(LICHGD x : arrLichGD) {
            if(x.maMonString.equals(maMonHocString)) {
                KetQua y = new KetQua(x.maNhomString, x.thuString, x.kipString, x.hoTenGiangVien, x.phongHoc);
                arr.add(y);
            }
        }
        Collections.sort(arr);
        for(KetQua x : arr) {
            System.out.println(x);
        }
    }
    
}

class MONHOC {
    public String maMonString;
    public String tenMonString;
    public int soTinChi;

    public MONHOC(String maMonString, String tenMonString, int soTinChi) {
        this.maMonString = maMonString;
        this.tenMonString = tenMonString;
        this.soTinChi = soTinChi;
    }
    
}

class LICHGD {
    public String maNhomString;
    public static int cnt = 1;
    public String maMonString;
    public String thuString;
    public String kipString;
    public String hoTenGiangVien;
    public String phongHoc;

    public LICHGD(String maMonString, String thuString, String kipString, String hoTenGiangVien, String phongHoc) {
        this.maMonString = maMonString;
        this.thuString = thuString;
        this.kipString = kipString;
        this.hoTenGiangVien = hoTenGiangVien;
        this.phongHoc = phongHoc;
        maNhomString = String.format("HP%03d", cnt++);
    }
}

class KetQua implements Comparable<KetQua>{
    public String maNhomString;
    public String thu;
    public String kip;
    public String tenGiangVien;
    public String phongHoc;

    public KetQua(String maNhomString, String thu, String kip, String tenGiangVien, String phongHoc) {
        this.maNhomString = maNhomString;
        this.thu = thu;
        this.kip = kip;
        this.tenGiangVien = tenGiangVien;
        this.phongHoc = phongHoc;
    }
    
    
    
    @Override
    public int compareTo(KetQua o) {
        if(o.thu.compareTo(thu) == 0) {
            if(o.kip.compareTo(kip) == 0) {
                if(o.tenGiangVien.compareTo(tenGiangVien) > 0) return -1;
                return 1;
            }
            else {
                if(o.kip.compareTo(kip) > 0) return -1;
                return 1;
            }
        }
        else {
            if(o.thu.compareTo(thu) > 0) return -1;
            return 1;
        }
    }

    @Override
    public String toString() {
        return maNhomString + " " + thu + " " + kip + " " + tenGiangVien + " " + phongHoc;
    }
    
    
    
}