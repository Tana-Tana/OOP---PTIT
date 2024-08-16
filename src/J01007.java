import java.util.ArrayList;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        GenerateNumber();
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0) {
            long n = scanner.nextLong();
            if(CheckFibo(n) == 0 ) System.out.println("NO");
            else System.out.println("YES");
        }
    }

    private static int CheckFibo(long n) {
        for(int i=0;arrayList.get(i) <= n;++i){
            if(arrayList.get(i) == n) return 1;
        }
        return 0;
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
