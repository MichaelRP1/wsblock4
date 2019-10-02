package loopSwitchifProblems;

public class Problem2 {
	public static void main(String[] args) {
		int num = 100;
        while (num <= 1000) {
        	if (((num % 5 == 0) && (num % 6 == 0)) == true) {
        		System.out.println(num);
        	}
        num++;
        }
	}
}