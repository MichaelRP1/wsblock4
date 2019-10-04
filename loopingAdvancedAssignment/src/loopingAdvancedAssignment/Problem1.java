package loopingAdvancedAssignment;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----- Welcome to Numbers Thing! -----\n");
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        double in;
        double sum = 0;
        for(int count = 0; count < num; count++) {
            System.out.print("Enter a Number: ");
            in = scan.nextDouble();
            sum += in;
        }
        System.out.print("Sum: " + sum);

        scan.close();
    }
}
