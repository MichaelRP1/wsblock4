package ifElseStatementsAdvancedProblems;
import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number, any number: ");
		int number = input.nextInt();

		if (number % 2 == 0) {
			System.out.println("Your number is even!");
		} else {
			System.out.println("Your number is odd!");
		}

		input.close();
	}
}
