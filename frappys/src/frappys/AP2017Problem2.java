package frappys;

// public class MultPractice implements StudyPractice
public class AP2017Problem2 {
    int first = 1;
    int second = 1;
    public AP2017Problem2(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public String getProblem() {
        return first + " TIMES " + second;
    }

    public void nextProblem() {
        second++;
    }
}
