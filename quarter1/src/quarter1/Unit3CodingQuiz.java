package quarter1;
import java.util.Scanner;

public class Unit3CodingQuiz {
    public static void main(String[] args) {
        // Problem 1
        Scanner scan = new Scanner(System.in);
        System.out.println("----- Welcome to Word Concattonator! -----\n");
        System.out.print("Enter a word: ");
        String word1 = scan.next();
        System.out.print("Enter a word: ");
        String word2 = scan.next();
        System.out.print("Enter an integer: ");
        int int1 = scan.nextInt();

        System.out.println("Concatenated, your String is: " + word1 + word2 + int1 + "\n\n");

        //Problem 2
        System.out.println("----- Welcome to Cas Price Calculator! -----");
        System.out.println("----- Please Enter the Following Values -----\n");

        System.out.print("Distance: ");
        double dist = scan.nextDouble();
        System.out.print("Fuel Efficiency (mpg): ");
        double eff = scan.nextDouble();
        System.out.print("Price Per Gallon: ");
        double ppg = scan.nextDouble();

        double cost = (dist * ppg) / eff;

        System.out.println("\nYour Trip Cost is $" + cost);
        System.out.println("NOTE: This Price is Only for Gas");
        scan.close();
    }
}
