import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class J07005 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("DATA.IN"); // khai báo 1 file input không biết rõ đầu vào
        DataInputStream dataInputStream = new DataInputStream(fileInputStream); // dụng cụ để đọc dữ liệu của file đó
        int[] fi = new int[1000];

        for (int i = 0; i < 100000; ++i) {
            ++fi[dataInputStream.readInt()];
        }

        for (int i = 0; i < 1000; ++i) {
            if (fi[i] > 0) {
                System.out.println(i + " " + fi[i]);
            }
        }

    }
}
