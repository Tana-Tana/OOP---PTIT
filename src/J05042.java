import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh5042> arr = new ArrayList<>();
        while (test-- > 0) {
            HocSinh5042 x = new HocSinh5042(sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr);
        for (HocSinh5042 x : arr) System.out.println(x);
    }
}

class HocSinh5042 implements Comparable<HocSinh5042> {
    public String ten;
    public String infor;

    public int soBai;
    public int soLuotSubmit;

    public HocSinh5042(String ten, String infor) {
        this.ten = ten;
        this.infor = infor;
        String[] tmp = this.infor.split("\\s+");
        soBai = Integer.parseInt(tmp[0]);
        soLuotSubmit = Integer.parseInt(tmp[1]);
    }

    @Override
    public int compareTo(HocSinh5042 o) {
        if (o.soBai == soBai) {
            if (o.soLuotSubmit == soLuotSubmit) {
                if (o.ten.compareTo(ten) > 0) return -1;
                return 1;
            } else {
                if (o.soLuotSubmit > soLuotSubmit) return -1;
                return 1;
            }
        } else {
            if (o.soBai < soBai) return -1;
            return 1;
        }
    }

    @Override
    public String toString() {
        return ten + " " + infor;
    }
}
