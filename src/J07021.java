import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class J07021 {
    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("DATA.in");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.ready()) {
                String tmp = bufferedReader.readLine();
                //System.out.println(tmp);
                if (tmp.equals("END")) break;
                tmp = ChuanHoa(tmp);
                System.out.println(tmp);
                //arrayList.add(tmp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("haha");
        }

        // for (String x : arrayList) System.out.println(x);

    }

    private static String ChuanHoa(String tmp) {
        tmp = tmp.toLowerCase();
        tmp = tmp.trim();
        String[] nameString = tmp.split("\\s+");
        tmp = "";
        for (String x : nameString) {
            tmp += String.valueOf(Character.toUpperCase(x.charAt(0)) + x.substring(1));
            tmp += " ";
        }
        return tmp;
    }
}
