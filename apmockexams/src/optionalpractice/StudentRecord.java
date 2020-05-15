package optionalpractice;

public class StudentRecord {
    private int[] scores;

    // Part A
    private double average(int first, int last) {
        int sum = 0;
        for(int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return sum / (last-first + 1.0);
    }

    // Part B
    private boolean hasImproved() {
        for(int i = 1; i < scores.length; i++) {
            if(scores[i-1] > scores[i]) {
                return false;
            }
        }
        return true;
    }

    // Part C
    public double finalAverage() {
        int average = 0;
        if(hasImproved()) {
            return average(scores.length/2, scores.length-1);
        } else {
            return average(0, scores.length-1);
        }
    }
}
