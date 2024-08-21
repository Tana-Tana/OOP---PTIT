import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i=0;i<n;++i){
            int number = scanner.nextInt();
            treeMap.put(number,1);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int j=0;j<m;++j){
            int number = scanner.nextInt();
            if(treeMap.containsKey(number)) set.add(number);
        }

        for(int x : set){
            System.out.print(x + " ");
        }
    }
}
