package dataAndExpressionAssignment;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Employee's First Name: ");
        String fn = input.next();
        System.out.print("Employee's Last Name: ");
        String ln = input.next();
        System.out.print("Hours per Week: ");
        int hrs = input.nextInt();
        System.out.print("Hourly Pay: $");
        double pay = input.nextDouble();
        System.out.print("Federal Tax: ");
        int fed = input.nextInt();

        double grossPay = hrs * pay;
        double totalTax = grossPay * fed / 100;
        double netPay = grossPay - totalTax;

        System.out.println("\nEmployee Name: " + ln + ", " + fn);
        System.out.println("Hours Worked: " + hrs + " hours");
        System.out.println("Pay Rate: $" + pay);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Federal Tax: " + fed + "%");
        System.out.println("Net Pay: $" + netPay);

        input.close();
    }
}
