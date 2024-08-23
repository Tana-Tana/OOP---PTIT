public class People {
    private String name;
    private String dateBirth;
    private double scoreOne;
    private double scoreTwo;
    private double scoreThree;
    private double result;

    public People(String name, String dateBirth, double scoreOne, double scoreTwo, double scoreThree) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
        this.scoreThree = scoreThree;
        this.result = this.scoreOne + this.scoreTwo + this.scoreThree;
    }

    public double getResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    public String getDateBirth() {
        return dateBirth;
    }
}
