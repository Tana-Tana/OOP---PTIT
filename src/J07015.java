import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("SONGUYEN.in");
        ObjectInputStream sc = new ObjectInputStream(fileInputStream);
        int[] fi = new int[10005];
        ArrayList<Integer> arrayList = (ArrayList<Integer>) sc.readObject();
        for (int i : arrayList) {
            if (CheckPrime(i)) fi[i]++;
        }
        for (int i = 2; i < 10000; ++i) {
            if (fi[i] > 0) System.out.println(i + " " + fi[i]);
        }
    }

    private static boolean CheckPrime(int i) {
        if (i < 2) return false;
        for (int j = 2; j <= Math.sqrt(i); ++j) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
