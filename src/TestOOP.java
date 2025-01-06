import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TestOOP {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream oi2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) oi1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) oi2.readObject();
    }
}
