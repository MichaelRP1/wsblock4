package quarter3;

public class Unit8AssignmentRect2 extends Unit8AssignmentAbstractGeoObj {
    private double length = 1;
    private double width = 1;

    public Unit8AssignmentRect2() {}

    public Unit8AssignmentRect2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Unit8AssignmentRect2(double length, double width, String color, boolean fill) {
        super(color, fill);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        return super.toString() + " Width: " + width + " Length: " + length + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
}