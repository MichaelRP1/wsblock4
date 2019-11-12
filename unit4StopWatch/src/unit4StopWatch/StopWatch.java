package unit4StopWatch;

public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long stopTime = 0;

    //Constructors
    public StopWatch() {

    }

    public StopWatch(StopWatch s) {
        this.startTime = s.startTime;
        this.stopTime = s.stopTime;
    }

    /**
     * @return startTime
     */
    public long getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopTime
     */
    public long getStopTime() {
        return this.stopTime;
    }

    /**
     * Sets Starttime to Current Time
     * @see startTime
     */
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * Sets Stop Time to Current Time
     * @see stopTime
     */
    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    /**
     * Gets Time Elapsed
     * @see start
     * @see stop
     * @return timeElapsed
     */
    public long getElapsedTime() {
        if (this.startTime > this.stopTime) {
            return -1;
        }
        long timeElapsed = this.stopTime - this.startTime;
        return timeElapsed;
    }

    /**
     * Returns String
     * @return string
     */
    public String toString() {
        String string = "Start Time: " + this.startTime + " Stop Time: " + this.stopTime + " Elapsed Time: " + getElapsedTime();
        return string;
    }



    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        System.out.println(watch);
    }
}
