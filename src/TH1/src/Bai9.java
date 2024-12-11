import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        ArrayList<ThoiGian> arr = new ArrayList<>();
        while(test-- > 0){
            ThoiGian x = new ThoiGian(sc.nextInt(),sc.nextInt(),sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr);
        for(ThoiGian x : arr) System.out.println(x);
    }
}

class ThoiGian implements Comparable<ThoiGian> {
    public int gio;
    public int phut;
    public int giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(ThoiGian o) {
        if(o.gio == gio) {
            if(o.phut == phut) {
                if(o.giay < giay) return 1;
                return -1;
            }
            else {
                if(o.phut < phut) return 1;
                return -1;
            }
        }
        else{
            if(o.gio < gio) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return gio +
                " " + phut +
                " "+ giay
                ;
    }
}
