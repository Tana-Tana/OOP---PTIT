import java.util.ArrayList;
import java.util.Scanner;

public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<CLB> arrCLB = new ArrayList<>();
        while (test-- > 0) {
            CLB clb = new CLB(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            arrCLB.add(clb);
        }

        test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            TranDau y = new TranDau(sc.next(), sc.nextLong());

            for (CLB x : arrCLB) {
                if (x.ma.equals(y.maTran.substring(1, 3))) {
                    y.clb = x;
                    break;
                }
            }
            y.Solve();
            System.out.println(y);
        }
    }
}

class CLB {
    public String ma;
    public String ten;
    public long giaVe;


    public CLB(String ma, String ten, long giaVe) {
        this.ma = ma;
        this.ten = ten;
        this.giaVe = giaVe;
    }
}

class TranDau {
    public String maTran;
    public long soLuongCoDongVien;

    public CLB clb;
    public long doanhThu;

    public TranDau(String ma, long soLuongCoDongVien) {
        this.maTran = ma;
        this.soLuongCoDongVien = soLuongCoDongVien;
    }

    public void Solve() {
        doanhThu = clb.giaVe * soLuongCoDongVien;
    }

    @Override
    public String toString() {
        return maTran + " " + clb.ten + " " + doanhThu;
    }
}
