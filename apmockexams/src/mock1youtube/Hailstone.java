package mock1youtube;
import java.util.ArrayList;

public class Hailstone {
    // Part A
    public static int hailstoneLength(int n) {
        int length = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3*n + 1;
            }
            length++;
        }
        return length;
    }

    /* Part B
    public static double propLong(int n)
    There first needs to be an integer initialized to 0 in order to count the number of long sequences.
    Then, a for loop needs to be created that starts at with an integer at 1 and increments up by 1 each time through the loop, with the condition being that the incremented integer is less than or equal to the integer n that was passed in to the method.
    Inside the for loop, if when the isLongSeq method, called with the integer that increments, returns true, then increment the first counting integer up by 1.
    Outside the for loop, return the average by dividing the first counting integer by the integer "n" that is passed in to the method.
     */

    public static void main(String[] args) {

    }
}
