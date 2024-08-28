import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class J07022 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            fileReader = new FileReader(new File("DATA.in"));
            BufferedReader bf = new BufferedReader(fileReader);
            while (bf.ready()) {
                String tmp = bf.readLine();
                String[] nameString = tmp.split("\\s+");
                for (String x : nameString) {
                    try {
                        int number = Integer.parseInt(x);
                    } catch (NumberFormatException e) {
                        arrayList.add(x);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(arrayList);
        for (String x : arrayList) System.out.print(x + " ");
    }
}
