import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Cho> arr = new ArrayList<>();
        Cho x = new Cho();
        arr.add(x);

        ArrayList<String> a = new ArrayList<>();
        a.add("HAHA");
    }
}

class Cho {
    public String ten;

    public Cho(String ten) {
        this.ten = ten;
    }

    public Cho() {
    }
}