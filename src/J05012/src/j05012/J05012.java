/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author phant
 */
public class J05012 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> arr = new ArrayList<>();
        while(test-->0) {
            HoaDon x = new HoaDon(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())
                    , Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for(HoaDon x : arr) {
            System.out.println(x);
        }
    }
    
}

class HoaDon implements Comparable<HoaDon> {
    public String maMatHangString;
    public String tenMatHangString;
    public int soLuongMua;
    public long donGia;
    public long tienChietKhau;
    public long tongTien;

    public HoaDon(String maMatHangString, String tenMatHangString, int soLuongMua, long donGia, long tienChietKhau) {
        this.maMatHangString = maMatHangString;
        this.tenMatHangString = tenMatHangString;
        this.soLuongMua = soLuongMua;
        this.donGia = donGia;
        this.tienChietKhau = tienChietKhau;
    }
    
    public void TinhToan(){
        tongTien = donGia*soLuongMua - tienChietKhau;
    }
    
    @Override
    public int compareTo(HoaDon o) {
        if(o.tongTien > tongTien) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return maMatHangString + " " + tenMatHangString + " " + soLuongMua + " " + donGia + " " + tienChietKhau + " " + tongTien;
    }
    
    
    
}
