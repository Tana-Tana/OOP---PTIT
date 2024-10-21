import java.io.*;
import java.util.*;
import java.util.function.BiFunction;

public class J07054 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("Data/BANGDIEM.in"));
        int n = Integer.parseInt(bf.readLine());
        List<Student> students = new ArrayList<>();

        int maSV = 1;
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.setMaSV("SV" + String.format("%02d", maSV++));
            student.setHoTen(bf.readLine());
            student.setDiem1(Double.parseDouble(bf.readLine()));
            student.setDiem2(Double.parseDouble(bf.readLine()));
            student.setDiem3(Double.parseDouble(bf.readLine()));
            student.tinhDiemTrungBinh();
            student.ChuanHoaTen();
            students.add(student);
        }

        // Sắp xếp theo điểm trung bình giảm dần, nếu bằng nhau thì sắp xếp theo mã sinh viên tăng dần
        students.sort((s1, s2) -> {
            if (s1.getDiemTrungBinh() != s2.getDiemTrungBinh()) {
                return Double.compare(s2.getDiemTrungBinh(), s1.getDiemTrungBinh());
            } else {
                return s1.getMaSV().compareTo(s2.getMaSV());
            }
        });

        // Gán hạng
        int rank = 1;
        int cnths = 2;
        students.get(0).setRank(rank);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getDiemTrungBinh() == students.get(i - 1).getDiemTrungBinh()) {
                students.get(i).setRank(rank);
                ++cnths;
            } else {
                rank = cnths;
                students.get(i).setRank(rank);
            }
        }

        // In kết quả
        for (Student student : students) {
            System.out.printf("%s %s%.2f %d\n", student.getMaSV(), student.getHoTen(), student.getDiemTrungBinh(), student.getRank());
        }
    }
}

class Student {
    private String maSV;
    private String hoTen;
    private double diem1, diem2, diem3;
    private double diemTrungBinh;
    private int rank;

    // Constructor, getters, setters

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double tinhDiemTrungBinh() {
        diemTrungBinh = (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8;
        return diemTrungBinh;
    }


    public void ChuanHoaTen() {
        String tmp = "";
        String[] nameString = this.hoTen.trim().toLowerCase().split("\\s+");
        for (String string : nameString) {
            tmp += String.valueOf(Character.toUpperCase(string.charAt(0))) + string.substring(1) + " ";
        }
        this.hoTen = tmp;
    }

}