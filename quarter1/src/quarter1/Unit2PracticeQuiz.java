package quarter1;
import java.util.Scanner;

public class Unit2PracticeQuiz {
	public static void main(String[] args) {
		double random = Math.random() * 100;
		int intRandom = (int) random;
		double random2 = Math.random() * 100;
		int intRandom2 = (int) random2;
		
		System.out.println("What's the sum of " + intRandom + " and " + intRandom2);
		
		Scanner input = new Scanner(System.in);
		int loopCount;
		boolean isTrue = false;
		int sum = intRandom + intRandom2;
		
		for (loopCount = 0; loopCount < 3; loopCount++)  {
			System.out.print("Attempt " + (loopCount + 1) + "/3: ");
			int guess = input.nextInt();
			
			if (guess == sum) {
				isTrue = true;
				break;
			} else if (loopCount == 2) {
				System.out.println("Your answer was incorrect. You have ran out of attempts");
				break;
			} else {
				System.out.println("Your answer was incorrect. Try again.");
			}
		}
		
		if (isTrue == true) {
			System.out.println("You Answered Correctly!");
		} else {
			System.out.println("You Answered Incorrectly!");
		}
		
		System.out.println("Thanks for playing!");
		
		System.out.println("\nDo you want to try again? Y/N");
		String restart = input.next();
		if (restart.equalsIgnoreCase("Y")) {
			Unit2PracticeQuiz.main(args);
		}
		input.close();
	}
}
