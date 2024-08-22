import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test!=0){
             --test;
             String tmp = scanner.nextLine();
             if(tmp.charAt(0) == '0') System.out.println("INVALID");
             else{
                 int check = 0;
                 for(int i=0;i<tmp.length();++i) if(tmp.charAt(i) < '0' || tmp.charAt(i) > '9') {
                     check = 1;
                     break;
                 }
                 if(check == 1) System.out.println("INVALID");
                 else{
                     int cntChan = 0;
                     int cntLe = 0;
                     for(int i = 0; i<tmp.length() ;++i){
                         if((int)tmp.charAt(i) % 2 == 0) ++cntChan;
                         else ++cntLe;
                     }

                     if(cntChan == cntLe || cntChan>cntLe && tmp.length()%2!=0 || cntChan < cntLe && tmp.length() %2 ==0)
                         System.out.println("NO");
                     else System.out.println("YES");
                 }
             }
        }
    }
}
