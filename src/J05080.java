import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<LopHoc5080> arr = new ArrayList<>();
        while (test-- > 0) {
            LopHoc5080 x = new LopHoc5080(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr);
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String tmp = sc.nextLine();
            for (LopHoc5080 x : arr) {
                if (x.tenGiangVien.equals(tmp)) {
                    System.out.println("Danh sach cho giang vien " + x.tenGiangVien + ":");
                    break;
                }
            }

            for (LopHoc5080 x : arr) {
                if (x.tenGiangVien.equals(tmp)) {
                    System.out.println(x);
                }
            }
        }
    }
}

class LopHoc5080 implements Comparable<LopHoc5080> {
    public String ma;
    public String ten;
    public String nhom;
    public String tenGiangVien;

    public LopHoc5080(String ma, String ten, String nhom, String tenGiangVien) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGiangVien = tenGiangVien;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom;
    }

    @Override
    public int compareTo(LopHoc5080 o) {
        if (o.ma.compareTo(ma) == 0) {
            if (o.nhom.compareTo(nhom) > 0) return -1;
            return 1;
        } else {
            if (o.ma.compareTo(ma) > 0) return -1;
            return 1;
        }
    }
}

