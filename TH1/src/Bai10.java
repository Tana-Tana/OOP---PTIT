import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<HangHoa> arr = new ArrayList<>();

        for(int i=1;i<=test;++i){
            HangHoa x = new HangHoa(i,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr);
        for(HangHoa x : arr) System.out.println(x);
    }
}

class HangHoa implements Comparable<HangHoa> {
    public String id;
    public String ten;
    public String donVi;
    public int giaMua;
    public int giaBan;
    public int loiNhuan;

    public HangHoa(int id, String ten, String donVi, int giaMua, int giaBan) {
        String tmp = String.valueOf(id);
        while(tmp.length() != 3) tmp = "0" + tmp;
        this.id = "MH" + tmp;
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - giaMua;
    }

    @Override
    public int compareTo(HangHoa o) {
        if(o.loiNhuan == loiNhuan){
            if(o.id.compareTo(id) > 0) return -1;
            return 1;
        }
        else {
            if(o.loiNhuan > loiNhuan) return 1;
            return -1;
        }
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
}
