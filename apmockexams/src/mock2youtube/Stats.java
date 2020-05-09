package mock2youtube;

import java.util.ArrayList;

public class Stats {
    private ArrayList<ScoreInfo> scoreList;

    // Part A
    public boolean record(int score) {
        for(int i = 0; i < scoreList.size(); i++) {
            if (score < scoreList.get(i).getScore()) {
                continue;
            } else if (score == scoreList.get(i).getScore()) {
                scoreList.get(i).increment();
                return false;
            } else {
                scoreList.add(i-1, new ScoreInfo(score));
                return true;
            }
        }
        scoreList.add(new ScoreInfo(score));
        return true;
    }

    // Part B
    public void recordScores(int[] stuScores) {
        for(int i: stuScores) {
            record(i);
        }
    }

    /* Part C
    You would have to add a new instance variable, private int numSeniors, before the constructor.
    Next, you would have to augment the constructor to accept a boolean isFirstSenior method parameter.
    If the isFirstSenior is true, then set numSeniors to 1.
    Next, you would have to augment the increment() method to accept a boolean isSenior method parameter.
    If the isSenior parameter is true, then increment numSeniors as well.

    public double getSeniorPercent()
     */
}
