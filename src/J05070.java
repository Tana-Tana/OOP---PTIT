import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<CLB5070> arrCLB5070 = new ArrayList<>();
        while (test-- > 0) {
            CLB5070 cLB5070 = new CLB5070(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            arrCLB5070.add(cLB5070);
        }
        ArrayList<TranDau5070> arr = new ArrayList<>();
        test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            TranDau5070 y = new TranDau5070(sc.next(), sc.nextLong());

            for (CLB5070 x : arrCLB5070) {
                if (x.ma.equals(y.maTran.substring(1, 3))) {
                    y.cLB5070 = x;
                    break;
                }
            }
            y.Solve();
            arr.add(y);
        }
        Collections.sort(arr);
        for (TranDau5070 x : arr) System.out.println(x);
    }
}

class CLB5070 {
    public String ma;
    public String ten;
    public long giaVe;


    public CLB5070(String ma, String ten, long giaVe) {
        this.ma = ma;
        this.ten = ten;
        this.giaVe = giaVe;
    }
}

class TranDau5070 implements Comparable<TranDau5070> {
    public String maTran;
    public long soLuongCoDongVien;

    public CLB5070 cLB5070;
    public long doanhThu;

    public TranDau5070(String ma, long soLuongCoDongVien) {
        this.maTran = ma;
        this.soLuongCoDongVien = soLuongCoDongVien;
    }

    public void Solve() {
        doanhThu = cLB5070.giaVe * soLuongCoDongVien;
    }

    @Override
    public String toString() {
        return maTran + " " + cLB5070.ten + " " + doanhThu;
    }

    @Override
    public int compareTo(TranDau5070 o) {
        if (o.doanhThu == doanhThu) {
            if (o.cLB5070.ten.compareTo(cLB5070.ten) > 0) return -1;
            return 1;
        } else {
            if (o.doanhThu > doanhThu) return 1;
            return -1;
        }
    }
}
