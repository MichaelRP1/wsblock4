package frappys;

import java.util.ArrayList;

public class StudentAnswerSheet {
    private ArrayList<String> answers = new ArrayList<>();

    public double getScore(ArrayList<String> key) {
        double score = 0;
        for(int i = 0; i < key.size(); i++) {
            if (answers.get(i) == "?") {
                continue;
            } else if (answers.get(i) == key.get(i)) {
                sum+= 1;
            } else {
                sum -= 0.25;
            }
        }
        return score;
    }

    private ArrayList<StudentAnswerSheet> sheets = new ArrayList<>();

    public String highestScoringStudent(ArrayList<String> key) {
        String highest = null;
        double highestScore = 0;
        for(StudentAnswerSheet i: sheets) {
            if (i.getScore(key) > highestScore) {
                highestScore = i.getScore(key);
                highest = i.getName;
            }
        }
        return highest;
    }
}
