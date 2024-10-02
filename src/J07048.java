import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07048 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("SANPHAM.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<Sanpham> arr = new ArrayList<>();
        while (test-- > 0) {
            Sanpham sanpham = new Sanpham(bf.readLine(), bf.readLine(), Integer.parseInt(bf.readLine()), Integer.parseInt(bf.readLine()));
            arr.add(sanpham);
        }

        Collections.sort(arr);
        for (Sanpham sanpham : arr) {
            System.out.println(sanpham.toString());
        }
    }
}

class Sanpham implements Comparable<Sanpham> {
    private String msp;
    private String ten;
    private int gia;
    private int hsd;

    public Sanpham(String msp, String ten, int gia, int hsd) {
        this.msp = msp;
        this.ten = ten;
        this.gia = gia;
        this.hsd = hsd;
    }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getHsd() {
        return hsd;
    }

    public void setHsd(int hsd) {
        this.hsd = hsd;
    }

    @Override
    public int compareTo(Sanpham o) {
        if (o.getGia() == this.gia) {
            if (o.getMsp().compareTo(this.msp) > 0) return -1;
            return 1;
        } else {
            if (o.getGia() > this.gia) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return msp + " " + ten + " " + gia + " " + hsd;
    }
}
