import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J05032 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<People> arr = new ArrayList<>();
        while (test-- > 0) {
            People people = new People(sc.next(), sc.next());
            people.TinhTuoi();
            arr.add(people);
        }
        Collections.sort(arr);
        System.out.println(arr.get(0).ten);
        System.out.println(arr.get(arr.size() - 1).ten);
        
    }
}

class People implements Comparable<People> {
    public String ten;
    public String ngaySinh;
    public long thoiGian;

    public People(String ten, String ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public void TinhTuoi() throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse(ngaySinh);
        thoiGian = date.getTime();
    }

    @Override
    public int compareTo(People o) {
        if (o.thoiGian > thoiGian) return 1;
        return -1;
    }
}
