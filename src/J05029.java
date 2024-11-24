import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep5029> arr = new ArrayList<>();
        while (test-- > 0) {
            DoanhNghiep5029 dn = new DoanhNghiep5029(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(dn);
        }
        Collections.sort(arr);
        int quest = Integer.parseInt(sc.nextLine());
        while (quest-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (DoanhNghiep5029 x : arr) {
                if (x.countSinhVien >= a && x.countSinhVien <= b) System.out.println(x);
            }
        }
    }
}

class DoanhNghiep5029 implements Comparable<DoanhNghiep5029> {
    public String ten;
    public String id;
    public int countSinhVien;

    public DoanhNghiep5029(String ten, String id, int countSinhVien) {
        this.ten = ten;
        this.id = id;
        this.countSinhVien = countSinhVien;
    }

    @Override
    public int compareTo(DoanhNghiep5029 o) {
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

