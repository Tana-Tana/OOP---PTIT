import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien5020> arr = new ArrayList<>();
        while (test-- > 0) {
            SinhVien5020 sv = new SinhVien5020(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sv);
        }
        Collections.sort(arr);
        for (SinhVien5020 x : arr) System.out.println(x);
    }
}

class SinhVien5020 implements Comparable<SinhVien5020> {
    public String msv;
    public String ten;
    public String lop;
    public String email;

    public SinhVien5020(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien5020 o) {
        if (o.lop.compareTo(lop) == 0) {
            if (o.msv.compareTo(msv) > 0) return -1;
            return 1;
        } else {
            if (o.lop.compareTo(lop) > 0) return -1;
            return 1;
        }
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }
}
