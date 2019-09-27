package ifElseStatementsAdvancedProblems;
import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number, any number: ");
        int number = input.nextInt();

        if ((number % 2 == 0) && (number % 5 == 0)) {
            System.out.println("Your number is divisible by 2 and 5!");
        } else if (number % 5 == 0) {
            System.out.println("Your number is divisible by 5!");
        } else if (number % 2 == 0) {
            System.out.println("Your number is divisible by 2!");
        } else {
            System.out.println("Your number is divisible by neither 2 or 5!");
        }
        
        input.close();
    }
}
