import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("VANBAN.in"));
        BufferedReader bf = new BufferedReader(fileReader);
        TreeSet<String> hs = new TreeSet<>();
        while (bf.ready()) {
            String tmp = bf.readLine();
            tmp = tmp.toLowerCase();
            String[] nameString = tmp.split("\\s+");
            for (String x : nameString) hs.add(x);
        }
        for (String x : hs) System.out.println(x);
    }
}
