package quarter3;

public class Unit8AssignmentGeoObj {
    private boolean filled = false;
    private String color = "red";

    public Unit8AssignmentGeoObj() {}

    public Unit8AssignmentGeoObj(String color, boolean fill) {
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
}