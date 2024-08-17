import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- != 0){
            String tmp = scanner.next();
            StringBuilder res = new StringBuilder();
            int check = 0;
            for(int i =0;i<tmp.length();++i){
                if(tmp.charAt(i) == '1') res.append('1');
                else if(tmp.charAt(i) == '0' || tmp.charAt(i) == '8' || tmp.charAt(i) == '9') res.append('0');
                else {
                    check = 1;
                    break;
                }
            }
            if(check == 1) System.out.println("INVALID");
            else{
                while(res.length() != 0 && res.charAt(0) == '0') res.delete(0,1);
                if(res.length() == 0) System.out.println("INVALID");
                else System.out.println(res);
            }
        }
    }
}
