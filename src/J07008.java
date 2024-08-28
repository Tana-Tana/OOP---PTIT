import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class J07008 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("DAYSO.in"));
        BufferedReader bf = new BufferedReader(fileReader);
        while (bf.ready()) {
            String tmp = bf.readLine();
            String[] name = tmp.split("\\s+");
            for (String x : name) arrayList.add(Integer.parseInt(x));
        }
        Try(arrayList.get(0), 1);
        Collections.sort(nameStringArray);
        for (String s : nameStringArray) System.out.println(s);
    }

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static int[] a = new int[100];
    private static int[] b = new int[100];
    private static ArrayList<String> nameStringArray = new ArrayList<>();

    private static void Try(int n, int i) {
        for (int j = 0; j <= 1; ++j) {
            a[i] = j;
            if (i == n) Solve(n);
            else Try(n, i + 1);
        }
    }

    private static void Solve(int n) {
        for (int i = 0; i < 100; ++i) b[i] = 0;
        int cnt = 0;
        int cntA = 0;
        for (int i = 1; i <= n; ++i) {
            if (a[i] == 1) {
                ++cntA;
                b[cnt++] = arrayList.get(i);
            }
        }
        if (cntA > 1) {
            for (int i = 0; i < cnt - 1; ++i) {
                if (b[i] > b[i + 1]) return;
            }
            String tmp = "";
            for (int i = 0; i < cnt; ++i) {
                tmp += String.valueOf(b[i]);
                tmp += " ";
            }
            nameStringArray.add(tmp);
        } else return;

    }

}
