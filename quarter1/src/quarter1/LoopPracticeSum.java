package quarter1;

public class LoopPracticeSum {
    public static void main(String[] args) {
        double sum = 0;
        int num = 100;
        for (int i = 1; i < num; i++) {
            sum += (2.0*(i)-1)/(2.0*(i)+1);
        }
        System.out.println("Sum: " + sum);
    }
}