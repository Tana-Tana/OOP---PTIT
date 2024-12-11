/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05071;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author phant
 */
public class J05071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Tinh> arr = new ArrayList<>();
        while (test-- > 0) {
            Tinh x = new Tinh(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            arr.add(x);
        }

        test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String infor = sc.next();
            String thoiGianBatDau = sc.next();
            String thoiGianKetThuc = sc.next();

            // tinh thoi gian goi
            DateFormat df = new SimpleDateFormat("HH:mm");
            Date date1 = df.parse(thoiGianBatDau);
            Date date2 = df.parse(thoiGianKetThuc);
            long tongSoPhut = (date2.getTime() - date1.getTime()) / (1000 * 60);

            // xac dinh noi mang hay ngoai mang
            String tenVung = "Noi mang";
            long giaCuoc = 800;
            if (infor.charAt(0) == '0') {
                for (Tinh x : arr) {
                    if (x.maVung.equals(infor.substring(1, 3))) {
                        tenVung = x.tenTinhString;
                        giaCuoc = x.giaCuoc;
                        break;
                    }
                }
            }

            // tinh tien
            long giaCuocPhaiTra = 0;
            if (tenVung.equals("Noi mang")) {
                tongSoPhut = (long) Math.ceil(1.0 * tongSoPhut / 3);
            }
            giaCuocPhaiTra = giaCuoc * tongSoPhut;

            System.out.println(infor + " " + tenVung + " " + tongSoPhut + " " + giaCuocPhaiTra);
        }
    }

}

class Tinh {

    public String maVung;
    public String tenTinhString;
    public long giaCuoc;

    public Tinh(String maVung, String tenTinhString, long giaCuoc) {
        this.maVung = maVung;
        this.tenTinhString = tenTinhString;
        this.giaCuoc = giaCuoc;
    }

}
