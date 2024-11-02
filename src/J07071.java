import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class J07071 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("DANHSACH.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<TenNguoi> arr = new ArrayList<>();
        ArrayList<TenNguoi> arrResult = new ArrayList<>();
        while (test-- > 0) {
            TenNguoi tenNguoi = new TenNguoi(bf.readLine());
            arr.add(tenNguoi);
        }
        Collections.sort(arr);
        int quest = Integer.parseInt(bf.readLine());
        while (quest-- > 0) {
            String nameString = bf.readLine();
            arrResult.clear();
            for (TenNguoi x : arr) {
                boolean check = true;
                int cnt = 0;
                for (int i = 0; i < nameString.length(); ++i) {


                    if (nameString.charAt(i) == '.') continue;
                    else {
                        if (nameString.charAt(i) == '*') {
                            ++cnt;
                        } else {
//                            System.out.println(cnt);
                            if (!x.CheckFirstName(cnt, nameString.charAt(i))) {
                                check = false;
//                                System.out.println(nameString.charAt(i) + ": " + x + ": " + cnt);
                                break;
                            } else ++cnt;
                        }
                    }
                }
                if (check && cnt == x.size) arrResult.add(x);
            }
            for (TenNguoi x : arrResult) System.out.println(x);
        }
    }
}

class TenNguoi implements Comparable<TenNguoi> {
    public String hoTen;
    public String ho;
    public String ten;
    public int size;

    public TenNguoi(String hoTen) {
        this.hoTen = hoTen;
        IdentifyFullName();
    }

    private void IdentifyFullName() {
        String[] tmp = hoTen.split("\\s+");
        this.ho = tmp[0];
        this.ten = tmp[tmp.length - 1];
        this.size = tmp.length;
    }

    public Boolean CheckFirstName(int i, char c) {
        String[] tmp = hoTen.split("\\s+");
        if (i >= tmp.length) return false;
        if (tmp[i].charAt(0) == c) return true;
        return false;
    }

    @Override
    public int compareTo(TenNguoi o) {
        if (o.ten.compareTo(ten) == 0) {
            if (o.ho.compareTo(ho) > 0) return -1;
            return 1;
        } else {
            if (o.ten.compareTo(ten) > 0) return -1;
            return 1;
        }
    }

    @Override
    public String toString() {
        return this.hoTen;
    }
}
