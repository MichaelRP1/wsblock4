package quarter3;
import java.util.ArrayList;

public class Unit8AssignmentCircle2 extends Unit8AssignmentAbstractGeoObj {
    private double radius = 1;

    public Unit8AssignmentCircle2() {}

    public Unit8AssignmentCircle2(double radius) {
        this.radius = radius;
    }

    public Unit8AssignmentCircle2(double radius, String color, boolean fill) {
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
        ArrayList<Unit8AssignmentAbstractGeoObj> geoList = new ArrayList<>();

        Unit8AssignmentRect2 rect = new Unit8AssignmentRect2();
        Unit8AssignmentRect2 rect1 = new Unit8AssignmentRect2(5, 3, "blue", true);
        Unit8AssignmentCircle2 circ = new Unit8AssignmentCircle2();
        Unit8AssignmentCircle2 circ1 = new Unit8AssignmentCircle2(4, "green", true);

        geoList.add(rect);
        geoList.add(rect1);
        geoList.add(circ);
        geoList.add(circ1);

        for (Unit8AssignmentAbstractGeoObj i: geoList) {
            System.out.println(i);
        }

        double areaSum = 0;
        for (Unit8AssignmentAbstractGeoObj i: geoList) {
            areaSum += i.getArea();
        }

        double perimSum = 0;
        for (Unit8AssignmentAbstractGeoObj i: geoList) {
            perimSum += i.getPerimeter();
        }

        System.out.println(areaSum);
        System.out.println(perimSum);
    }

    /* Output:
    	Color: red Fill: false Width: 1.0 Length: 1.0 Area: 1.0 Perimeter: 4.0
    	Color: blue Fill: true Width: 3.0 Length: 5.0 Area: 15.0 Perimeter: 16.0
    	Color: red Fill: false Radius: 1.0 Area: 3.141592653589793 Perimeter: 6.283185307179586 Diameter: 2.0
    	Color: green Fill: true Radius: 4.0 Area: 50.26548245743669 Perimeter: 25.132741228718345 Diameter: 8.0
    	69.40707511102649
    	51.41592653589793 */
    
}