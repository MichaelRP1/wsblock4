package ifElseStatementsAdvancedProblems;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cChoice = (int)(Math.random() * 3);
        int pChoice;
        System.out.println("Welcome to Rock-Paper-Scissors: Java Edition!");
        System.out.println("------------------------------------------");
        System.out.println("Scissors = 0");
        System.out.println("Rock = 1");
        System.out.println("Paper = 2");
        System.out.println("------------------------------------------\n");

        System.out.println("What's your choice?");
        pChoice = input.nextInt();

        if (pChoice == 0) {
            System.out.println("You chose scissors!");
        } else if (pChoice == 1) {
            System.out.println("You chose rock!");
        } else if (pChoice == 2) {
            System.out.println("You chose paper");
        } else {
            System.out.println("Why can't you enter 0, 1, or 2?");
            System.out.println("Just stop playing.");
            System.out.println("... Or play again!\n\n");
            RockPaperScissors.main(args);
        }

        if (cChoice == 0) {
            System.out.println("The computer chose scissors!");
            if (pChoice == 0) {
                System.out.println("You tied! Please play again");
            } else if (pChoice == 1) {
                System.out.println("You won! Your rock crushes the computer's scissors!");
            } else {
                System.out.println("You lost! The computer's scissors cuts your paper!");
            }
        } else if (cChoice == 1) {
            System.out.println("The computer chose rock!");
            if (pChoice == 0) {
                System.out.println("You lost! The computer's rock crushes your scissors!");
            } else if (pChoice == 1) {
                System.out.println("You tied! Please play again");
            } else {
                System.out.println("You win! Your paper covers the computer's rock");
            }
        } else {
            System.out.println("The computer chose paper!");
            if (pChoice == 0) {
                System.out.println("You won! Your scissors cut the computer's paper!");
            } else if (pChoice == 1) {
                System.out.println("You lost! The computer's paper covers your rock!");
            } else {
                System.out.println("You tied! Please play again");
            }
        }

        input.close();
    }
}
