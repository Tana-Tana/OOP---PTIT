import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J05054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        TreeMap<Double, Integer> tm = new TreeMap<>();
        ArrayList<HocSinh5054> arr = new ArrayList<>();
        while (test-- > 0) {
            HocSinh5054 x = new HocSinh5054(scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
            x.XepLoai();
            if (tm.containsKey(x.diemTB)) {
                int cnt = tm.get(x.diemTB);
                tm.put(x.diemTB, ++cnt);
            } else tm.put(x.diemTB, 1);
            arr.add(x);
        }

        // xep hang
        int cnt = 1;
        for (Map.Entry<Double, Integer> entry : tm.descendingMap().entrySet()) {
            int cntCurrent = 0;

            for (HocSinh5054 x : arr) {
                if (x.diemTB == entry.getKey()) {
                    ++cntCurrent;
                    x.xepHang = cnt;
                }
            }
            cnt += cntCurrent;
        }

        // in

        for (HocSinh5054 x : arr) System.out.println(x);
    }
}

class HocSinh5054 {
    public String id;
    public static int cnt = 1;
    public String hoTen;
    public double diemTB;
    public String xepLoai;
    public int xepHang;

    public HocSinh5054(String hoTen, double diemTB) {
        this.id = String.format("HS%02d", cnt++);
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public void XepLoai() {
        if (diemTB < 5) xepLoai = "Yeu";
        else if (diemTB < 7) xepLoai = "Trung Binh";
        else if (diemTB < 9) xepLoai = "Kha";
        else xepLoai = "Gioi";
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + String.format("%.1f ", diemTB) + xepLoai + " " + xepHang;
    }
}
