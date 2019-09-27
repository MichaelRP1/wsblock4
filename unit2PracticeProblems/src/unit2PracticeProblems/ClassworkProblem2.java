package unit2PracticeProblems;

public class ClassworkProblem2 {
	public static void main(String[] args) {
		double random = Math.random() * 100;
		int intRandom = (int) random;
		System.out.println("Your first random number is: " + intRandom);
		
		random = Math.random() * 100;
		int intRandom2 = (int) random;
		System.out.println("Your second random number is: " + intRandom2);
		
		int sumRandom = intRandom + intRandom2;
		System.out.println("The sum of your random numbers is: " + sumRandom);
	}
}