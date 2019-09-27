package unit2PracticeProblems;
import java.util.Scanner;

public class ClassworkProblem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		
		String user1 = input.next();
		System.out.print("Enter another word: ");
		
		String user2 = input.next();
		System.out.println("Your words are \"" + user1 + "\" and \"" + user2 + "\"");
		System.out.println("Together, your word is \"" + user1 + user2 + "\"");
		
		boolean equals = user1.equals(user2);
		System.out.println("\nTrue or False?\nYour Words Equal Each Other: " + equals);
		
		boolean equalsCase = user1.equalsIgnoreCase(user2);
		System.out.println("\nTrue or False?\nYour Words Equal Each Other (Case-Independant): " + equalsCase);
		
		int length1 = user1.length();
		int length2 = user2.length();
		System.out.println("\nLength of First Word: " + length1);
		System.out.println("Length of Second Word: " + length2);
		
		char firstLetter = user1.charAt(0);
		System.out.println("First Character of First Word: " + firstLetter);
		input.close();
	}
}
