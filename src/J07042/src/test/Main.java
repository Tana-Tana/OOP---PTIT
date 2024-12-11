//package test;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("DATA.in"));
//        ArrayList<Pair> arr = (ArrayList<Pair>) oi.readObject();
//        Collections.sort(arr);
//        HashSet<String> hs = new HashSet<>();
//        for(Pair x : arr) {
//            if(x.getFirst() < x.getSecond() && !hs.contains(x.toString()) && isNTCN(x.getFirst(),x.getSecond())) {
//                hs.add(x.toString());
//                System.out.println(x);
//            }
//        }
//
//    }
//    public static boolean isNTCN(int x,int y) {
//        if(GCD(x,y) == 1) return true;
//        return false;
//    }
//
//    public static int GCD(int x,int y){
//        if(y==0) return x;
//        return GCD(y,x%y);
//    }
//}