package quarter1;
import java.util.Scanner;

public class LoopingAdvanced2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----- Metric to Imperial Conversion -----");

        System.out.print("Enter a max value: ");
        int value = scan.nextInt();

        for (int i = 1; i <= value; i++) {
            double pounds = i * 2.2;
            System.out.println(i + " kilograms is " + pounds + " pounds");
        }

        scan.close();
    }
}
