package test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> arr = (ArrayList<Pair>) oi.readObject();
        Collections.sort(arr);
        HashSet<String> ts = new HashSet<>();
        for (Pair x : arr) {
            if (x.getFirst() < x.getSecond()) {
                if (!ts.contains(x.toString())) {
                    ts.add(x.toString());
                    System.out.println(x);
                }
            }
        }
    }
}