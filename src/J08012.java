import java.util.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, HashSet<Integer>> tm = new TreeMap<>();
        for (int i = 1; i < n; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            //
            if (tm.containsKey(a)) {
                HashSet<Integer> s = tm.get(a);
                s.add(b);
                tm.put(a, s);
            } else {
                HashSet<Integer> s = new HashSet<>();
                s.add(b);
                tm.put(a, s);
            }
            //
            if (tm.containsKey(b)) {
                HashSet<Integer> s = tm.get(b);
                s.add(a);
                tm.put(b, s);
            } else {
                HashSet<Integer> s = new HashSet<>();
                s.add(a);
                tm.put(b, s);
            }
        }
        //
        int res = 1;
        int cnt = 0;

        for (Map.Entry<Integer, HashSet<Integer>> entry : tm.entrySet()) {
            if (entry.getValue().size() == n - 1) {
                ++cnt;
                res = entry.getKey();
                break;
            }
        }
        boolean checkNO = false;
        for (Map.Entry<Integer, HashSet<Integer>> entry : tm.entrySet()) {
            if (res == entry.getKey()) continue;
            else {
                for (Integer x : entry.getValue()) {
                    if (x != res) {
                        checkNO = true;
                        break;
                    }
                }
            }
        }

        if (!checkNO && cnt == 1) System.out.println("Yes");
        else System.out.println("No");

    }
}
