import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class J03009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-- != 0){
            String tmp1 = scanner.nextLine();
            String tmp2 = scanner.nextLine();

            TreeMap<String,Integer> map = new TreeMap<>();
            String[] tmp = tmp1.split("\\s+");
            String[] tmp3 = tmp2.split("\\s+");
            for(String x : tmp3){
                map.put(x,1);
            }
            HashSet<String> set = new HashSet<>();
            for(String x: tmp) set.add(x);
            for(String x : set){
                if(!map.containsKey(x)) System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
