import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien5026> arr = new ArrayList<>();
        while (test-- > 0) {
            GiaoVien5026 gv = new GiaoVien5026(sc.nextLine(), sc.nextLine());
            gv.ChuanHoaNganh();
            arr.add(gv);
        }

        int quest = Integer.parseInt(sc.nextLine());
        while (quest-- > 0) {
            String tmp = sc.nextLine();
            String[] tmp1 = tmp.split("\\s+");
            String res = "";
            for (String string : tmp1) {
                res += String.valueOf(Character.toUpperCase(string.charAt(0)));
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for (GiaoVien5026 x : arr) {
                if (x.nganh.equals(res)) System.out.println(x);
            }
        }
    }

}

class GiaoVien5026 {
    public static int cnt = 1;
    public String id;
    public String ten;
    public String nganh;
    public String tenSapXep;

    public GiaoVien5026(String ten, String nganh) {
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
    public String toString() {
        return id + " " + ten + " " + nganh;
    }
}
