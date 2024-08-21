import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-- != 0){
            String nameString = scanner.nextLine();
            nameString = nameString.toLowerCase();
            String[] tmp = nameString.split("\\s+");

            for(String x : tmp){
                StringBuilder tmpS = new StringBuilder();
               for(int i=0;i<x.length();++i){
                   if(i==0) tmpS.append(Character.toUpperCase(x.charAt(i)));
                   else tmpS.append(x.charAt(i));
               }
                System.out.print(tmpS + " ");
            }
            System.out.println();
        }
    }
}
