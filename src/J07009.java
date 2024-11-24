import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}

class IntSet {
    int[] arr;

    public IntSet(int[] a) {
        arr = a;
    }

    public IntSet intersection(IntSet s1) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < arr.length; ++i) ts.add(arr[i]);

        TreeSet<Integer> ts1 = new TreeSet<>();
        for (int i = 0; i < s1.arr.length; ++i) ts1.add(s1.arr[i]);

        TreeSet<Integer> res = new TreeSet<>();
        for (Integer x : ts) {
            if (ts1.contains(x)) res.add(x);
        }
        return new IntSet(res.stream().mapToInt(Integer::intValue).toArray());
    }

    @Override
    public String toString() {
        String s = "";
        for (int i : arr)
            s += Integer.toString(i) + " ";
        return s;
    }
}