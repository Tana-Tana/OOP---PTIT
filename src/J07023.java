import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class J07023 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream oi2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();

        ArrayList<Integer> arr1 = (ArrayList<Integer>) oi1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) oi2.readObject();

        // dem so lan` xuat hien cua so vua thuan nghich, vua snt
        for (Integer x : arr1) {
            if (isPrime(x) && isSTN(x)) {
                if (tm1.containsKey(x)) {
                    int k = (tm1.get(x));
                    tm1.put(x, ++k);
                } else tm1.put(x, 1);
            }
        }

        for (Integer x : arr2) {
            if (isPrime(x) && isSTN(x)) {
                if (tm2.containsKey(x)) {
                    int k = (tm2.get(x));
                    tm2.put(x, ++k);
                } else tm2.put(x, 1);
            }
        }

        // kiem tra
        for (Map.Entry<Integer, Integer> entry : tm1.entrySet()) {
            if (tm2.containsKey(entry.getKey())) {
                System.out.println(entry.getKey() + " " + entry.getValue() + " " + tm2.get(entry.getKey()));
            }
        }
    }

    public static Boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static Boolean isSTN(int x) {
        String tmp = String.valueOf(x);
        int l = 0, r = tmp.length() - 1;
        while (l <= r) {
            if (tmp.charAt(l) != tmp.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }
}
