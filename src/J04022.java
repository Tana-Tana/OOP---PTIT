import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet {
    public String infor;

    public WordSet(String infor) {
        this.infor = infor.toLowerCase();
    }

    public String union(WordSet wordSet) {
        TreeSet<String> ts = new TreeSet<>();
        String[] tmp = infor.split("\\s+");
        for (String string : tmp) {
            ts.add(string);
        }

        String[] tmpWS = wordSet.infor.split("\\s+");
        for (String string : tmpWS) {
            ts.add(string);
        }
        String res = "";
        for (String string : ts) {
            res += string + " ";
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }

    public String intersection(WordSet wordSet) {
        TreeSet<String> ts = new TreeSet<>();
        String[] tmp = infor.split("\\s+");
        for (String string : tmp) {
            ts.add(string);
        }

        TreeSet<String> tsWS = new TreeSet<>();
        String[] tmpWS = wordSet.infor.split("\\s+");
        for (String string : tmpWS) {
            tsWS.add(string);
        }

        String res = "";
        for (String string : ts) {
            if (tsWS.contains(string)) {
                res += string + " ";
            }
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }
}