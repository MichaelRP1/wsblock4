package frappys;

import java.util.ArrayList;

// public class Stats
public class FRQPractice3SI {
    private ArrayList<ScoreInfo> scoreList;

    public boolean record(int score) {
        for(int i = 0; i < scoreList.size(); i++) {
            if(score == scoreList.get(i).getScore()) {
                scoreList.get(i).increment();
                return false;
            }
        }
        for(int i = 0; i < scoreList.size(); i++) {
            if(score > scoreList.get(i).getScore()) {
                scoreList.add(i, new ScoreInfo(score));
                return true;
            }
        }
        scoreList.add(new ScoreInfo(score));
        return true;
    }

    public void recordScores(int[] stuScores) {
        int pos = 0;
        for(int i = 0; i < scoreList.size(); i++) {
            for(int j = 0; j < scoreList.get(i).getFrequency(); j++) {
                stuScores[pos] = scoreList.get(i).getScore();
            }
        }
    }
}
