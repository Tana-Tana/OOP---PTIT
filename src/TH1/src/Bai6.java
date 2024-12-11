//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Bai6 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new FileReader("MONHOC.in"));
//        int test = Integer.parseInt(bf.readLine());
//        ArrayList<MonHoc> arr = new ArrayList<>();
//        for(int i=1;i<=test;++i){
//            MonHoc mh = new MonHoc(bf.readLine(),bf.readLine(),Integer.parseInt(bf.readLine()));
//            arr.add(mh);
//        }
//        Collections.sort(arr);
//        for(MonHoc x : arr) System.out.println(x);
//    }
//}
//
//class MonHoc implements Comparable<MonHoc>{
//
//    public String id;
//    public String ten;
//    public int stc;
//
//    public MonHoc(String id, String ten, int stc) {
//        this.id = id;
//        this.ten = ten;
//        this.stc = stc;
//    }
//
//    @Override
//    public int compareTo(MonHoc o) {
//        if(o.ten.compareTo(ten) > 0) return -1;
//        return 1;
//    }
//
//    @Override
//    public String toString() {
//        return id + " " + ten + " " + stc;
//    }
//}
