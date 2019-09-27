package unit3Assignment;
import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Package Weight: ");
        double weight = input.nextDouble();
        double cost = 0;

        if (weight > 20) {
            cost = -1;
        } else if (weight > 10) {
            cost = 10.50;
        } else if (weight > 3) {
            cost = 8.50;
        } else if (weight > 0) {
            cost = 3.50;
        } else {
            cost = 0.00;
        }

        if (cost == -1) {
            System.out.println("Your item is unshippable!");
        } else {
            System.out.println("Shipping Cost: $" + cost);
        }

        input.close();
    }
}
