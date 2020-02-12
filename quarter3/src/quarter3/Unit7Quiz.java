package quarter3;
import java.util.Scanner;

public class Unit7Quiz {
    public static void locateSmallest(int[][] arr) {
        double sum = 0;
        double avg = 0;
        int min = arr[0][0];
        int minr = 0;
        int minc = 0;

        int greaterAvg = 0;

        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                sum += arr[r][c];

                if(arr[r][c] < min) {
                    min = arr[r][c];
                    minr = r;
                    minc = c;
                }
            }
        }

        avg = sum / (arr.length * arr[0].length);

        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] > avg) {
                    greaterAvg++;
                }
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Min Value: " + min + " Min Row: " + minr + " Min Column: " + minc);
        System.out.println("Values Above Average: " + greaterAvg);
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner input = new Scanner(System.in);
        
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                System.out.print("Input value: ");
                arr[r][c] = input.nextInt();
            }
        }

        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.print("\n");
        }

        locateSmallest(arr);

        input.close();
    }

    /* Output:
    Input value: 3
    Input value: 2
    Input value: 1
    Input value: 8
    Input value: 57
    Input value: 6
    3 2 
    1 8 
    57 6 
    Sum: 77.0
    Average: 12.833333333333334
    Min Value: 1 Min Row: 1 Min Column: 0
    Values Above Average: 1 */
}