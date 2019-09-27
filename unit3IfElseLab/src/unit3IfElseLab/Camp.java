package unit3IfElseLab;
import java.util.Scanner;

public class Camp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your child's grade: ");
        int grade = input.nextInt();

        if (grade > 11) {
            System.out.println("Your child is too old for camp!");
        } else if (grade == 11) {
            System.out.println("Your child is in the CIT group");
        } else if (grade >= 9) {
            System.out.println("Your child is in the Noar group");
        } else if (grade >= 7) {
            System.out.println("Your child is in the Excelsior group");
        } else if (grade >= 5) {
            System.out.println("Your child is in the Intermediate group");
        } else if (grade == 4) {
            System.out.println("Your child is in the Plebes group");
        } else if (grade >= 1) {
            System.out.println("Your child is in the Juniors group");
        } else {
            System.out.println("Your child is too young for camp!");
        }

        input.close();
    }
}
