import java.util.Scanner;

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());

            //
            SoPhuc c = a.Tong(b);

            //
            SoPhuc resC = c.Tich(a);
            SoPhuc resD = c.Tich(c);
            System.out.println(resC + ", " + resD);
        }
    }
}

class SoPhuc {
    public int thuc;
    public int ao;

    public SoPhuc() {
    }


    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc Tong(SoPhuc a) {
        SoPhuc c = new SoPhuc();
        c.thuc = a.thuc + thuc;
        c.ao = a.ao + ao;
        return c;
    }

    public SoPhuc Tich(SoPhuc a) {
        SoPhuc c = new SoPhuc();
        c.thuc = a.thuc * thuc + (-1) * a.ao * ao;
        c.ao = ao * a.thuc + a.ao * thuc;
        return c;
    }

    @Override
    public String toString() {
        if (ao < 0) return thuc + " - " + String.valueOf(Math.abs(ao)) + "i";
        else {
            if (ao > 0) return thuc + " + " + ao + "i";
            return String.valueOf(thuc);
        }
        /*if (thuc != 0) {
            if (ao < 0) return thuc + " - " + String.valueOf(Math.abs(ao)) + "i";
            else {
                if (ao > 0) return thuc + " + " + ao + "i";
                else {
                    return String.valueOf(thuc);
                }
            }
        } else {
            if (ao == 0) return "0";
            else return ao + "i";
        }*/
    }
}