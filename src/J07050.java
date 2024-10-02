import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TooManyListenersException;

public class J07050 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("MATHANG.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 1; i <= test; ++i) {
            MatHang matHang = new MatHang(bf.readLine(), bf.readLine(), Float.parseFloat(bf.readLine()), Float.parseFloat(bf.readLine()));
            matHang.setMa(matHang.getMa(), i);
            arr.add(matHang);
        }
        Collections.sort(arr);
        for (MatHang matHang : arr) {
            matHang.Output();
        }
    }
}

class MatHang implements Comparable<MatHang> {
    private String ma;
    private String ten;
    private String nhom;
    private float giamua;
    private float giaban;
    private double loinhuan;

    public MatHang(String ten, String nhom, float giamua, float giaban) {
        this.ma = "MH";
        this.ten = ten;
        this.nhom = nhom;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = this.giaban - this.giamua;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma, int stt) {
        String tmp = String.valueOf(stt);
        if (tmp.length() == 1) tmp = "0" + tmp;
        this.ma += tmp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public float getGiamua() {
        return giamua;
    }

    public void setGiamua(float giamua) {
        this.giamua = giamua;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    @Override
    public int compareTo(MatHang o) {
        if (o.loinhuan > this.loinhuan) return 1;
        return -1;
    }

    public void Output() {
        System.out.print(ma + " " + ten + " " + nhom + " ");
        System.out.printf("%.2f\n", loinhuan);
    }
}
