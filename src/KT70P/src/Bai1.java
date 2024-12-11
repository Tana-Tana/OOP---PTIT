import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Giangvien gv=new Giangvien();
        //input
        gv.input();
        //output
        gv.out();
    }
}
class Giangvien {
    Scanner scanner = new Scanner(System.in);
    private String id;
    private String ten;
    private long luong;
    private String heso;
    private float heSoLuong;
    public Giangvien() {
    }

    public void input(){
        this.id = scanner.nextLine();
        this.ten = scanner.nextLine();
        this.luong = Long.parseLong(scanner.nextLine());
        this.heso = scanner.nextLine();
        if(this.heso.equals("A")) heSoLuong = 1.5f;
        else if(this.heso.equals("B")) heSoLuong = 1.2f;
        else heSoLuong = 1f;
    }

    public void out(){
        System.out.print(this.id + " " + this.ten + " " + this.heso + " ");
        float tmp = heSoLuong * 250000;
        int tmp1 = (int) tmp;
        this.luong *= tmp1;
        System.out.println(this.luong);
    }
}

