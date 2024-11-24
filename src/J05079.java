import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<LopHoc> arr = new ArrayList<>();
        while (test-- > 0) {
            LopHoc x = new LopHoc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr);
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String tmp = sc.nextLine();
            for (LopHoc x : arr) {
                if (x.ma.equals(tmp)) {
                    System.out.println("Danh sach nhom lop mon " + x.ten + ":");
                    break;
                }
            }

            for (LopHoc x : arr) {
                if (x.ma.equals(tmp)) {
                    System.out.println(x);
                }
            }
        }
    }
}

class LopHoc implements Comparable<LopHoc> {
    public String ma;
    public String ten;
    public String nhom;
    public String tenGiangVien;

    public LopHoc(String ma, String ten, String nhom, String tenGiangVien) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGiangVien = tenGiangVien;
    }

    @Override
    public String toString() {
        return nhom + " " + tenGiangVien;
    }

    @Override
    public int compareTo(LopHoc o) {
        if (o.nhom.compareTo(nhom) > 0) return -1;
        return 1;
    }
}

