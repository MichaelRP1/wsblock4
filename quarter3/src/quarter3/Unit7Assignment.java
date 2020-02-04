package quarter3;
import java.util.Scanner;

// Unit 7 (2D Arrays & Hashing) Assignment
// See Google Classroom for More Information
public class Unit7Assignment {
    static Scanner in = new Scanner(System.in);

    public static void findMathStuff(int[][] arr) {
        int sum = 0;
        int max = arr[0][0];
        int min = arr[0][0];
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                sum += arr[r][c];

                if (arr[r][c] > max) {
                    max = arr[r][c];
                }

                if (arr[r][c] < min) {
                    min = arr[r][c];
                }
            }
        }
        double avg = sum / (arr.length * arr[0].length * 1.0);
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        int[][] array = new int[3][2];
        for(int r = 0; r < array.length; r++) {
            for(int c = 0; c < array[r].length; c++) {
                System.out.println("Input entry for row " + r + " column " + c);
                array[r][c] = in.nextInt();
            }
        }

        for(int r = 0; r < array.length; r++) {
            for(int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.print("\n");
        }

        findMathStuff(array);
    }
    /* Output:
    Input entry for row 0 column 0
    8
    Input entry for row 0 column 1
    9
    Input entry for row 1 column 0
    10
    Input entry for row 1 column 1
    4
    Input entry for row 2 column 0
    5
    Input entry for row 2 column 1
    6
    8 9 
    10 4 
    5 6 
    Sum: 42
    Average: 7.0
    Max: 10
    Min: 4
    */
}