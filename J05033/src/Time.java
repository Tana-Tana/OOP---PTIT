public class Time implements Comparable<Time>{
    private int h;
    private int m;
    private int s;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public int compareTo(Time a) {
        if(Integer.compare(h,a.getH()) == 0){
            if(Integer.compare(m,a.getM()) == 0) return Integer.compare(s,a.getS());
            else return Integer.compare(m,a.getM());
        }
        else return Integer.compare(h,a.getH());
    }
}
