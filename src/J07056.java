import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07056 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("Data/KHACHHANG.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<HoGiaDinh> arr = new ArrayList<>();
        for (int i = 1; i <= test; ++i) {
            HoGiaDinh x = new HoGiaDinh(i, bf.readLine(), bf.readLine());
            x.ThongTin();
            x.ChuanHoaTen();
            x.TinhTienTrongDinhMuc();
            x.TinhTienVuotDinhMuc();
            x.TinhTienPhaiNop();
            arr.add(x);
        }
        Collections.sort(arr);
        for (HoGiaDinh x : arr) System.out.println(x);
    }
}

class HoGiaDinh implements Comparable<HoGiaDinh> {
    public String id;
    public String hoTen;
    public String tongThongTin;
    public String type;
    public int dinhMuc;
    public int chiSoDau;
    public int chiSoCuoi;
    public int tienTrongDinhMuc;
    public int tienVuotDinhMuc;
    public int thueVAT;
    public int tongTienTra;

    public HoGiaDinh(int i, String hoTen, String tongThongTin) {
        this.hoTen = hoTen;
        this.tongThongTin = tongThongTin;
        String tmp = String.valueOf(i);
        while (tmp.length() != 2) tmp = "0" + tmp;
        id = "KH" + tmp;
    }

    public void ChuanHoaTen() {
        String tmp = "";
        String[] nameString = this.hoTen.trim().toLowerCase().split("\\s+");
        for (String string : nameString) {
            tmp += String.valueOf(Character.toUpperCase(string.charAt(0))) + string.substring(1) + " ";
        }
        this.hoTen = tmp;
    }

    public void ThongTin() {
        String[] tmp = tongThongTin.split("\\s+");
        type = tmp[0];
        chiSoDau = Integer.parseInt(tmp[1]);
        chiSoCuoi = Integer.parseInt(tmp[2]);

        if (type.equals("A")) dinhMuc = 100;
        else if (type.equals("B")) dinhMuc = 500;
        else if (type.equals("C")) dinhMuc = 200;
    }

    public void TinhTienTrongDinhMuc() {
        if (chiSoCuoi - chiSoDau < dinhMuc) {
            tienTrongDinhMuc = (chiSoCuoi - chiSoDau) * 450;
        } else {
            if (chiSoCuoi - chiSoDau > dinhMuc) {
                tienTrongDinhMuc = dinhMuc * 450;
            }
        }
    }

    public void TinhTienVuotDinhMuc() {
        if (chiSoCuoi - chiSoDau > dinhMuc) {
            tienVuotDinhMuc = (chiSoCuoi - chiSoDau - dinhMuc) * 1000;
        } else tienVuotDinhMuc = 0;

        thueVAT = tienVuotDinhMuc * 5 / 100;
    }

    @Override
    public int compareTo(HoGiaDinh o) {
        if (o.tongTienTra > tongTienTra) return 1;
        return -1;
    }

    public void TinhTienPhaiNop() {
        tongTienTra = tienTrongDinhMuc + tienVuotDinhMuc + thueVAT;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + tienTrongDinhMuc + " " + tienVuotDinhMuc + " " + thueVAT + " " + tongTienTra;
    }
}
