//public class Fraction {
//    private long numberator;
//    private long denominator;
//
//    public long getNumberator() {
//        return numberator;
//    }
//
//    public Fraction() {
//    }
//
//    public void setNumberator(long numberator) {
//        this.numberator = numberator;
//    }
//
//    public long getDenominator() {
//        return denominator;
//    }
//
//    public void setDenominator(long denominator) {
//        this.denominator = denominator;
//    }
//
//    public Fraction(long numberator, long denominator) {
//        this.numberator = numberator;
//        this.denominator = denominator;
//    }
//    public void Minimalism(){
//        long gcd = Gcd(numberator,denominator);
//        this.numberator = numberator/gcd;
//        this.denominator = denominator/gcd;
//    }
//    private long Gcd(long a,long b) {
//        if(b == 0) return a;
//        return Gcd(b,a%b);
//    }
//}
