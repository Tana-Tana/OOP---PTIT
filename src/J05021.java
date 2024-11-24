import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien5021> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            SinhVien5021 sv = new SinhVien5021(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sv);
        }
        Collections.sort(arr);
        for (SinhVien5021 x : arr) System.out.println(x);
    }
}

class SinhVien5021 implements Comparable<SinhVien5021> {
    public String msv;
    public String ten;
    public String lop;
    public String email;

    public SinhVien5021(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien5021 o) {
        if (o.msv.compareTo(msv) > 0) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }
}
