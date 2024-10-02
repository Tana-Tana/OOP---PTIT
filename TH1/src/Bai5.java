import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("DATA.in"));
        while(bf.ready()){
            String tmp = bf.readLine();
            if(tmp.equals("END")) break;
            String[] nameString = tmp.trim().toLowerCase().split("\\s+");
            String res = "";
            for(String string : nameString){
                res += String.valueOf(Character.toUpperCase(string.charAt(0))) + string.substring(1) + " ";
            }
            System.out.println(res);
        }
    }
}
