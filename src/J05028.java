import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep5028> arr = new ArrayList<>();
        while (test-- > 0) {
            DoanhNghiep5028 dn = new DoanhNghiep5028(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(dn);
        }
        Collections.sort(arr);
        for (DoanhNghiep5028 x : arr) System.out.println(x);
    }
}

class DoanhNghiep5028 implements Comparable<DoanhNghiep5028> {
    public String ten;
    public String id;
    public int countSinhVien;

    public DoanhNghiep5028(String ten, String id, int countSinhVien) {
        this.ten = ten;
        this.id = id;
        this.countSinhVien = countSinhVien;
    }

    @Override
    public int compareTo(DoanhNghiep5028 o) {
        if (o.countSinhVien == countSinhVien) {
            if (o.ten.compareTo(ten) > 0) return -1;
            return 1;
        } else {
            if (o.countSinhVien > countSinhVien) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return ten + " " + id + " " + countSinhVien;
    }
}

