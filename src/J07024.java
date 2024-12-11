
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class J07024 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

class WordSet {
    TreeSet<String> ts = new TreeSet<>();

    public WordSet(String linkFile) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(linkFile));
        while (bf.ready()) {
            String[] tmp = bf.readLine().trim().toLowerCase().split("\\s+");
            for (String x : tmp) this.ts.add(x);
        }
    }

    public String difference(WordSet wordSet) {
        String res = "";
        for (String x : ts) {
            if (!wordSet.ts.contains(x)) res += x + " ";
        }
        return res;
    }

//    @Override
//    public String toString() {
//        String res = "";
//        for (String x : ts) {
//            res += x;
//            if (!x.equals(ts.last())) res += " ";
//        }
//        return res;
//    }
}