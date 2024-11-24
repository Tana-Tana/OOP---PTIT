import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J05057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh5057> arr = new ArrayList<>();
        while (test-- > 0) {
            ThiSinh5057 x = new ThiSinh5057(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            x.TinhToan();
            arr.add(x);
        }
        Collections.sort(arr);
        for (ThiSinh5057 x : arr) {
            System.out.println(x);
        }
    }
}

class ThiSinh5057 implements Comparable<ThiSinh5057> {
    public String maSV;
    public String hoTen;
    public float diemToan;
    public float diemLy;
    public float diemHoa;

    public float diemUuTien;
    public String diemUuTienString;
    public float tongDiem;
    public String tongDiemString;
    public String trangThai;

    public ThiSinh5057(String maSV, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void TinhToan() {
        // diem uu tien
        String tmp = maSV.substring(0, 3);
        if (tmp.equals("KV1")) diemUuTien = 0.5f;
        else if (tmp.equals("KV2")) diemUuTien = 1.0f;
        else if (tmp.equals("KV3")) diemUuTien = 2.5f;

        //
        int diemInt = (int) diemUuTien;
        if (diemInt == diemUuTien) diemUuTienString = String.format("%.0f", diemUuTien);
        else diemUuTienString = String.format("%.1f", diemUuTien);

        // tong diem
        tongDiem = diemHoa + diemLy + diemToan * 2 + diemUuTien;
        diemInt = (int) tongDiem;
        if (diemInt == tongDiem) tongDiemString = String.format("%.0f", tongDiem);
        else tongDiemString = String.format("%.1f", tongDiem);

        // tinh trang
        if (tongDiem >= 24) trangThai = "TRUNG TUYEN";
        else trangThai = "TRUOT";

    }

    @Override
    public int compareTo(ThiSinh5057 o) {
        if (o.tongDiem == tongDiem) {
            if (o.maSV.compareTo(maSV) < 0) return 1;
            return -1;
        } else {
            if (o.tongDiem > tongDiem) return 1;
            return -1;
        }


    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + diemUuTienString + " " + tongDiemString + " " + trangThai;
    }
}
