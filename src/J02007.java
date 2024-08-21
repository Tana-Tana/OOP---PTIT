import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int j = 1;j<=test;++j){
            treeMap.clear();
            arr.clear();
            int n = scanner.nextInt();
            for(int i=0;i<n;++i){
                int number = scanner.nextInt();
                arr.add(number);
                if(treeMap.containsKey(number)){
                    int current = treeMap.get(number);
                    treeMap.put(number,++current);
                }
                else treeMap.put(number,1);
            }
            System.out.println("Test "+ j + ":");
            for(int i : arr){
                if(treeMap.containsKey(i)){

                        System.out.println(i + " xuat hien " + treeMap.get(i) + " lan");
                        treeMap.remove(i);

                }
            }
        }
    }
}
