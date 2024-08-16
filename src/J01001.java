import java.util.Scanner;

public class J01001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if(number2 <= 0  || number1 <= 0 ) System.out.println(0);
        else{
            System.out.printf("%d %d",2*(number2 + number1), number1 * number2);
        }
    }
}
