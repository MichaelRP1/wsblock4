package quarter1;
import java.util.Scanner;

public class LoopSwitchIf1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Problem 1

        boolean flag = true;
        System.out.print("Enter a month as a number: ");
        int numMonth;
        String month = "";
        String flagNoFormat;
        
        while (flag == true) {
            numMonth = scan.nextInt();
            if (numMonth == 1) {
                month = "January";
            } else if (numMonth == 2) {
                month = "February";
            } else if (numMonth == 3) {
                month = "March";
            } else if (numMonth == 4) {
                month = "April";
            } else if (numMonth == 5) {
                month = "May";
            } else if (numMonth == 6) {
                month = "June";
            } else if (numMonth == 7) {
                month = "July";
            } else if (numMonth == 8) {
                month = "August";
            } else if (numMonth == 9) {
                month = "September";
            } else if (numMonth == 10) {
                month = "October";
            } else if (numMonth == 11) {
                month = "November";
            } else if (numMonth == 12) {
                month = "December";
            } else {
                month = "Unknown";
            }
            
            System.out.println("Your month is " + month);

            System.out.print("\nWould you like to play again? (Y or N)");
            flagNoFormat = scan.next();
            
            if (flagNoFormat.equalsIgnoreCase("Y")) {
                flag = true;
                System.out.print("Enter a month as a number: ");
            } else {
                flag = false;
            }
        }

        scan.close();
    }
}
