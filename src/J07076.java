//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class J07076 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new FileReader("MATRIX.in"));
//        int test = Integer.parseInt(bf.readLine());
//        while (test-- > 0) {
//            Matrix x = new Matrix(bf.readLine(), bf.readLine());
//            x.inputSplit();
//            x.SolveMatrix();
//            x.OutPut();
//        }
//    }
//}
//
//class Matrix {
//    public int hang, cot, cotChon;
//    public String thongtinFirst;
//    public String thongtinSecond;
//    public int[][] matran;
//
//    public Matrix(String thongtinFirst, String thongtinSecond) {
//        this.thongtinFirst = thongtinFirst;
//        this.thongtinSecond = thongtinSecond;
//    }
//
//    public void inputSplit() {
//        String[] tmp1 = thongtinFirst.split("\\s+");
//        this.hang = Integer.parseInt(tmp1[0]);
//        this.cot = Integer.parseInt(tmp1[1]);
//        this.cotChon = Integer.parseInt(tmp1[2]);
//
//        this.matran = new int[hang + 1][cot + 1];
//        String[] tmp2 = thongtinSecond.split("\\s+");
//        int cnt = 0;
//        for (int i = 1; i <= hang; ++i) {
//            for (int j = 1; j <= cot; ++j) {
//                matran[i][j] = Integer.parseInt(tmp2[cnt++]);
//            }
//        }
//    }
//
//    public void SolveMatrix() {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 1; i <= hang; ++i) {
//            arr.add(matran[i][cotChon]);
//        }
//        Collections.sort(arr);
//        for (int i = 1; i <= hang; ++i) {
//            matran[i][cotChon] = arr.get(i - 1);
//        }
//    }
//
//    public void OutPut() {
//        for (int i = 1; i <= hang; ++i) {
//            for (int j = 1; j <= cot; ++j) {
//                System.out.print(matran[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//
