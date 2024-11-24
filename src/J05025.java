import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> arr = new ArrayList<>();
        while (test-- > 0) {
            GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine());
            gv.ChuanHoaNganh();
            arr.add(gv);
        }
        Collections.sort(arr);
        for (GiaoVien x : arr) System.out.println(x);
    }
}

class GiaoVien implements Comparable<GiaoVien> {
    public static int cnt = 1;
    public String id;
    public String ten;
    public String nganh;
    public String tenSapXep;

    public GiaoVien(String ten, String nganh) {
        this.id = String.format("GV%02d", cnt++);
        this.ten = ten;
        this.nganh = nganh;
        //
        String[] tmp = this.ten.split("\\s+");
        this.tenSapXep = tmp[tmp.length - 1];
    }

    public void ChuanHoaNganh() {
        String[] tmp = nganh.split("\\s+");
        String res = "";
        for (String string : tmp) {
            res += String.valueOf(Character.toUpperCase(string.charAt(0)));
        }
        this.nganh = res;
    }

    @Override
    public int compareTo(GiaoVien o) {
        if (o.tenSapXep.compareTo(tenSapXep) == 0) {
            if (o.id.compareTo(id) > 0) return -1;
            return 1;
        } else {
            if (o.tenSapXep.compareTo(tenSapXep) > 0) return -1;
            return 1;
        }
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + nganh;
    }
}