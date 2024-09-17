import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class KT15p5 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("MONHOC.in");
        BufferedReader bf = new BufferedReader(fileReader);
        int test = Integer.parseInt(bf.readLine());
        ArrayList<Subject> a = new ArrayList<>();
        while (test-- > 0) {
            Subject subject = new Subject(bf.readLine(), bf.readLine(), Integer.parseInt(bf.readLine()));
            a.add(subject);
        }
        Collections.sort(a);
        for (Subject subject : a) {
            System.out.println(subject.toString());
        }
    }
}

class Subject implements Comparable<Subject> {
    private String maMon;
    private String tenMon;
    private int sotinchi;

    public Subject(String maMon, String tenMon, int sotinchi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.sotinchi = sotinchi;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }


    @Override
    public int compareTo(Subject subject) {
        if (this.tenMon.compareTo(subject.getTenMon()) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + String.valueOf(sotinchi);
    }
}



