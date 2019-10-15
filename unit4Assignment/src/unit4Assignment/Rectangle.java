package unit4Assignment;

public class Rectangle {
    // Properties and Variables
    private double length;
    private double width;
    private String color;
    private boolean fill;
    
    public Rectangle() {
        length = 1;
        width = 1;
        color = "red";
        fill = false;
    }

    public Rectangle(double nLength, double nWidth, String nColor, boolean nFill) {
        length = nLength;
        width = nWidth;
        color = nColor;
        fill = nFill;
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
