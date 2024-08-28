import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        employee.setNgayS(CH(employee.getNgayS()));
        employee.setNgayKD(CH(employee.getNgayKD()));
        System.out.println(employee.getMnv() + " " + employee.getName() + " " + employee.getGt() +
                " " + employee.getNgayS() + " " + employee.getDc() + " " + employee.getMst() + " " + employee.getNgayKD());
    }

    private static String CH(String tmp){
        if(tmp.charAt(2) != '/') tmp = "0" + tmp;
        if(tmp.charAt(5) != '/'){
            StringBuilder sb = new StringBuilder(tmp);
            sb.insert(3,"0");
            tmp = sb.toString();
        }
        return tmp;
    }
}