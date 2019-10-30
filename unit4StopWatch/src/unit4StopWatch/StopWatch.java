package unit4StopWatch;

public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long stopTime = 0;

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (startTime > stopTime) {
            return -1;
        }
        long timeElapsed = stopTime - startTime;
        return timeElapsed;
    }

    public String toString() {
        String string = "Start Time: " + startTime + " Stop Time: " + stopTime + " Elapsed Time: " + getElapsedTime();
        return string;
    }



    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        System.out.println(watch);
    }
}
