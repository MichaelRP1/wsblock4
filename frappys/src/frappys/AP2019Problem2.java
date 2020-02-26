package frappys;

public class AP2019Problem2 {
    private int activeSteps = 0;
    private int activeDays = 0;
    private double sumSteps = 0;
    private int sumDays = 0;

    public AP2019Problem2(int activeSteps) {
        this.activeSteps = activeSteps;
    }

    public void addDailySteps(int steps) {
        if(steps >= activeSteps) {
            activeDays++;
        }
        sumSteps += steps;
        sumDays++;
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        return sumSteps/sumDays;
    }

    public static void main(String[] args) {
        AP2019Problem2 tr = new AP2019Problem2(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());;
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}