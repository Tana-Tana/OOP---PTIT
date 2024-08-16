import java.util.ArrayList;
import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        GenerateNumber();
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            int n = scanner.nextInt();
            System.out.println(arrayList.get(n));
        }
    }
    public static ArrayList<Long> arrayList;
    public static void GenerateNumber(){
        arrayList = new ArrayList<>();
        arrayList.add((long)0);
        arrayList.add((long)1);
        arrayList.add((long)1);
        for(int i=3;i<=92;++i){
            arrayList.add(arrayList.get(i-1) + arrayList.get(i-2));
        }
    }
}
