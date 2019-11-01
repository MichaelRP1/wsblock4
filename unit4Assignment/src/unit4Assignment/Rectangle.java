package unit4Assignment;

public class Rectangle {

    /**
     * @author Michael Castiglia
     * @version ALPHA 1.0.0
     * 
     * Purpose: To Construct a Rectangle using Length,
     * Width, Color, and Fill Variables, inbluding the
     * use of a no-arg constructor
     * 
     * Built for: AP Computer Science A (Unit 4 Main Assignment Lab)
     */

    // Properties and Variables
    private double length = 1;
    private double width = 1;
    private String color = "red";
    private boolean fill = false;
    
    public Rectangle() {
    }

    public Rectangle(double length, double width, String color, boolean fill) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.fill = fill;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double newV) {
        this.length = newV;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double newV) {
        this.width = newV;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newV) {
        this.color = newV;
    }

    public boolean getFill() {
        return this.fill;
    }

    public void setFill(boolean newV) {
        this.fill = newV;
    }

    public double getArea() {
        double area = this.length * this.width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

    public String toString() {
        double area = this.length * this.width;
        double perimeter = 2 * (this.length + this.width);
        String string = "Length: " + this.length + ", Width: " + this.width + ", Color: " + this.color + ", Area: " + area + ", Perimeter: " + perimeter + ", and Fill: " + this.fill;
        return string;
    }

    public double getDiagonal() {
        double diag = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
        return diag;
    }
}
