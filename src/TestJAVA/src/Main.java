import java.util.ArrayList;
import java.util.Collections;

class People implements Comparable<People> {
    public String ten;
    public int tuoi;

    public People(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    @Override
    public int compareTo(People o) {
        if (o.tuoi == tuoi) {
            if (o.ten.compareTo(ten) > 0) {
                return 1;
            }
            return -1;
        }
        else{
            if (o.tuoi > tuoi) return -1;
            return 1;
        }
    }

    @Override
    public String toString() {
        return "{" + ten + ": " + tuoi + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<People> arr = new ArrayList<>();
        arr.add(new People("A", 12));
        arr.add((new People("B", 12)));
        arr.add(new People("A", 12));

        Collections.sort(arr);
        for(People x : arr) System.out.println(x);
    }
}