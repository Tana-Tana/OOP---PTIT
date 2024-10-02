import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class J07046 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bf = new BufferedReader(new FileReader("Data/KHACH.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<Khach> arr = new ArrayList<>();
        for (int i = 1; i <= test; ++i) {
            Khach khach = new Khach(bf.readLine(), bf.readLine(), bf.readLine(), bf.readLine());
            khach.setID(i);
            khach.SetNgayLuuTru();
            arr.add(khach);
        }
        Collections.sort(arr);

        for (Khach khach : arr) {
            System.out.println(khach.toString());
        }
    }
}

class Khach implements Comparable<Khach> {

    private String id;
    private String hoTen;
    private String ma;
    private String dateArrived;
    private String dateGo;

    public long getNgayLuuTru() {
        return ngayLuuTru;
    }

    private long ngayLuuTru;

    public Khach(String hoTen, String ma, String dateArrived, String dateGo) {
        this.id = "KH";
        this.hoTen = hoTen;
        this.ma = ma;
        this.dateArrived = dateArrived;
        this.dateGo = dateGo;
    }

    public void setID(int stt) {
        String tmp = String.valueOf(stt);
        while (tmp.length() == 1) tmp = "0" + tmp;
        this.id += tmp;
    }

    public void SetNgayLuuTru() throws ParseException {
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        Date ngayden = dfm.parse(this.dateArrived);
        Date ngaydi = dfm.parse(this.dateGo);
        this.ngayLuuTru = (ngaydi.getTime() - ngayden.getTime()) / (1000 * 60 * 60 * 24);
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + ma + " " + ngayLuuTru;
    }

    @Override
    public int compareTo(Khach o) {
        if (o.getNgayLuuTru() > this.ngayLuuTru) return 1;
        return -1;
    }
}
