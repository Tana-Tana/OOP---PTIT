import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        while(test-- >0){
            NhanVien nhanVien = new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            nhanVien.XacDinhThoiGian();
            nhanVien.XacDinhTinhTrang();
            arr.add(nhanVien);
        }
        Collections.sort(arr);
        for(NhanVien x : arr) System.out.println(x);
    }
}

