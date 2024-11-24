import java.util.ArrayList;
import java.util.Scanner;

public class J05022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien5022> arr = new ArrayList<>();
        while (test-- > 0) {
            SinhVien5022 x = new SinhVien5022(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            arr.add(x);
        }

        int quest = Integer.parseInt(scanner.nextLine());
        while (quest-- > 0) {
            String lop = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            // tim` lop
            for (SinhVien5022 x : arr) {
                if (x.lop.equals(lop)) {
                    System.out.println(x);
                }
            }
        }
    }
}

class SinhVien5022 {
    public String msv;
    public String ten;
    public String lop;
    public String email;

    public SinhVien5022(String msv, String ten, String lop, String email) {
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