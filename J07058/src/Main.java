import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("MONHOC.in");
        BufferedReader bf = new BufferedReader(fileReader);
        int test = Integer.parseInt(bf.readLine());
        ArrayList<Subject> a = new ArrayList<>();
        while(test --> 0){
            Subject subject = new Subject(bf.readLine(),bf.readLine(),bf.readLine());
            a.add(subject);
        }
        Collections.sort(a);
        for(Subject subject : a) {
            System.out.println(subject.toString());
        }
    }
}