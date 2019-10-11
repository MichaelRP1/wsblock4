package loopingAdvancedAssignment;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String maxName = "";

        int min = Integer.MAX_VALUE;
        String minName = "";

        System.out.print("Number of students who took test: ");
        int input = scan.nextInt();
        int sum = 0;
        int value = 0;
        String name = "";

        for (int i = 0; i < input; i++) {
            System.out.print("Enter an Student Name: ");
            name = scan.next();
            System.out.print("Enter their grade: ");
            value = scan.nextInt();
            sum += value;

            if (value > max) {
                max = value;
                maxName = name;
            }
            if (value < min) {
                min = value;
                minName = name;
            }
        }
        double avg = sum / (input * 1.0);
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average Score: " + avg);
        System.out.println("Highest Scoring Student: " + maxName);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Scoring Student: " + minName);
        System.out.println("Lowest Score: " + min);

        scan.close();
    }
}
