import java.util.ArrayList;
import java.util.Scanner;

public class J05027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien5027> arr = new ArrayList<>();
        while (test-- > 0) {
            GiaoVien5027 gv = new GiaoVien5027(sc.nextLine(), sc.nextLine());
            gv.SetMon();
            arr.add(gv);
        }

        int quest = Integer.parseInt(sc.nextLine());
        while (quest-- > 0) {
            String wordTest = sc.nextLine();
//            System.out.println(wordTest);
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + wordTest + ":");
            for (GiaoVien5027 x : arr) {
                if (x.CheckHoTen(wordTest.toUpperCase())) System.out.println(x);
            }
        }
    }
}

class GiaoVien5027 {
    public static int cnt = 1;
    public String id;
    public String hoTen;
    public String mon;

    public GiaoVien5027(String hoTen, String mon) {
        this.id = String.format("GV%02d", cnt++);
        this.hoTen = hoTen;
        this.mon = mon;
    }

    public void SetMon() {
        String[] tmp = this.mon.trim().split("\\s+");
        String res = "";
        for (String string : tmp) {
            res += String.valueOf(Character.toUpperCase(string.charAt(0)));
        }
        this.mon = res;
    }

    public boolean CheckHoTen(String wordTest) {
        String nameString = this.hoTen.toUpperCase();
        for (int i = 0; i + wordTest.length() <= nameString.length(); ++i) {
            String substring = nameString.substring(i, i + wordTest.length());
//            System.out.println(substring);
            if (substring.equals(wordTest)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + mon;
    }
}
