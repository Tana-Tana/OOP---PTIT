import java.io.*;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws IOException {
        File file = new File("Data/DATA.in");
        FileReader fileReader = new FileReader(file);
        BufferedReader bf = new BufferedReader(fileReader);
        while (bf.ready()) {
            System.out.println(bf.readLine());
        }
        fileReader.close();
    }
}
