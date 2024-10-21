import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07057 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("THISINH.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<Ts57> arr = new ArrayList<>();
        for (int i = 1; i <= test; ++i) {
            Ts57 x = new Ts57(i, bf.readLine(), Float.parseFloat(bf.readLine()), bf.readLine(), Integer.parseInt(bf.readLine()));
            x.ChuanHoaTen();
            x.TinhDiemThi();
            x.XepLoai();
            arr.add(x);
        }
        Collections.sort(arr);
        for (Ts57 x : arr) System.out.println(x);
    }
}

class Ts57 implements Comparable<Ts57> {
    public String id;
    public String hoTen;
    public float diemThi;
    public String danToc;
    public int kv;
    public String status;

    public Ts57(int i, String hoTen, float diemThi, String danToc, int kv) {
        this.hoTen = hoTen;
        this.diemThi = diemThi;
        this.danToc = danToc;
        this.kv = kv;
        String tmp = String.valueOf(i);
        while (tmp.length() != 2) tmp = "0" + tmp;
        id = "TS" + tmp;
    }

    public void ChuanHoaTen() {
        String tmp = "";
        String[] nameString = this.hoTen.trim().toLowerCase().split("\\s+");
        for (String string : nameString) {
            tmp += String.valueOf(Character.toUpperCase(string.charAt(0))) + string.substring(1) + " ";
        }
        this.hoTen = tmp;
    }

    public void TinhDiemThi() {
        if (kv == 1) diemThi += 1.5f;
        else if (kv == 2) diemThi += 1f;
        if (!danToc.equals("Kinh")) diemThi += 1.5f;
    }

    public void XepLoai() {
        if (diemThi >= 20.5f) status = "Do";
        else status = "Truot";
    }

    @Override
    public String toString() {
        return id + " " + hoTen + String.format("%.1f", diemThi) + " " + status;
    }

    @Override
    public int compareTo(Ts57 o) {
        if (o.diemThi == diemThi) {
            if (o.id.compareTo(id) > 0) return -1;
            return 1;
        } else {
            if (o.diemThi > diemThi) return 1;
            return -1;
        }
    }
}
