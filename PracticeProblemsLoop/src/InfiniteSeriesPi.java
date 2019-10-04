import java.util.Scanner;
public class InfiniteSeriesPi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of steps: ");
		int steps = scan.nextInt();
		double pi = 0;
		for (int i = 0; i < steps; i++) {
			pi += ((Math.pow((-1), (i+1)))/((2*i) - 1));
		}

		System.out.println("Pi is: " + pi);
		scan.close();
	}
}
