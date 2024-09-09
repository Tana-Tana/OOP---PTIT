import java.util.Scanner;

public class KT15p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhap kich thuoc
        int n = sc.nextInt();
        Matran m = new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b = new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran t = m.tong(b.getMatran());
        //viet ra ma tran tong
        t.out();
    }


}

class Matran {
    public int n;
    public int[][] arr;

    public Matran() {

    }

    public Matran(int n) {
        this.n = n;
        arr = new int[this.n + 1][this.n + 1];
    }

    public void input(Scanner scanner) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public int getKT() {
        return this.n;
    }

    public int[][] getMatran() {
        return arr;
    }

    public Matran tong(int[][] a) {
        Matran b = new Matran(n);
        int[][] res = b.arr;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                res[i][j] = a[i][j] + arr[i][j];
            }
        }
        b.arr = res;
        return b;
    }

    public void out() {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
