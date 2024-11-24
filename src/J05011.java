import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J05011 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<GameThu> arr = new ArrayList<>();
        while (test-- > 0) {
            GameThu x = new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.TinhThoiGian();
            arr.add(x);
        }
        Collections.sort(arr);
        for (GameThu x : arr) System.out.println(x.toString());
    }
}

class GameThu implements Comparable<GameThu> {
    public String ma;
    public String ten;
    public String gioVao;
    public String gioRa;
    public int gio;
    public int phut;

    public GameThu(String ma, String ten, String gioVao, String gioRa) {
        this.ma = ma;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }

    public void TinhThoiGian() throws ParseException {
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date d1 = df.parse(gioVao);
        Date d2 = df.parse(gioRa);

        double thoiGian = (d2.getTime() - d1.getTime());
        phut = (int) (thoiGian / (1000 * 60));
        gio = phut / 60;
        phut = phut - gio * 60;
    }

    @Override
    public int compareTo(GameThu o) {
        if (o.gio == gio) {
            if (o.phut > phut) return 1;
            return -1;
        } else {
            if (o.gio > gio) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gio + " gio " + phut + " phut";
    }
}
