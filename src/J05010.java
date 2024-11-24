import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang5010> arr = new ArrayList<>();
        while (test-- > 0) {
            MatHang5010 x = new MatHang5010(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr);
        for (MatHang5010 x : arr) System.out.println(x);
    }
}

class MatHang5010 implements Comparable<MatHang5010> {
    public String ten;
    public String loai;
    public double giaMua;
    public double giaBan;
    public double loiNhuan;
    public static int cnt = 1;
    public int ma;

    public MatHang5010(String ten, String loai, double giaMua, double giaBan) {
        this.ten = ten;
        this.loai = loai;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        loiNhuan = giaBan - giaMua;
        ma = cnt++;
    }

    @Override
    public int compareTo(MatHang5010 o) {
        if (o.loiNhuan > loiNhuan) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + loai + " " + String.format("%.2f", loiNhuan);
    }
}
