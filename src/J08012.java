import java.util.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        --test;
        int n = test;
        TreeMap<Integer, Set<Integer>> tm = new TreeMap<>();
        while (test-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (tm.containsKey(a)) {
                Set<Integer> s = tm.get(a);
                s.add(b);
                tm.put(a, s);
            } else {
                HashSet<Integer> s = new HashSet<>();
                s.add(b);
                tm.put(a, s);
            }
        }

        int cnt = 0;
        for (Map.Entry<Integer, Set<Integer>> entry : tm.entrySet()) {
            System.out.println(entry.getValue().size());
            if (entry.getValue().size() == n) ++cnt;
        }
        if (cnt == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
