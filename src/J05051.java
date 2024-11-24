import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<TienDien5051> arr = new ArrayList<>();
        while (test-- > 0) {
            TienDien5051 x = new TienDien5051(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for (TienDien5051 x : arr) System.out.println(x);
    }
}

class TienDien5051 implements Comparable<TienDien5051> {
    public String id;
    public static int cnt = 1;
    public String loaiSD;
    public int heSo;
    public int chiSoCu;
    public int chiSoMoi;

    public int thanhTien;
    public int phuTroi;
    public int tongTienTra;

    public TienDien5051(String loaiSD, int chiSoCu, int chiSoMoi) {
        this.id = String.format("KH%02d", cnt++);
        this.loaiSD = loaiSD;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public void TinhToan() {
        // he so
        if (loaiSD.equals("KD")) heSo = 3;
        else if (loaiSD.equals("NN")) heSo = 5;
        else if (loaiSD.equals("TT")) heSo = 4;
        else if (loaiSD.equals("CN")) heSo = 2;

        // thanh tien
        thanhTien = (chiSoMoi - chiSoCu) * heSo * 550;

        // phu troi
        if (chiSoMoi - chiSoCu < 50) phuTroi = 0;
        else if (chiSoMoi - chiSoCu <= 100) phuTroi = (int) Math.round((1.0 * thanhTien * 35) / 100);
        else phuTroi = thanhTien;

        // tong tien
        tongTienTra = phuTroi + thanhTien;
    }

    @Override
    public int compareTo(TienDien5051 o) {
        if (o.tongTienTra > tongTienTra) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + heSo + " " + thanhTien + " " + phuTroi + " " + tongTienTra;
    }
}
