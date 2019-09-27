package firstSampleProject;

/**
 * @title Sample Project (APCSA Class 1)
 * @author s26269514
 */

public class FirstClass {
	public static void main(String[] args) {
		int age = 15;
		String name = "Michael";
		System.out.println("My name is " + name + " and my age is " + age);
		
		// Declaring length and width and computing area with method computeArea
		double length = 3.1;
		double width = 3.7;
		computeArea(length, width);

	}
	public static void computeArea(double l, double w) {
		double area = l * w;
		
		System.out.println("The area of the rectangle is " + area);
	}
}