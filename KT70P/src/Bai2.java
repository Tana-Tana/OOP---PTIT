import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        TienDien td=new TienDien();
        td.input(in);
        System.out.println(td.toString());
    }
}

class TienDien {
    private String hoTen;
    private String loaiHo;
    private long csDau;
    private long csCuoi;
    private long tientdm;
    private long tienvdm;
    private long tien;
    private long thue;
    private long tong;
    private long sodien;
    private long dinhmuc;
    public void input(Scanner scanner) {
        this.hoTen = scanner.nextLine();
        this.loaiHo = scanner.nextLine();
        this.csDau = Long.parseLong(scanner.nextLine());
        this.csCuoi = Long.parseLong(scanner.nextLine());
        this.sodien = this.csCuoi - this.csDau;

        if(loaiHo.equals("A")) this.dinhmuc = 100;
        else if(loaiHo.equals("B")) this.dinhmuc = 500;
        else if(loaiHo.equals("C")) this.dinhmuc = 200;

        if(this.sodien < this.dinhmuc) this.tientdm = this.sodien*450;
        else if(this.sodien > this.dinhmuc) this.tientdm = this.dinhmuc * 450;


        if(this.sodien > this.dinhmuc) {
            this.tienvdm = (this.sodien - this.dinhmuc)*1000;
        }

        else this.tienvdm = 0;
        this.tien = this.tientdm + this.tienvdm;

        this.thue = this.tien/100 * 5;
        this.tong = this.thue + this.tien;
    }

    public void ChuanHoa() {
        String hoten = this.hoTen;
        hoten = hoten.trim().toLowerCase();
        String[] nameString = hoten.split("\\s+");
        String tmp = "";
        for (String string : nameString) {
            tmp = tmp + String.valueOf(Character.toUpperCase(string.charAt(0))) + string.substring(1) + " ";
        }
        this.hoTen = tmp;
    }

    @Override
    public String toString() {
        ChuanHoa();
        return this.hoTen + this.tien + " " + this.thue + " " + this.tong;
    }
}

