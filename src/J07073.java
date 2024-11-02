import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07073 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("MONHOC.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        while (test-- > 0) {
            MonHoc monHoc = new MonHoc(bf.readLine(), bf.readLine(), bf.readLine(), bf.readLine(), bf.readLine());
            arr.add(monHoc);
        }
        Collections.sort(arr);
        for (MonHoc x : arr) {
            if (!x.th.equals("Truc tiep")) {
                System.out.println(x);
            }
        }
    }
}

class MonHoc implements Comparable<MonHoc> {
    public String id;
    public String ten;
    public String slTin;
    public String lt;
    public String th;

    public MonHoc(String id, String ten, String slTin, String lt, String th) {
        this.id = id;
        this.ten = ten;
        this.slTin = slTin;
        this.lt = lt;
        this.th = th;
    }

    @Override
    public int compareTo(MonHoc o) {
        if (o.id.compareTo(id) < 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + slTin + " " + lt + " " + th;
    }
}