package loopingAdvancedAssignment;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String maxName = "";

        System.out.print("Number of students who took test: ");
        int input = scan.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print("Enter an Student Name: ");
            String name = scan.next();
            System.out.print("Enter their grade: ");
            int value = scan.nextInt();

            if (value > max) {
                max = value;
                maxName = name;
            }
        }

        System.out.println("Highest Scoring Student: " + maxName);
        System.out.println("Highest Score: " + max);

        scan.close();
    }
}
