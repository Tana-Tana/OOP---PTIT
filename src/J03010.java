import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class J03010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        ArrayList<String> arrayList = new ArrayList<>();
        while(test-- != 0){
            String tmp = scanner.nextLine();
            tmp = tmp.toLowerCase();
            arrayList.add(tmp);
        }
        ArrayList<String> arr = new ArrayList<>();
        TreeMap<String,Integer> tm = new TreeMap<>();
        for(String tmp : arrayList){
            String tmp1 = "";
            int cnt = 0;
            while(tmp.charAt(cnt) == ' ') ++cnt;
            tmp = tmp.substring(cnt,tmp.length());

            String[] tmpR = tmp.split("\\s+");
            tmp1 += tmpR[tmpR.length - 1];
            for(int i=0;i<tmpR.length-1;++i){
                tmp1 += tmpR[i].charAt(0);
            }
            if(tm.containsKey(tmp1)){
                int k = tm.get(tmp1);
                tm.put(tmp1,++k);
                tmp1+= (tm.get(tmp1).toString());
                arr.add(tmp1);
            }
            else{
                arr.add(tmp1);
                tm.put(tmp1,1);
            }
        }

        for(String x : arr) System.out.println(x + "@ptit.edu.vn");
    }
}
