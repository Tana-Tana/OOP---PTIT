import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fraction fraction1 = new Fraction(scanner.nextLong(),scanner.nextLong());
        Fraction fraction2 = new Fraction(scanner.nextLong(),scanner.nextLong());

        fraction1.Minimalism();
        fraction2.Minimalism();

        //total
        Fraction fraction = new Fraction();
        long denominator = fraction1.getDenominator() * fraction2.getDenominator();
        long numberator = fraction1.getNumberator() * (denominator/ fraction1.getDenominator()) + fraction2.getNumberator() * (denominator /fraction2.getDenominator());
        fraction.setDenominator(denominator);
        fraction.setNumberator(numberator);
        fraction.Minimalism();
        System.out.println(String.valueOf(fraction.getNumberator()) + "/" + String.valueOf(fraction.getDenominator()));
    }
}