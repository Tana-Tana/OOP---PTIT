import java.util.Scanner;
import java.util.TreeMap;

public class J03021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        TreeMap<Character,String> treeMap = new TreeMap<>();
        treeMap.put('A',"2");
        treeMap.put('B',"2");
        treeMap.put('C',"2");

        treeMap.put('D',"3");
        treeMap.put('E',"3");
        treeMap.put('F',"3");

        treeMap.put('G',"4");
        treeMap.put('H',"4");
        treeMap.put('I',"4");

        treeMap.put('J',"5");
        treeMap.put('K',"5");
        treeMap.put('L',"5");

        treeMap.put('M',"6");
        treeMap.put('N',"6");
        treeMap.put('O',"6");

        treeMap.put('P',"7");
        treeMap.put('Q',"7");
        treeMap.put('R',"7");
        treeMap.put('S',"7");

        treeMap.put('T',"8");
        treeMap.put('U',"8");
        treeMap.put('V',"8");

        treeMap.put('W',"9");
        treeMap.put('X',"9");
        treeMap.put('Y',"9");
        treeMap.put('Z',"9");
        while(test-- != 0){
            String tmp = scanner.nextLine();
            tmp = tmp.toUpperCase();
            StringBuilder res = new StringBuilder(new String());
            for(int i=0;i<tmp.length();++i){
                char c = tmp.charAt(i);
                res.append(treeMap.get(c));
            }
            if(CheckString(res)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean CheckString(StringBuilder res) {
        int l = 0;
        int r = res.length()-1;
        while(l<=r){
            if(res.charAt(l)!=res.charAt(r)) return false;
            ++l;--r;
        }
        return true;
    }
}
