import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

class LoaiPhong implements Comparable<LoaiPhong> {
    public String id;
    public String loai;
    public String gia;
    public String phi;

    public LoaiPhong(String tmp) {
        String[] nameString = tmp.split("\\s+");
        int cnt = 0;
        for(String x : nameString) {
            if(cnt == 0) {
                ++cnt;
                id = x;
            }
            else {
                if(cnt == 1) {
                    loai = x;
                    ++cnt;
                }
                else {
                    if(cnt == 2) {
                        gia = x;
                        ++cnt;
                    }
                    else {
                        if(cnt == 3) {
                            phi = x;

                        }
                    }
                }
            }
        }
    }

    @Override
    public int compareTo(LoaiPhong o) {
        if(o.loai.compareTo(loai) > 0 ) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return id + " " + loai + " " + gia + " " + phi;
    }
}
