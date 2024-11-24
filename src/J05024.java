import java.util.ArrayList;
import java.util.Scanner;

public class J05024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien5024> arr = new ArrayList<>();
        while (test-- > 0) {
            SinhVien5024 x = new SinhVien5024(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            arr.add(x);
        }

        int quest = Integer.parseInt(scanner.nextLine());
        while (quest-- > 0) {
            String nganh = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");

            //
            CheckNganh(nganh, "Ke toan", "DCKT", arr);
            CheckNganh(nganh, "Cong nghe thong tin", "DCCN", arr);
            CheckNganh(nganh, "An toan thong tin", "DCAT", arr);
            CheckNganh(nganh, "Vien thong", "DCVT", arr);
            CheckNganh(nganh, "Dien tu", "DCDT", arr);
        }
    }

    public static void CheckNganh(String nganh, String nganhHoi, String kiHieu, ArrayList<SinhVien5024> arr) {
        if (nganh.equals(nganhHoi)) {
            for (SinhVien5024 x : arr) {
                String nganhRes = x.msv.substring(3, 7);
                if (nganhRes.equals(kiHieu)) {
                    if (kiHieu.equals("DCCN") || kiHieu.equals("DCAT")) {
                        if (!x.lop.substring(0, 1).equals("E")) System.out.println(x);
                    } else System.out.println(x);
                }
            }
        }
    }
}

class SinhVien5024 {
    public String msv;
    public String ten;
    public String lop;
    public String email;

    public SinhVien5024(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }


    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }
}
