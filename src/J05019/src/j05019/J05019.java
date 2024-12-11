/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05019;

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
public class J05019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc =new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        String id = "T";
        int cnt = 1;
        
        ArrayList<Tram> arr = new ArrayList<>();
        while(test-- > 0) {
            Tram x = new Tram(sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            boolean check = false;
            for(Tram y : arr) {
                if(y.tenString.equals(x.tenString)) {
                    check = true;
                    y.soPhut+=x.soPhut;
                    y.luongMuaDoDuoc+=x.luongMuaDoDuoc;
                    break;
                }
            }
            if(!check) arr.add(x);
        }
        for(Tram x : arr) {
            id = String.format("T%02d ", cnt++);
            double res = 1.0*(x.luongMuaDoDuoc * 60)/x.soPhut;
            System.out.println(id + " " + x.tenString+" " + String.format("%.2f", res));
        }
               
    }
    
}

class Tram {
    public String tenString;
    public String thoiDiemBatDauString;
    public String thoiDiemKetThucString;
    public int luongMuaDoDuoc;
    public long soPhut;
    public Tram(String tenString, String thoiDiemBatDauString, String thoiDiemKetThucString, int luongMuaDoDuoc) throws ParseException {
        this.tenString = tenString;
        this.thoiDiemBatDauString = thoiDiemBatDauString;
        this.thoiDiemKetThucString = thoiDiemKetThucString;
        this.luongMuaDoDuoc = luongMuaDoDuoc;
        
        // tinh so phut
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date date1 = df.parse(thoiDiemBatDauString);
        Date date2 = df.parse(thoiDiemKetThucString);
        this.soPhut = (date2.getTime() - date1.getTime())/(1000*60);
    }
}
