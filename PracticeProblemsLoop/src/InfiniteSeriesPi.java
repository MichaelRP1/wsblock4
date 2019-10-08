import java.util.Scanner;
public class InfiniteSeriesPi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of steps: ");
		int steps = scan.nextInt();
		double pi = 0;
		for (int i = 0; i < steps; i++) {
			pi += ((4 * Math.pow((-1), (i)))/((2*i) + 1));
		}

		System.out.println("Pi is: " + pi);
		scan.close();
	}
}
