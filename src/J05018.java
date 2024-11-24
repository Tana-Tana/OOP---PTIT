import java.util.*;

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> arr = new ArrayList<>();
        while (test-- > 0) {
            HocSinh x = new HocSinh(sc.nextLine(), sc.nextLine());
            x.TinhDiemTB();
            x.PhanLoai();
            arr.add(x);
        }
        Collections.sort(arr);
        for (HocSinh x : arr) System.out.println(x);
    }
}

class HocSinh implements Comparable<HocSinh> {
    public static int cnt = 1;
    public String ma;
    public String ten;
    public String thongTinDiem;
    public double[] mangDouble = new double[10];
    public double diemTB = 0;
    public String loai;

    public HocSinh(String ten, String thongTinDiem) {
        this.ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        this.thongTinDiem = thongTinDiem;
    }

    public void TinhDiemTB() {
        String[] tmp = thongTinDiem.split("\\s+");
        int cnt = 0;
        for (String x : tmp) {
            mangDouble[cnt++] = Double.parseDouble(x);
        }

        // tinh
        for (int i = 0; i < cnt; ++i) {
            if (i == 0 || i == 1) {
                diemTB += (mangDouble[i] * 2);
            } else {
                diemTB += (mangDouble[i] * 1);
            }
        }
        diemTB /= 12;
        diemTB = Math.round(diemTB * 10) / 10.0;
    }

    public void PhanLoai() {
        if (diemTB >= 9f) loai = "XUAT SAC";
        else if (diemTB >= 8f) loai = "GIOI";
        else if (diemTB >= 7f) loai = "KHA";
        else if (diemTB >= 5f) loai = "TB";
        else loai = "YEU";
    }

    @Override
    public int compareTo(HocSinh o) {
        if (o.diemTB == diemTB) {
            if (o.ma.compareTo(ma) > 0) return -1;
            return 1;
        } else {
            if (o.diemTB > diemTB) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f", diemTB) + " " + loai;
    }
}
