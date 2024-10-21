import java.awt.image.TileObserver;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07055 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("Data/BANGDIEM.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<OOPManager> arr = new ArrayList<>();
        for (int i = 1; i <= test; ++i) {
            OOPManager x = new OOPManager(i, bf.readLine(), Float.parseFloat(bf.readLine()), Float.parseFloat(bf.readLine()), Float.parseFloat(bf.readLine()));
            x.ChuanHoaTen();
            x.TinhDiemTrungBinh();
            x.PhanLoai();
            arr.add(x);
        }
        Collections.sort(arr);
        for (OOPManager x : arr) System.out.println(x);
    }
}

class OOPManager implements Comparable<OOPManager> {
    public String id;
    public String hoTen;
    public float score1;
    public float score2;
    public float score3;
    public float totalMedium;
    public String rank;

    public OOPManager(int i, String hoTen, float score1, float score2, float score3) {
        this.hoTen = hoTen;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        String tmp = String.valueOf(i);
        while (tmp.length() != 2) tmp = "0" + tmp;
        id = "SV" + tmp;
    }

    public void TinhDiemTrungBinh() {
        totalMedium = (float) (score1 * 0.25 + score2 * 0.35 + score3 * 0.4);
    }

    public void PhanLoai() {
        if (totalMedium >= 8f) rank = "GIOI";
        else if (totalMedium >= 6.5f) rank = "KHA";
        else if (totalMedium >= 5f) rank = "TRUNG BINH";
        else rank = "KEM";
    }

    public void ChuanHoaTen() {
        String tmp = "";
        String[] nameString = this.hoTen.trim().toLowerCase().split("\\s+");
        for (String string : nameString) {
            tmp += String.valueOf(Character.toUpperCase(string.charAt(0))) + string.substring(1) + " ";
        }
        this.hoTen = tmp;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + String.format("%.2f", totalMedium) + " " + rank;
    }

    @Override
    public int compareTo(OOPManager o) {
        if (o.totalMedium > totalMedium) return 1;
        return -1;
    }
}
