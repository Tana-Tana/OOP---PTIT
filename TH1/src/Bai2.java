import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Bai2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("DATA.in"));
        long sum = 0;
        while(bf.ready()){
            String tmp = bf.readLine();
            String[] nameString = tmp.split("\\s+");
            for(String string : nameString){
                try{
                    int n = Integer.parseInt(string);
                    sum += n;
                }
                catch (Exception e){
                    //
                }
            }
        }
        System.out.println(sum);
    }
}
