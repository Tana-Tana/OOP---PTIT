public class Fraction {
    private long numberator;
    private long denominator;

    public Fraction(long numberator, long denominator) {
        this.numberator = numberator;
        this.denominator = denominator;
    }

    public long getNumberator() {
        return numberator;
    }

    public void setNumberator(long numberator) {
        this.numberator = numberator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public void Minimalism(){
        long gcd = GCD(numberator,denominator);
        this.numberator = this.numberator/gcd;
        this.denominator = this.denominator/gcd;
        System.out.println(this.numberator + "/" + this.denominator);
    }

    private long GCD(long a, long b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
}
