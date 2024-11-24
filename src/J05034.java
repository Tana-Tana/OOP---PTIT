import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien5034> arr = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            SinhVien5034 sv = new SinhVien5034(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sv);
        }
        Collections.sort(arr);

        int quest = Integer.parseInt(sc.nextLine());
        while (quest-- > 0) {
            String nameString = sc.nextLine();
            for (SinhVien5034 x : arr) {
                if (x.doanhNghiep.equals(nameString)) System.out.println(x);
            }
        }
    }
}

class SinhVien5034 implements Comparable<SinhVien5034> {
    public int id;
    public String ma;
    public String hoTen;
    public String lop;
    public String email;
    public String doanhNghiep;
    public static int cnt = 1;

    public SinhVien5034(String ma, String hoTen, String lop, String email, String doanhNghiep) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
        this.id = cnt++;
    }

    @Override
    public int compareTo(SinhVien5034 o) {
        if (o.hoTen.compareTo(hoTen) > 0) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return id + " " + ma + " " + hoTen + " " + lop + " " + email + " " + doanhNghiep;
    }
}