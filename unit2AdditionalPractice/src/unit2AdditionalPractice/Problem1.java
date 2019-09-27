package unit2AdditionalPractice;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Coordinate: ");
		System.out.print("X1: ");
		double x1 = input.nextDouble();
		System.out.print("Y1: ");
		double y1 = input.nextDouble();
		System.out.print("X2: ");
		double x2 = input.nextDouble();
		System.out.print("Y2: ");
		double y2 = input.nextDouble();
		System.out.print("\n");
		
		double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println("Coordinate 1: (" + x1 + ", " + y1 + ")");
		System.out.println("Coordinate 2: (" + x2 + ", " + y2 + ")");
		System.out.println("Distance Between Coordinates: " + distance);
		
		input.close();
	}
}
