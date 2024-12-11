//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class J07052 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new FileReader("THISINH.in"));
//        int test = Integer.parseInt(bf.readLine());
//        ArrayList<ThiSinh> arr = new ArrayList<>();
//        while (test-- > 0) {
//            ThiSinh thiSinh = new ThiSinh(bf.readLine(), bf.readLine(), Float.parseFloat(bf.readLine()), Float.parseFloat(bf.readLine()), Float.parseFloat(bf.readLine()));
//            thiSinh.setDiemChuan(thiSinh.getDiemChuan(), thiSinh.getKv());
//            thiSinh.setHoTen(thiSinh.getHoTen());
//            arr.add(thiSinh);
//        }
//        int chiTieu = Integer.parseInt(bf.readLine());
//        float diemChuan = 0;
//        Collections.sort(arr);
//        int cnt = 0;
//        for (ThiSinh thiSinh : arr) {
//            ++cnt;
//            if (cnt == chiTieu) {
//                diemChuan = thiSinh.getDiemChuan();
//                break;
//            }
//        }
//        System.out.println(diemChuan);
//        for (ThiSinh thiSinh : arr) {
//            System.out.print(thiSinh.getMsv() + " " + thiSinh.getHoTen());
//            thiSinh.outputDiemKV();
//            thiSinh.outputDiemChuan();
//            if (thiSinh.getDiemChuan() >= diemChuan) System.out.println("TRUNG TUYEN");
//            else System.out.println("TRUOT");
//        }
//    }
//}
//
//class ThiSinh implements Comparable<ThiSinh> {
//
//    private String msv;
//    private String hoTen;
//    private float toan;
//    private float ly;
//    private float hoa;
//    private float diemChuan;
//    private String kv;
//
//    public float getDiemKV() {
//        return diemKV;
//    }
//
//    public void outputDiemKV() {
//        int tmp = (int) diemKV;
//        if (tmp == diemKV) System.out.printf("%.0f ", diemKV);
//        else System.out.printf("%.1f ", diemKV);
//    }
//
//    private float diemKV;
//
//    public float getDiemChuan() {
//        return diemChuan;
//    }
//
//    public void setDiemChuan(float diemChuan, String kv) {
//        if (kv.equals("KV1")) {
//            this.diemChuan += 0.5f;
//            this.diemKV = 0.5f;
//        } else if (kv.equals("KV2")) {
//            this.diemChuan += 1.0f;
//            this.diemKV = 1.0f;
//        } else if (kv.equals("KV3")) {
//            this.diemChuan += 2.5f;
//            this.diemKV = 2.5f;
//        }
//    }
//
//    public String getKv() {
//        return kv;
//    }
//
//    public void setKv(String kv) {
//        this.kv = kv;
//    }
//
//    public ThiSinh(String msv, String hoTen, float toan, float ly, float hoa) {
//        this.msv = msv;
//        kv = this.msv.substring(0, 3);
//        this.hoTen = hoTen;
//        this.toan = toan;
//        this.ly = ly;
//        this.hoa = hoa;
//        this.diemChuan = this.toan * 2 + this.ly + this.hoa;
//    }
//
//    public String getMsv() {
//        return msv;
//    }
//
//    public void setMsv(String msv) {
//        this.msv = msv;
//    }
//
//    public String getHoTen() {
//        return hoTen;
//    }
//
//    public void setHoTen(String hoTen) {
//        hoTen = hoTen.trim();
//        hoTen = hoTen.toLowerCase();
//        String[] nameString = hoTen.split("\\s+");
//        String res = "";
//        for (String x : nameString) {
//            String tmp = String.valueOf(Character.toUpperCase(x.charAt(0))) + x.substring(1) + " ";
//            res += tmp;
//        }
//        this.hoTen = res;
//    }
//
//    public float getToan() {
//        return toan;
//    }
//
//    public void setToan(float toan) {
//        this.toan = toan;
//    }
//
//    public float getLy() {
//        return ly;
//    }
//
//    public void setLy(float ly) {
//        this.ly = ly;
//    }
//
//    public float getHoa() {
//        return hoa;
//    }
//
//    public void setHoa(float hoa) {
//        this.hoa = hoa;
//    }
//
//    @Override
//    public int compareTo(ThiSinh o) {
//        if (o.diemChuan == this.diemChuan) {
//            if (o.getMsv().compareTo(this.msv) > 0) return -1;
//            return 1;
//        } else {
//            if (o.diemChuan > this.diemChuan) return 1;
//            return -1;
//        }
//    }
//
//    public void outputDiemChuan() {
//        int tmp = (int) diemChuan;
//        if (tmp == this.diemChuan) System.out.printf("%.0f ", this.diemChuan);
//        else System.out.printf("%.1f ", this.diemChuan);
//    }
//}
