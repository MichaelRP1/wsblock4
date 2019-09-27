package firstSampleProject;

public class Problem2 {
	public static void main(String[] args ) {
		double length = 4.5;
		double width = 7.9;
		double area = length * width;
		double perimeter = 2 * (length + width);
		
		System.out.println("---------- Problem 2 ------------");
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		// Start Problem 3
		Problem3.main(args);
	}
}
