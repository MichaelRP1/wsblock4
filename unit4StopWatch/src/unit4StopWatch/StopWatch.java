package unit4StopWatch;

public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long stopTime = 0;

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (this.startTime > this.stopTime) {
            return -1;
        }
        long timeElapsed = this.stopTime - this.startTime;
        return timeElapsed;
    }

    public String toString() {
        String string = "Start Time: " + this.startTime + " Stop Time: " + this.stopTime + " Elapsed Time: " + getElapsedTime();
        return string;
    }



    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        System.out.println(watch);
    }
}
