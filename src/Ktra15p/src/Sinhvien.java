import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class Sinhvien {
    Scanner scanner = new Scanner(System.in);
    private String msv;
    private String ten;
    private String gioitinh;
    private double diem;
    private String tinhtrang;
    public Sinhvien() {
    }

    public void input(){
        msv = scanner.nextLine();
        ten = scanner.nextLine();
        gioitinh = scanner.nextLine();
        diem = Double.parseDouble(scanner.nextLine());

    }

    public void out(){
        msv = msv.toUpperCase();
        gioitinh = gioitinh.toLowerCase();
        if(gioitinh.equals("true")) gioitinh = "nam";
        else gioitinh = "nu";

        if(diem >= 5f ) tinhtrang = "dat";
        else  tinhtrang = "hoc lai";

        System.out.print(msv + " " + ten + " " + gioitinh + " " + tinhtrang);
    }
}
