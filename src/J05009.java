import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<NguoiDithi> arr = new ArrayList<>();
        while (test-- > 0) {
            NguoiDithi x = new NguoiDithi(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())
                    , Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            x.TinhDiemTB();
            arr.add(x);
        }

        ArrayList<NguoiDithi> arrRes = new ArrayList<>();
        for (NguoiDithi x : arr) {
            if (x.diemTB == NguoiDithi.MAX_SCORE) arrRes.add(x);
        }
        Collections.sort(arrRes);
        for (NguoiDithi x : arrRes) System.out.println(x);
    }
}

class NguoiDithi implements Comparable<NguoiDithi> {
    public static int cnt = 1;
    public static double MAX_SCORE = 0;
    public int ma;
    public String ten;
    public String ngaySinh;
    public double diem1;
    public double diem2;
    public double diem3;
    public double diemTB;

    public NguoiDithi(String ten, String ngaySinh, double diem1, double diem2, double diem3) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.ma = cnt++;
    }

    public void TinhDiemTB() {
        diemTB = diem1 + diem2 + diem3;
        if (diemTB > MAX_SCORE) MAX_SCORE = diemTB;
    }


    @Override
    public int compareTo(NguoiDithi o) {
        if (o.ma > ma) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ngaySinh + " " + String.format("%.1f", MAX_SCORE);
    }
}
