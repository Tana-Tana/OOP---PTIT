import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.Math.sqrt;

public class Bai1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oiData1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream oiData2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> arrData1 = (ArrayList<Integer>) oiData1.readObject();
        ArrayList<Integer> arrData2 = (ArrayList<Integer>) oiData2.readObject();

        TreeMap<Integer,Integer> tsData1 = new TreeMap<>();
        for(Integer x : arrData1){
            if(tsData1.containsKey(x)){
                int cnt = tsData1.get(x);
                ++cnt;
                tsData1.put(x,cnt);
            }
            else{
                tsData1.put(x,1);
            }
        }

        TreeMap<Integer,Integer> tsData2 = new TreeMap<>();
        for(Integer x : arrData2){
            if(tsData2.containsKey(x)){
                int cnt = tsData2.get(x);
                ++cnt;
                tsData2.put(x,cnt);
            }
            else{
                tsData2.put(x,1);
            }
        }

        // kiem tra snt
        for(Map.Entry<Integer,Integer> entry : tsData1.entrySet()){
            if(CheckPrime(entry.getKey()) && tsData2.containsKey(entry.getKey())){
                System.out.println(entry.getKey() +" "+ entry.getValue()  + " " + tsData2.get(entry.getKey()));
            }
        }
    }

    public static boolean CheckPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0) return false;
        }
        return true;
    }
}
