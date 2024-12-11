//import java.util.Scanner;
//
//public class J04016 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
//        Matrix a = new Matrix(n, m);
//        a.nextMatrix(sc);
//        Matrix b = new Matrix(m, p);
//        b.nextMatrix(sc);
//        System.out.println(a.mul(b));
//    }
//}
//
//class Matrix {
//    public int hang, cot;
//    public int[][] matrix;
//
//    public Matrix(int n, int m) {
//        this.hang = n;
//        this.cot = m;
//        matrix = new int[hang + 5][cot + 5];
//    }
//
//    public void nextMatrix(Scanner sc) {
//        for (int i = 1; i <= hang; ++i) {
//            for (int j = 1; j <= cot; ++j) matrix[i][j] = sc.nextInt();
//        }
//    }
//
//    public Matrix mul(Matrix newMatrix) {
//        Matrix res = new Matrix(hang, newMatrix.cot);
//        for (int i = 1; i <= hang; ++i) {
//            for (int j = 1; j <= newMatrix.cot; ++j) {
//                int sum = 0;
//                for (int z = 1; z <= newMatrix.hang; ++z) {
//                    sum += newMatrix.matrix[z][j] * matrix[i][z];
//                }
//                res.matrix[i][j] = sum;
//            }
//        }
//        return res;
//    }
//
//    @Override
//    public String toString() {
//        String res = "";
//        for (int i = 1; i <= hang; ++i) {
//            for (int j = 1; j <= cot; ++j) {
//                res += String.valueOf(matrix[i][j]);
//                if (j != cot) res += " ";
//            }
//            res += "\n";
//        }
//        return res;
//    }
//}
