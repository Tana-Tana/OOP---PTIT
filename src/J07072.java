import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07072 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("Data/DANHSACH.in"));
        ArrayList<HoTen1> arr1 = new ArrayList<HoTen1>();
        while (bf.ready()) {
            HoTen1 x = new HoTen1(bf.readLine());
            x.ChuanHoa();
            arr1.add(x);
        }
        Collections.sort(arr1);
        for (HoTen1 x : arr1) System.out.println(x);
    }
}

class HoTen1 implements Comparable<HoTen1> {
    public String hoTen;
    public String ho;
    public String ten;

    public HoTen1(String hoTen) {
        this.hoTen = hoTen;
    }

    public void ChuanHoa() {
        String[] tmp = hoTen.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String string : tmp) {
            res += (String.valueOf(Character.toUpperCase(string.charAt(0)))) + string.substring(1) + " ";
        }
        this.hoTen = res;
        String[] tmp1 = hoTen.split("\\s+");
        this.ho = tmp1[0];
        this.ten = tmp1[tmp1.length - 1];
    }

    @Override
    public int compareTo(HoTen1 o) {

        if (o.ten.compareTo(ten) == 0) {
            if (o.hoTen.compareTo(hoTen) > 0) return 1;
            return -1;
        } else {
            if (o.ten.compareTo(ten) > 0) return -1;
            return 1;
        }
    }

    @Override
    public String toString() {
        return hoTen;
    }
}