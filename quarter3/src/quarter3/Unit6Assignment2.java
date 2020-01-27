package quarter3;
import java.util.Scanner;

public class Unit6Assignment2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        double[] arr1 = new double[val];
        for (int i = 0;i < arr1.length; i++) {
            arr1[i] = in.nextDouble();
        }

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.println(arr1[i]);
        }

        double sum = 0;
        double avg = 0;
        double min = arr1[0];
        double max = arr1[0];
        int aboveAvg = 0;

        for (double val1: arr1) {
            sum += val1;
        }
        avg = sum / arr1.length;

        for(double i: arr1) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            if (i > avg) {
                aboveAvg++;
            }
        }

        System.out.println(avg);
        System.out.println(min);
        System.out.println(max);
        System.out.println(aboveAvg);

        double in1 = in.nextDouble();
        int indexFound = -1;
        for(int i = 0;i < arr1.length; i++) {
            if(arr1[i] == in1) {
                indexFound = i;
            }
        }
        if (indexFound == -1) {
            System.out.println("Value was not found");
        } else{
            System.out.println(indexFound);
        }
        in.close();
/*
5
1
2
3
4
5
5.0
4.0
3.0
2.0
1.0
3.0
1.0
5.0
2
2
1
*/
    }
}