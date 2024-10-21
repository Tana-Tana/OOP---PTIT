import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class J07051 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bf = new BufferedReader(new FileReader("KHACHHANG.in"));
        int test = Integer.parseInt(bf.readLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for (int i = 1; i <= test; ++i) {
            KhachHang khachHang = new KhachHang(i, bf.readLine(), bf.readLine(), bf.readLine(), bf.readLine(), Long.parseLong(bf.readLine()));
            khachHang.ChuanHoaNgay(khachHang.getCheckIn());
            khachHang.ChuanHoaNgay(khachHang.getCheckOut());
            khachHang.ChuanHoaTen();
            khachHang.TinhNgay();
            khachHang.TinhTien();
            arr.add(khachHang);
        }
        Collections.sort(arr);
        for (KhachHang x : arr) System.out.println(x);
    }
}

class KhachHang implements Comparable<KhachHang> {
    private String ten;
    private String id;
    private int idRoom;
    private String idRoomString;
    private String checkIn;

    public String getCheckOut() {
        return checkOut;
    }

    public String getCheckIn() {
        return checkIn;
    }

    private String checkOut;
    private long phiPhatSinh;
    private long gia;
    private long ngay;
    private long thanhTien;

    public KhachHang(int id, String ten, String idRoom, String checkIn, String checkOut, long gia) {
        this.ten = ten;
        this.idRoomString = idRoom;
        this.idRoom = Integer.parseInt(String.valueOf(idRoom.charAt(0)));
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.gia = gia;
        if (this.idRoom == 1) this.phiPhatSinh = 25;
        else if (this.idRoom == 2) this.phiPhatSinh = 34;
        else if (this.idRoom == 3) this.phiPhatSinh = 50;
        else if (this.idRoom == 4) this.phiPhatSinh = 80;
        this.id = "KH";
        String tmp = String.valueOf(id);
        if (tmp.length() != 2) tmp = "0" + tmp;
        this.id += tmp;
    }

    public void ChuanHoaTen() {
        String tmp = "";
        String[] nameString = this.ten.trim().toLowerCase().split("\\s+");
        for (String string : nameString) {
            tmp += String.valueOf(Character.toUpperCase(string.charAt(0))) + string.substring(1) + " ";
        }
        this.ten = tmp;
    }

    public void ChuanHoaNgay(String nameString) {
        if (nameString.charAt(1) == '/') nameString = "0" + nameString;
        if (nameString.charAt(4) == '/') {
            StringBuilder sb = new StringBuilder(nameString);
            sb.insert(3, "0");
            nameString = sb.toString();
        }
    }

    public void TinhTien() {
        this.thanhTien = this.ngay * this.phiPhatSinh + this.gia;
    }

    public void TinhNgay() throws ParseException {
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        Date dateCheckIn = dfm.parse(checkIn);
        Date dateCheckOut = dfm.parse(checkOut);
        this.ngay = (dateCheckOut.getTime() - dateCheckIn.getTime()) / (1000 * 60 * 60 * 24);
        this.ngay += 1;
    }

    @Override
    public int compareTo(KhachHang o) {
        if (o.thanhTien > thanhTien) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + ten + idRoomString + " " + ngay + " " + thanhTien;
    }
}
