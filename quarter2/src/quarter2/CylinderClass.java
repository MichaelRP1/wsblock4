/*
 * Output:
 * Exception in thread "main" This is a CylinderClass with radius = 3.0 and height = 2.0 and color = blue and fill = true
 * java.lang.Exception: Enter a positive radius
 *	at unit5CodingQuiz.CylinderClass.<init>(CylinderClass.java:31)
 *	at unit5CodingQuiz.CylinderClass.main(CylinderClass.java:113)
 */

/**
 * The CylinderClass
 * Use the this keyword to refer to instance variables.
 * Throw exceptions due to negative method parameters
 *
 */
package quarter2;
public class CylinderClass {
	
	public double radius = 1;
	public double height = 1;
	public String color = "red";
	public boolean fill = false;
	
	//
	//Constructors - fill these in
	// throw Exceptions where needed due to negative method parameters
	//
	public CylinderClass() {
	}
	
	/**
	 * Constructor
	 * @param r	method parameter to set the radius
	 * @param h	method parameter to set the height
	 * @param c method parameter to set the color
	 * @param f method parameter to set the fill
	 */
	public CylinderClass(double r,  double h, String c, boolean f) throws Exception {
        if (r <= 0) {
            throw new Exception("Enter a positive radius");
        } else if (h <= 0) {
            throw new Exception("Enter a positive height");
        }
        this.radius = r;
        this.height = h;
        this.color = c;
        this.fill = f;
	}
	
	//
	// Setters - fill these
	//
	
	/**
	 * Set the radius
	 * Throw exceptions when needed due to negative r
	 * @param r - input parameter to set radius
	 */
	public void setRadius(double r) throws Exception {
		if (r <= 0) {
            throw new Exception("Enter a positive radius");
        }
        this.radius = r;
	}
	
	/**
	 * Set the height
	 * Throw exceptions when needed due to negative h
	 * @param h - input parameter to set height
	 */
	public void setHeight(double h) throws Exception {
		if (h <= 0) {
            throw new Exception("Enter a positive height");
        }
        this.height = h;
	}
	
	public void setColor(String c) {
        this.color = c;
	}
	
	public void setFill(boolean f) {
		this.fill = f;
	}
	
	//
	// Getters - fill these in
	//
	public double getRadius() {
		return this.radius;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public boolean getFill() {
		return this.fill;
	}
	

	public double getSurfaceArea() {
		return 2 * Math.PI * this.radius * this.radius + 2 * Math.PI * this.radius * this.height;
	}

	// toString method
	public String toString() {
		String str = "This is a CylinderClass with radius = " + this.radius + " and height = " + this.height + " and color = " + this.color + " and fill = " + this.fill;
		return str;
	}
	
	// Main method - run this and paste output
	public static void main(String[] args) throws Exception{
		
		CylinderClass c = new CylinderClass(3, 2, "blue", true);
        System.out.println(c);
        
		CylinderClass c2 = new CylinderClass(-3, 2, "red", false);
		System.out.println(c2);
	}

}