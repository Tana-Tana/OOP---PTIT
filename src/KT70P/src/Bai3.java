import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        NhanCong[] nn=new NhanCong[n];
        for (int i = 0; i < n; i++) {
            nn[i] = new NhanCong();
            nn[i].input(in);
        }
        QLNhanCong q=new QLNhanCong(nn);
        q.out();
    }
}

class NhanCong {
    String ma,hovaten;
    long luongNgay;
    int songay,sma;
    long luongthang;
    long thuong;
    long tien;
    public void input(Scanner sc){
        hovaten = sc.nextLine();
        luongNgay = Long.parseLong(sc.nextLine());
        songay = Integer.parseInt(sc.nextLine());
        ma = "NV";
    }
}

class QLNhanCong {
    NhanCong[] x;
    public QLNhanCong(NhanCong[] a) {
        for(int i= 0;i<a.length;++i){
            String tmp = String.valueOf(i+1);
            while(tmp.length() != 3) tmp = "0" + tmp;
            a[i].ma += tmp;
            a[i].luongthang = a[i].luongNgay*a[i].songay;
            if(a[i].songay >=25) a[i].thuong = 20*a[i].luongthang /100;
            else if(a[i].songay >= 22) a[i].thuong = 10*a[i].luongthang /100;
            else a[i].thuong = 0;
            a[i].tien = a[i].thuong + a[i].luongthang;
        }
        x = a;
    }

    public void out(){
        for(int i=0;i<x.length;++i) System.out.println(x[i].ma + " " + x[i].hovaten + " " + x[i].tien);
    }
}
