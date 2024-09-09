import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07032 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> arr1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) sc2.readObject();

        HashSet<Integer> hs1 = new HashSet<>(arr1);
        HashSet<Integer> hs2 = new HashSet<>(arr2);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i : hs1) {
            if (CheckSTN(i) && hs2.contains(i) && treeMap.size() < 10)
                treeMap.put(i, Collections.frequency(arr1, i) + Collections.frequency(arr2, i));
        }

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    private static boolean CheckSTN(int key) {

        String tmp = Integer.toString(key);
        if (tmp.length() % 2 == 0) return false;
        if (tmp.length() == 1) return false;
        int l = 0;
        int r = tmp.length() - 1;
        while (l < r) {
            if (tmp.charAt(l) != tmp.charAt(r)) return false;
            ++l;
            --r;
        }
        int number = key;
        while (number > 0) {
            int k = number % 10;
            if (k % 2 == 0) return false;
            number /= 10;
        }
        return true;
    }
}
