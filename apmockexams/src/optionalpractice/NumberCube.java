package optionalpractice;

public class NumberCube {
    public static int toss() {
        // Returns Random number between 1 and 6
        return 3;
    }

    // Part A
    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] array = new int[numTosses];
        for(int i = 0; i < array.length; i++) {
            array[i] = toss();
        }
        return array;
    }

    // Part B
    public static int getLongestRun(int[] values) {
        int longest = 0;
        int ind = 0;
        int run = 1;
        for(int i = 0; i < values.length -1; i++) {
            if(values[i] == values[i+1]) {
                run++;
            } else {
                if(run > longest) {
                    longest = run;
                    ind =  i - run +1;
                }
            }
        }
        if(run == 1) { return -1; }
        return ind;
    }
}
