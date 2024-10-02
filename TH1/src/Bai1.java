import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("DATA.in"));
        while(bf.ready()){
            System.out.println(bf.readLine());
        }
    }
}
