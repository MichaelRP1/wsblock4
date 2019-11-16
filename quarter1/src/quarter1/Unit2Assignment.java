package quarter1;
import java.util.Scanner;
/**
 * 
 * @author S26269514
 * @title Unit 2 Assignment
 */

public class Unit2Assignment {
	public static void main(String[] args) {
		// Start Main Problem 1
		System.out.println("----------- Problem 1 -----------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the takeoff velocity:");
		double vel = 0;
		if (input.hasNextDouble()) {
			vel = input.nextDouble();
		} else {
			System.out.println("Only enter numbers please. Restart program to continue");
			System.exit(0);
		}
		
		System.out.println("Enter the plane's intended acceleration:");
		double acc = 0;
		if (input.hasNextDouble()) {
			acc = input.nextDouble();
		} else {
			System.out.println("Only enter numbers please. Restart program to continue");
			System.exit(0);
		}
		problem1(vel, acc);
		// End Main Problem 1
		
		// Start Main Problem 2
		System.out.println("----------- Problem 2 -----------");
		
		System.out.println("Enter the length:");
		double length = 0;
		if (input.hasNextDouble()) {
			length = input.nextDouble();
		} else {
			System.out.println("Only enter numbers please. Restart program to continue");
			System.exit(0);
		}
		
		System.out.println("Enter the width:");
		double width = 0;
		if (input.hasNextDouble()) {
			width = input.nextDouble();
		} else {
			System.out.println("Only enter numbers please. Restart program to continue");
			System.exit(0);
		}
		
		System.out.println("Enter the height:");
		double height = 0;
		if (input.hasNextDouble()) {
			height = input.nextDouble();
		} else {
			System.out.println("Only enter numbers please. Restart program to continue");
			System.exit(0);
		}
		
		problem2(length, width, height);
		// End Main Problem 2
		// Start Main Problem 3
		System.out.println("----------- Problem 3 -----------");
		
		System.out.println("Enter degrees Celcius:");
		double celcius = 0;
		if (input.hasNextDouble()) {
			celcius = input.nextDouble();
		} else {
			System.out.println("Only enter numbers please. Restart program to continue");
			System.exit(0);
		}
		problem3(celcius);
		// End Main Problem 3
		// Start Main Problem 4
		System.out.println("----------- Problem 4 -----------");
		
		System.out.println("Enter radius:");
		double radius = 0;
		if (input.hasNextDouble()) {
			radius = input.nextDouble();
		} else {
			System.out.println("Only enter numbers please. Restart program to continue");
			System.exit(0);
		}
		System.out.println("Enter height:");
		double height1 = 0;
		if (input.hasNextDouble()) {
			height1 = input.nextDouble();
		} else {
			System.out.println("Only enter numbers please. Restart program to continue");
			System.exit(0);
		}
		problem4(radius, height1);
		// Close Scanner
		input.close();
	}
	public static void problem1(double v, double a) {
		double length = (v*v) / (2 * a);
		System.out.println("Minimum length required: " + length);
	}
	public static void problem2(double l, double w, double h) {
		double volume = l * w * h;
		double surfaceArea = 2 * (l * w) + 2 * (w * h) + 2 * (l * h);
		
		System.out.println("Volume: " + volume);
		System.out.println("Surface Area: " + surfaceArea);
	}
	public static void problem3(double c) {
		double fahrenheit = ((9.0/5) * c) + 32;
		
		System.out.println(fahrenheit + " Degrees Fahrenheit");
	}
	public static void problem4(double r, double h) {
		double volume = Math.PI * Math.pow(r, 2) * h;
		double surfaceArea = (Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2) * h);
		
		System.out.printf("Volume: %.3f\n", volume);
		System.out.printf("Surface Area: %.3f\n", surfaceArea);
	}
}
