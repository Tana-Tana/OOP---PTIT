import java.util.Scanner;

public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) System.out.println(-1);
        }
    }
}

class Pair<K, V> {
    public K key;
    public V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public boolean isPrime() {
        if (CheckPrime((Integer) key) && CheckPrime((Integer) value)) return true;
        return false;
    }

    private boolean CheckPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); ++i) {
            if (number % i == 0) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}