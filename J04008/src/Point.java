public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Double Distance(Point point){
        double dxSquare = Math.pow(point.getX() - this.x,2);
        double dySquare = Math.pow(point.getY() - this.y,2);
        double distance = Math.sqrt(dxSquare + dySquare);
        return distance;
    }
}
