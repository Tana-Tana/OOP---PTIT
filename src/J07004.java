import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class J07004 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("DATA.in"));
        BufferedReader bf = new BufferedReader(fileReader);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (bf.ready()) {
            String tmp = bf.readLine();
            String[] nameString = tmp.split("\\s+");
            for (String x : nameString) {
                //System.out.println(x);
                try {
                    int number = Integer.parseInt(x);
                    if (map.containsKey(number)) {
                        int cnt = map.get(number);
                        ++cnt;
                        map.put(number, cnt);

                    } else {
                        map.put(number, 1);
                    }
                } catch (NumberFormatException | NullPointerException e) {
                    System.out.println(e);
                }
            }
        }
        //fileReader.close();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
