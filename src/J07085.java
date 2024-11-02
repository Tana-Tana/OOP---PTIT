import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) oi.readObject();
        /*ArrayList<String> arr = new ArrayList<>();
        arr.add("Jhsf00dklT12uhf780LPPZH");
        arr.add("AAAAddd0000000000000000001T");*/
        for (String nameString : arr) {
            String tmp = "";
            boolean checkHaveNumber = false;
            for (int i = 0; i < nameString.length(); ++i) {
                if (Character.isDigit(nameString.charAt(i))) {
                    checkHaveNumber = true;
                    if (nameString.charAt(i) == '0') {
                        checkHaveNumber = true;
                        if (tmp.length() == 0) {
                            continue;
                        } else {
                            tmp += nameString.charAt(i);
                        }
                    } else tmp += nameString.charAt(i);
                }
            }
            // tinh tong
            long sum = 0;
            for (int i = 0; i < tmp.length(); ++i) {
                sum += (long) (tmp.charAt(i) - '0');
            }

            if (checkHaveNumber) {
                System.out.println(tmp + " " + sum);
            }
        }
    }

}