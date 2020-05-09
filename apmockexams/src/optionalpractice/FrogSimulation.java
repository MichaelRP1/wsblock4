package optionalpractice;

public class FrogSimulation {
    private int goalDistance = 0;
    private int maxHops = 0;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance() {
        return -1;
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
        for(int i = 0; i < num; i++) {
            if(simulate()) {
                count++;
            }
        }
        return count / num;
    }
}
