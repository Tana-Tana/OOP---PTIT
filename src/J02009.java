import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Number> arr = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            Number x = new Number(sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr);
//        for (Number x : arr) System.out.println(x);
        for (int i = 1; i < arr.size(); ++i) {
            arr.get(i).TinhToan(arr.get(i - 1));
        }
        System.out.println(String.valueOf(arr.get(arr.size() - 1).t1 + arr.get(arr.size() - 1).t2));
    }
}

class Number implements Comparable<Number> {
    public int t1;
    public int t2;

    public Number(int t1, int t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void TinhToan(Number number) {
        if (number.t1 + number.t2 > t1) t1 = number.t1 + number.t2;
        return;
    }

    @Override
    public int compareTo(Number o) {
        if (o.t1 < t1) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return t1 + " " + t2;
    }
}