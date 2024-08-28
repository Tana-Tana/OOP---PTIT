import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class J07029 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("DATA.in");
        ObjectInputStream sc = new ObjectInputStream(fileInputStream);
        int[] fi = new int[1000005];
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList = (ArrayList<Integer>) sc.readObject();
        for (int i : arrayList) {
            if (CheckPrime(i)) {
                if (fi[i] == 0) arrayList1.add(i);
                fi[i]++;
            }
        }
        Collections.sort(arrayList1, Collections.reverseOrder());
        for (int i = 0; i < 10; ++i) System.out.println(arrayList1.get(i) + " " + fi[arrayList1.get(i)]);

    }

    private static boolean CheckPrime(int i) {
        if (i < 2) return false;
        for (int j = 2; j <= Math.sqrt(i); ++j) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
