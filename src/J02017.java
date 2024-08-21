import java.util.ArrayList;
import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;++i) arr.add(scanner.nextInt());

        int check = 1;
        while(check != 0) {
            check = 0;
            for( int i = 0;i< arr.size()-1;++i){
                int a = arr.get(i);
                int b = arr.get(i+1);
                int sum = a+b;
                if(sum%2 == 0) {
                    arr.remove(i+1);
                    arr.remove(i);
                    check = 1;
                    break;
                }
            }
        }
        System.out.println(arr.size());
    }
}
