package frappys;

public class AP2018Problem1 {
    private int goalDistance = 0;
    private int maxHops = 0;

    public AP2018Problem1(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    // A
    public boolean simulate() {
        int dist = goalDistance;
        for(int i = 0; i < maxHops; i++) {
            dist -= hopDistance();
            if (dist > goalDistance) {
                return false;
            }
            if (dist <= 0) {
                return true;
            }
        }
        return false;
    }

    // B
    public double runSimulations(int num) {
        double count = 0;
        for(int i = 0; i < nums; i++) {
            if(simulate()) {
                count++;
            }
        }
        return count / num;
    }
}