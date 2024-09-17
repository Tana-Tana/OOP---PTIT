import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07037 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("DN.in"));
        int t = Integer.parseInt(bf.readLine());
        ArrayList<DoanhNghiep> arrayList = new ArrayList<>();
        while (t-- > 0) {
            DoanhNghiep doanhNghiep = new DoanhNghiep(bf.readLine(), bf.readLine(), bf.readLine());
            arrayList.add(doanhNghiep);
        }
        Collections.sort(arrayList);
        for (DoanhNghiep doanhNghiep : arrayList) {
            System.out.println(doanhNghiep.toString());
        }
    }
}

// class DN
class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma;
    private String ten;
    private String so;

    public DoanhNghiep(String ma, String ten, String so) {
        this.ma = ma;
        this.ten = ten;
        this.so = so;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + so;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if (this.ma.compareTo(o.getMa()) > 0) return 1;
        return -1;
    }
}
