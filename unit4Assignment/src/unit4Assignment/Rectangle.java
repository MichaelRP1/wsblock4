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

    public Rectangle(double nLength, double nWidth, String nColor, boolean nFill) {
        length = nLength;
        width = nWidth;
        color = nColor;
        fill = nFill;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newV) {
        length = newV;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newV) {
        width = newV;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newV) {
        color = newV;
    }

    public boolean getFill() {
        return fill;
    }

    public void setFill(boolean newV) {
        fill = newV;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public String toString() {
        double area = length * width;
        double perimeter = 2 * (length + width);
        String string = "Length: " + length + ", Width: " + width + ", Color: " + color + ", Area: " + area + ", Perimeter: " + perimeter + ", and Fill: " + fill;
        return string;
    }

    public double getDiagonal() {
        double diag = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return diag;
    }
}
