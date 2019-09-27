package unit3IfElseLab;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Imput an Integer: ");
        int intput = input.nextInt();
        if (intput % 5 == 0 && intput % 6 == 0) {
            System.out.println("The inputted number is divisible by 5 and 6!");
        } else if (intput % 5 == 0 || intput % 6 == 0) {
            System.out.println("The inputted number is divisible by 5 or 6!");
        } else {
            System.out.println("The inputted number isn't divisible by 5 or 6!");
        }

        input.close();
    }
}
