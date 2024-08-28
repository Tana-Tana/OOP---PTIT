import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("SV.in");
        BufferedReader bf = new BufferedReader(fileReader);
        int test = Integer.parseInt(bf.readLine());
        ArrayList<Employee> arrayList = new ArrayList<>();
        for(int i = 1; i <= test;++i) {
            Employee employee = new Employee(bf.readLine(),bf.readLine(),bf.readLine(),Float.parseFloat(bf.readLine()));
            String tmp = employee.getDate();
            if(tmp.charAt(2) != '/') tmp = "0" + tmp;
            if(tmp.charAt(5) != '/') {
                StringBuilder s = new StringBuilder(tmp);
                s.insert(3,"0");
                tmp = s.toString();
            }
            employee.setDate(tmp);

            tmp = String.valueOf(i);
            while(tmp.length() < 3) tmp = "0" + tmp;
            employee.setMSV(employee.getMSV() + tmp);
            arrayList.add(employee);
        }
        bf.close();

        for(Employee employee : arrayList){
            System.out.printf("%s %s %s %s %.2f",employee.getMSV(),employee.getName(),employee.getGroup(),employee.getDate(),employee.getGpa());
            System.out.println();
        }
    }
}