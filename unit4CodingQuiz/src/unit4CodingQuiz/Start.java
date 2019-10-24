package unit4CodingQuiz;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        /**
         * @author Michael Castiglia
         * AP Computer Science A
         * Unit 4 Coding Quiz
         * 
         * Problem 1: Peppers Problem
         */

         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         double avg = 0;
         int sum = 0;

         Scanner scan = new Scanner(System.in);
         System.out.print("Enter number of peppers: ");
         int num = scan.nextInt();

         int weight = 0;

         for(int i = 0; i < num; i++) {
             System.out.print("Enter the weight of a pepper: ");
             weight = scan.nextInt();
             sum += weight;

             if (weight < min) {
                 min = weight;
             }
             if (weight > max) {
                 max = weight;
             }
         }

         avg = (sum * 1.0 / num);
         System.out.println("Greatest Weight: " + max);
         System.out.println("Smallest Weight: " + min);
         System.out.println("Average Weight: " + avg);
         System.out.println("Sum of Weights: " + sum);

         /**
         * @author Michael Castiglia
         * AP Computer Science A
         * Unit 4 Coding Quiz
         * 
         * Problem 2: Gas Types
         */

         System.out.print("Enter the Fuel Number: ");
         int num2 = scan.nextInt();

         if (num2 == 1) {
             System.out.println("Type of Fuel: Regular");
         } else if (num2 == 2) {
             System.out.println("Type of Fuel: Premium");
         } else if (num2 == 3) {
             System.out.println("Type of Fuel: Diesel");
         } else {
             System.out.println("Please Enter a Number Between 1 and 3");
         }


         scan.close();
    }
}
