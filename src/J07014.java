//import java.io.*;
//import java.util.TreeSet;
//
//public class J07014 {
//    public static void main(String[] args) throws IOException {
//        WordSet s1 = new WordSet("DATA1.in");
//        WordSet s2 = new WordSet("DATA2.in");
//        System.out.println(s1.union(s2));
//        System.out.println(s1.intersection(s2));
//    }
//}
//
//class WordSet {
//    public TreeSet<String> ts = new TreeSet<>();
//
//    public WordSet(String nameFile) throws IOException {
//        BufferedReader bf = new BufferedReader(new FileReader(nameFile));
//        while (bf.ready()) {
//            String[] tmp = bf.readLine().toLowerCase().trim().split("\\s+");
//            for (String nameString : tmp) {
//                ts.add(nameString);
//            }
//        }
//    }
//
//    public String union(WordSet wordSet) {
//        TreeSet<String> ts1 = new TreeSet<>();
//        ts1.addAll(ts);
//        ts1.addAll(wordSet.ts);
//        String res = "";
//        for (String nameString : ts1) res += nameString + " ";
//        return res;
//    }
//
//    public String intersection(WordSet wordSet) {
//        TreeSet<String> ts1 = new TreeSet<>();
//        ts1.addAll(ts);
//        ts1.addAll(wordSet.ts);
//        String res = "";
//        TreeSet<String> ts2 = new TreeSet<>();
//        for (String nameString : ts1) {
//            if (ts.contains(nameString) && wordSet.ts.contains(nameString)) {
//                res += nameString + " ";
//            }
//        }
//        return res;
//    }
//}
//
