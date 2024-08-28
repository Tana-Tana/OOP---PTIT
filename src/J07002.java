import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07002 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("DATA.in");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            long res = 0;
            while (bufferedReader.ready()) {
                String tmp = bufferedReader.readLine();
                String[] tmp1 = tmp.split("\\s+");
                for (String x : tmp1) {
                    try {
                        res += Integer.parseInt(x);
                    } catch (NumberFormatException e) {
                        //
                    }
                }
            }
            System.out.println(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
