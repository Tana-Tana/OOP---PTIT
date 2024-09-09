import java.util.Locale;
import java.util.Scanner;

public class SinhVien {
    Scanner scanner = new Scanner(System.in);
    private String maSV;
    private Double GPA;
    private String hoVaDem;
    private String ten;
    private int tuoi;
    private String gioiTinhB;
    private String gioiTinhS;
    private double diem1;
    private double diem2;
    private String xeploai;
    public SinhVien() {
        //
    }

    public void input(){
        maSV = scanner.nextLine();
        hoVaDem = scanner.nextLine();
        ten = scanner.nextLine();
        while(true){
            tuoi = Integer.parseInt(scanner.nextLine());
            if(tuoi>=18 && tuoi <= 23) break;
            System.out.println("nhap sai");
        }
        gioiTinhB = scanner.nextLine();
        while (true){
            diem1 = Double.parseDouble(scanner.nextLine());
            if(diem1 >= 0 && diem1 <= 10) break;
            System.out.println("nhap sai");
        }
        while(true){
            diem2 = Double.parseDouble(scanner.nextLine());
            if(diem2 >=0 && diem2 <= 10) break;
            System.out.println("nhap sai");
        }
    }

    public void setDiem(double diem1, double diem2){
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public void output() {
        maSV = "D22DCCN" + maSV;
        gioiTinhB = gioiTinhB.toLowerCase();
        if (gioiTinhB.equals("true")) {
            gioiTinhS = "nam";
        } else gioiTinhS = "nu";
        GPA = (diem1 + diem2 * 2) / 3;
        if(GPA < 5) xeploai = "yeu";
        else if(GPA <6.5f) xeploai = "trung binh";
        else if(GPA < 8) xeploai = "kha";
        else if(GPA < 9) xeploai = "gioi";
        else xeploai = "xuat sac";

        System.out.print(maSV + " " + hoVaDem + " " + ten + " " + tuoi + " " + gioiTinhS + " ");
        System.out.printf("%.1f ",GPA);
        System.out.println(xeploai);

    }
    public String getHoVaTen(){
        return  hoVaDem + " " + ten;
    }
    public String getXepLoai(){
        return xeploai;
    }




}
