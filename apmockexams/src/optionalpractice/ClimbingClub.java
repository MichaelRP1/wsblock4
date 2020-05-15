package optionalpractice;

import java.util.ArrayList;

public class ClimbingClub {
    private ArrayList<ClimbInfo> climbList;
    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    // Part A and B
    public void addClimb(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    public void addClimbAplha(String peakName, int climbTime) {
        for(int i = 0; i < climbList.size(); i++) {
            if(climbList.get(i).getName().compareTo(peakName) >= 0) {
                climbList.add(i, new ClimbInfo(peakName, climbTime));
                break;
            }
        }
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    /* Part C
    i. No
    ii. Yes
     */
}
