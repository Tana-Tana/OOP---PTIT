public class Employee {
    private String name;
    private String group;
    private String date;
    private float gpa;
    private String MSV;

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public Employee(String name, String group, String date, float gpa) {
        this.name = name;
        this.group = group;
        this.date = date;
        this.gpa = gpa;
        this.MSV = "B20DCCN";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


}
