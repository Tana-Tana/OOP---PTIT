import java.io.*;
import java.math.BigInteger;

public class J07003 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File("DATA.in"));
            BufferedReader bf = new BufferedReader(fileReader);
            String tmp = "";
            while (bf.ready()) {
                tmp = bf.readLine();
            }

            while (tmp.length() > 1) {
                BigInteger bI1 = new BigInteger(tmp.substring(0, tmp.length() / 2));
                BigInteger bI2 = new BigInteger(tmp.substring(tmp.length() / 2));
                bI1 = bI2.add(bI1);
                tmp = bI1.toString();
                System.out.println(tmp);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
