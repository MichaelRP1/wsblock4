package quarter3;

public abstract class Unit8AssignmentAbstractGeoObj {
    private boolean filled = false;
    private String color = "red";

    public Unit8AssignmentAbstractGeoObj() {}

    public Unit8AssignmentAbstractGeoObj(String color, boolean fill) {
        this.filled = fill;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean fill) {
        this.filled = fill;
    }

    public String toString() {
        return "Color: " + this.color + " Fill: " + this.filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}