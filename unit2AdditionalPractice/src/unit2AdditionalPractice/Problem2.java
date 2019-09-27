package unit2AdditionalPractice;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in the Time for Top Sleepers: ");
		System.out.print("First Place: ");
		int first = input.nextInt();
		System.out.print("Second Place: ");
		int second = input.nextInt();
		System.out.print("Third Place: ");
		int third = input.nextInt();
		
		int sum = first + second + third;
		double avg = (first + second + third)/3.0;
		System.out.println("Sum of Sleep Time: " + sum);
		System.out.println("Average of Sleep Time: " + avg);
		
		input.close();
	}
}
