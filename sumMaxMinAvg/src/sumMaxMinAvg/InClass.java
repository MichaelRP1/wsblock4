package sumMaxMinAvg;
import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("How many input values?: ");
        int input = scan.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print("Enter an Integer: ");
            int value = scan.nextInt();
            sum += value;

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        double avg = sum / input;

        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);

        scan.close();
    }
}
