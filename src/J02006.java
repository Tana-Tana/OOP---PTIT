import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J02006 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i=0;i<n+m;++i) {
            int number = scanner.nextInt();
            treeMap.put(number, 1);
        }


        for(Map.Entry<Integer,Integer> entry : treeMap.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
    }
}
