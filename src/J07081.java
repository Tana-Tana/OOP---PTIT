import com.sun.nio.sctp.IllegalReceiveException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07081 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("SINHVIEN.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<SinhVien81> arr = new ArrayList<>();
        while (test-- > 0) {
            SinhVien81 x = new SinhVien81(bf.readLine(), bf.readLine(), bf.readLine(), bf.readLine());
            arr.add(x);
        }
        Collections.sort(arr);
        for (SinhVien81 x : arr) {
            System.out.println(x);
        }
    }
}

class SinhVien81 implements Comparable<SinhVien81> {
    public String msv;
    public String hoTen;
    public String soDT;
    public String email;
    public String ten;

    public SinhVien81(String msv, String hoTen, String soDT, String email) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.email = email;
        String[] tmp = hoTen.split("\\s+");
        this.ten = tmp[tmp.length - 1];
    }

    @Override
    public int compareTo(SinhVien81 o) {
        if (o.ten.compareTo(ten) == 0) {
            if (o.hoTen.compareTo(hoTen) == 0) {
                if (o.msv.compareTo(msv) > 0) return -1;
                return 1;
            } else {
                if (o.hoTen.compareTo(hoTen) > 0) return -1;
                return 1;
            }

        } else {
            if (o.ten.compareTo(ten) > 0) return -1;
            return 1;
        }
    }

    @Override
    public String toString() {
        return msv + " " + hoTen + " " + soDT + " " + email;
    }
}
