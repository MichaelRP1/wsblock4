package quarter1;
import java.util.Scanner;

public class Unit3IfElseLabCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = input.nextInt();

        System.out.print("Enter Y: ");
        int y = input.nextInt();

        double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (dist <= 10) {
            System.out.println("Your point is in the circle!");
        } else {
            System.out.println("Your point isn't in the circle");
        }
        
        input.close();
    }
}
