import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            PhanSo a = new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo tong = a.Tong(b);
            PhanSo nhan = a.Nhan(b);

            PhanSo res1  = tong.Nhan(tong);
            PhanSo res2 = nhan.Nhan(res1);
            System.out.println(res1 + " " + res2);
        }
    }
}

class PhanSo {
    public long tu;
    public long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        if(this.mau < 0) {
            this.tu *=-1;
            this.mau *= -1;
        }
    }

    public PhanSo Tong(PhanSo phanSo) {
        long mauChung  = mau * phanSo.mau;
        long tuChung = tu*(mauChung/mau) + phanSo.tu*(mauChung/phanSo.mau);
        long gcd = GCD(Math.abs(tuChung), Math.abs(mauChung));
        tuChung/=gcd;
        mauChung/= gcd;
        return new PhanSo(tuChung,mauChung);
    }

    public PhanSo Nhan(PhanSo phanSo) {
        long mauChung  = mau * phanSo.mau;
        long tuChung = tu* phanSo.tu;
        long gcd = GCD(Math.abs(tuChung), Math.abs(mauChung));
        tuChung/=gcd;
        mauChung/= gcd;
        return new PhanSo(tuChung,mauChung);
    }

    public long GCD(long a,long b) {
        if(b==0) return a;
        return GCD(b,a%b);
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}