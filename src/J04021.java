import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

//public class J04021 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
//        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
//        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
//        IntSet s1 = new IntSet(a);
//        IntSet s2 = new IntSet(b);
////        IntSet s3 = s1.union(s2);
//        System.out.println(s3);
//    }
//}

//class IntSet {
//    public int[] arr;
//
//    public IntSet(int[] arr) {
//        this.arr = arr;
//    }
//
//    public IntSet union(IntSet intSet) {
//        int[] arrIntSet = intSet.arr;
//
//        TreeSet<Integer> ts = new TreeSet<>();
//        for (Integer x : arr) ts.add(x);
//        for (Integer x : arrIntSet) ts.add(x);
//        // map -> IntegerStream -> IntStream -> toArray la ham cua IntStream.
//        return new IntSet(ts.stream().mapToInt(Integer::intValue).toArray());
//    }
//
//    @Override
//    public String toString() {
//        String s = "";
//        for (int i : arr)
//            s += Integer.toString(i) + " ";
//        return s;
//    }
//}
