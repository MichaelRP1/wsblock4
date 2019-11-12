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

    /**
     * @param length
     * @param width
     * @param color
     * @param fill
     * @throws Exception
     */
    public Rectangle(double length, double width, String color, boolean fill) throws Exception {
        if (length < 0) {
            throw new Exception("Length must be > 0");
        } else {
            this.length = length;
        }
        if (width < 0) {
            throw new Exception("Width must be > 0");
        } else {
            this.width = width;
        }

        this.color = color;
        this.fill = fill;
    }

    public Rectangle(Rectangle r) throws Exception {
        this.length = r.length;
        this.width = r. width;
        this.color = r.color;
        this.fill = r.fill;
    }

    /**
     * @return length
     */
    public double getLength() {
        return this.length;
    }

    /**
     * @param length
     * @throws Exception
     */
    public void setLength(double newV) throws Exception {
        if (newV < 0) {
            throw new Exception("Length must be > 0");
        } else {
            this.length = newV;
        }
    }

    /**
     * @return width
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * @param length
     */
    public void setWidth(double newV) throws Exception {
        if (newV < 0) {
            throw new Exception("Width must be > 0");
        } else {
            this.width = newV;
        }
    }

    /**
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @param color
     */
    public void setColor(String newV) {
        this.color = newV;
    }

    /**
     * @return fill
     */
    public boolean getFill() {
        return this.fill;
    }

    /**
     * @param fill
     */
    public void setFill(boolean newV) {
        this.fill = newV;
    }

    /**
     * @return area
     */
    public double getArea() {
        double area = this.length * this.width;
        return area;
    }

    /**
     * @return area
     */
    public double getPerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

    /**
     * @return String
     */
    public String toString() {
        double area = this.length * this.width;
        double perimeter = 2 * (this.length + this.width);
        String string = "Length: " + this.length + ", Width: " + this.width + ", Color: " + this.color + ", Area: " + area + ", Perimeter: " + perimeter + ", and Fill: " + this.fill;
        return string;
    }

    /**
     * @return diagonal length
     */
    public double getDiagonal() {
        double diag = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
        return diag;
    }
}
