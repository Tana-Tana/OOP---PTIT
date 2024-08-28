import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("DATA.in");
        ObjectInputStream oi = new ObjectInputStream(fileInputStream);
        ArrayList<Integer> arrayList = (ArrayList<Integer>) oi.readObject();
        int[] fi = new int[1005];
        for (int i : arrayList) {
            fi[i]++;
        }
        for (int i = 0; i < 1000; ++i) {
            if (fi[i] > 0) {
                System.out.println(i + " " + fi[i]);
            }
        }
    }
}
