import java.io.PrintStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        People people = new People(scanner.nextLine(),scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        System.out.println(people.getName() + " " + people.getDateBirth() + " " + people.getResult());
    }
}