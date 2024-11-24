import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien5035> arr = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            SinhVien5035 sv = new SinhVien5035(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sv);
        }
        Collections.sort(arr);

        int quest = Integer.parseInt(sc.nextLine());
        while (quest-- > 0) {
            String nameString = sc.nextLine();
            for (SinhVien5035 x : arr) {
                if (x.doanhNghiep.equals(nameString)) System.out.println(x);
            }
        }
    }
}

class SinhVien5035 implements Comparable<SinhVien5035> {
    public int id;
    public String ma;
    public String hoTen;
    public String lop;
    public String email;
    public String doanhNghiep;
    public static int cnt = 1;

    public SinhVien5035(String ma, String hoTen, String lop, String email, String doanhNghiep) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
        this.id = cnt++;
    }

    @Override
    public int compareTo(SinhVien5035 o) {
        if (o.ma.compareTo(ma) > 0) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return id + " " + ma + " " + hoTen + " " + lop + " " + email + " " + doanhNghiep;
    }
}