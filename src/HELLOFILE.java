import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HELLOFILE {
    public static void main(String[] args) {

            try {
                FileReader fileReader = new FileReader("Hello.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while(bufferedReader.ready() == true) {
                    System.out.println(bufferedReader.readLine());
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }
}
