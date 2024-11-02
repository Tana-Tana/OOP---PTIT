import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class J07059 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bf = new BufferedReader(new FileReader("CATHI.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<Cathi> arr = new ArrayList<>();
        while (test-- > 0) {
            Cathi x = new Cathi(bf.readLine(), bf.readLine(), bf.readLine());
            x.TinhThoiGian();
            arr.add(x);
        }
        Collections.sort(arr);
        for (Cathi x : arr) System.out.println(x);
    }
}

class Cathi implements Comparable<Cathi> {
    public static int cnt = 1;
    public String id;
    public String ngay;
    public String gio;
    public String phong;
    public long thoiGian;
    public DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public DateFormat timeFormat = new SimpleDateFormat("HH:mm");

    public Cathi(String ngay, String gio, String phong) {
        this.id = String.format("C%03d", cnt++);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }

    public void TinhThoiGian() throws ParseException {
        Date newDate = dateFormat.parse(ngay);
        Date time = timeFormat.parse(gio);
        thoiGian = newDate.getTime() + time.getTime();
    }

    @Override
    public int compareTo(Cathi o) {
        if (o.thoiGian == thoiGian) {
            if (o.id.compareTo(id) > 0) return -1;
            return 1;
        } else {
            if (o.thoiGian < thoiGian) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return id + " " + ngay + " " + gio + " " + phong;
    }
}