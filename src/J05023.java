import java.util.ArrayList;
import java.util.Scanner;

public class J05023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien5023> arr = new ArrayList<>();
        while (test-- > 0) {
            SinhVien5023 x = new SinhVien5023(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            arr.add(x);
        }

        int quest = Integer.parseInt(scanner.nextLine());
        while (quest-- > 0) {
            String nam = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + nam + ":");
            // tim` khoa
            for (SinhVien5023 x : arr) {
                String khoaHienTai = x.lop.substring(1, 3);
                if (khoaHienTai.equals(nam.substring(2, nam.length()))) {
                    System.out.println(x);
                }
            }
        }
    }
}

class SinhVien5023 {
    public String msv;
    public String ten;
    public String lop;
    public String email;

    public SinhVien5023(String msv, String ten, String lop, String email) {
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