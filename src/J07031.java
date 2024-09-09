import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07031 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> arr1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) sc2.readObject();
        TreeSet<Integer> set1 = new TreeSet<>();

        TreeSet<Integer> set2 = new TreeSet<>();

        for (int x : arr1) {
            if (IsPrime(x)) set1.add(x);
        }
        for (int x : arr2) {
            if (IsPrime(x)) set2.add(x);
        }

        int[] res = new int[1000005];
        int cnt = 0;
        for (int x : set2) {
            if (set1.contains(x)) set1.remove(x);
        }
        for (int x : set1) res[cnt++] = x;

        for (int i = 0; i < cnt - 1; ++i) {
            for (int j = i + 1; j < cnt; ++j) {
                if (res[i] + res[j] == 1000000) System.out.println(res[i] + " " + res[j]);
            }
        }
    }

    private static boolean IsPrime(int y) {
        if (y < 2) return false;
        for (int i = 2; i <= Math.sqrt(y); ++i) {
            if (y % i == 0) return false;
        }
        return true;
    }
}
