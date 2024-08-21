import java.util.ArrayList;
import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-- != 0){
            String nameString = scanner.nextLine();
            nameString = nameString.toLowerCase();
            int cnt = 0;
            while(nameString.charAt(cnt) == ' ') ++cnt;
            nameString = nameString.substring(cnt,nameString.length());
            String[] tmp = nameString.split("\\s+");
            ArrayList<StringBuilder> arrayList = new ArrayList<>();
            for(String x : tmp){
                StringBuilder tmpS = new StringBuilder();
                for(int i=0;i<x.length();++i){
                    if(i==0) tmpS.append(Character.toUpperCase(x.charAt(i)));
                    else tmpS.append(x.charAt(i));
                }
                //System.out.println(tmpS);
                arrayList.add(tmpS);
            }
            //for(int i=1;i<arrayList.size();++i) System.out.println(arrayList.get(i));
            for(int i = 1;i<arrayList.size();++i) {
                System.out.print(arrayList.get(i));
                if(i == arrayList.size() - 1) System.out.print(", ");
                else System.out.print(" ");
            }


            for(int i=0;i<arrayList.get(0).length();++i){
                arrayList.get(0).setCharAt(i,Character.toUpperCase(arrayList.get(0).charAt(i)));
            }
            System.out.println(arrayList.get(0));
        }
    }
}
