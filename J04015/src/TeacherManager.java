public class TeacherManager {
    private String MN;
    private String name;
    private long salary;
    private long PC;
    private long HSBL;

    public TeacherManager(String MN, String name, long salary) {
        this.MN = MN;
        this.name = name;
        this.salary = salary;
    }

    public void ChangeValue(){

        StringBuilder sb = new StringBuilder(MN);
        String tmp = sb.substring(0,2);
        if(tmp.equals("HT")) this.PC = 2000000;
        else if(tmp.equals("HP")) this.PC = 900000;
        else this.PC = 500000;

        tmp = sb.substring(2);
        this.HSBL = Long.parseLong(tmp);

        this.salary = this.salary*this.HSBL + this.PC;
    }

    @Override
    public String toString() {
        return this.MN + " " + this.name + " " + this.HSBL
                + " " + this.PC + " " + this.salary;
    }
}
