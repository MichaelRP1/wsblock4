package quarter3;

public class Unit8AssignmentCircle extends Unit8AssignmentGeoObj {
    double radius = 1;

    public Unit8AssignmentCircle() {}

    public Unit8AssignmentCircle(double radius) {
        this.radius = radius;
    }

    public Unit8AssignmentCircle(double radius, String color, boolean fill) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return super.toString() + " Radius: " + this.radius + " Area: " + getArea() + " Perimeter: " + getPerimeter() + " Diameter: " + (2 * this.radius);
    }

    public static void main(String[] args) {
        Unit8AssignmentRect rect = new Unit8AssignmentRect();
        Unit8AssignmentRect rect1 = new Unit8AssignmentRect(5, 3, "blue", true);
        Unit8AssignmentCircle circ = new Unit8AssignmentCircle();
        Unit8AssignmentCircle circ1 = new Unit8AssignmentCircle(4, "green", true);

        System.out.println(rect);
        System.out.println(rect1);
        System.out.println(circ);
        System.out.println(circ1);
    }

    /* Output: 
    Color: red Fill: false Width: 1.0 Length: 1.0 Area: 1.0 Perimeter: 4.0
    Color: blue Fill: true Width: 3.0 Length: 5.0 Area: 15.0 Perimeter: 16.0
    Color: red Fill: false Radius: 1.0 Area: 3.141592653589793 Perimeter: 6.283185307179586 Diameter: 2.0
    Color: green Fill: true Radius: 4.0 Area: 50.26548245743669 Perimeter: 25.132741228718345 Diameter: 8.0 */
}