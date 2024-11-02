import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo y = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo z = x.TinhNhan(y);
            PhanSo w = x.LapPhuong(y, z);
            System.out.println(z + " " + w);
        }
    }
}

class PhanSo {
    public long tu;
    public long mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        if (this.mau < 0) {
            this.tu *= -1;
            this.mau *= -1;
        }
    }

    public PhanSo TinhNhan(PhanSo a) {
        PhanSo c = new PhanSo();
        c.mau = mau * a.mau;
        c.tu = (c.mau / mau) * tu + (c.mau / a.mau) * a.tu;
        long gcd = GCD(Math.abs(c.tu), Math.abs(c.mau));
        c.tu /= gcd;
        c.mau /= gcd;
        c.tu *= c.tu;
        c.mau *= c.mau;
        return c;
    }

    public PhanSo LapPhuong(PhanSo a, PhanSo b) {
        PhanSo c = new PhanSo();
        c.tu = a.tu * b.tu * tu;
        c.mau = a.mau * b.mau * mau;
        long gcd = GCD(Math.abs(c.tu), Math.abs(c.mau));
        c.tu /= gcd;
        c.mau /= gcd;
        return c;
    }

    public long GCD(long a, long b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}