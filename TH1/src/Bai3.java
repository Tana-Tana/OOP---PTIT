import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Bai3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<Integer> arr = (ArrayList<Integer>) oi.readObject();
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int x : arr){
            if(tm.containsKey(x)){
                int k = tm.get(x);
                ++k;
                tm.put(x,k);
            }
            else {
                tm.put(x,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : tm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
