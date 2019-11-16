package quarter1;
import java.util.Scanner;

public class LoopSwitchIf3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int numInt = scan.nextInt();
		int numP = 0;
		int numN = 0;

		for (int i = 0; (i < numInt); i++) {
			System.out.print("Enter a integer: ");
			int intE = scan.nextInt();

			if (intE < 0) {
				numN++;
			} else {
				numP++;
			}
		}

		System.out.println("Number of positive: " + numP);
		System.out.println("Number of negative: " + numN);

		scan.close();
	}
}
