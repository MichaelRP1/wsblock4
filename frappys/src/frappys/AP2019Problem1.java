package frappys;

public class AP2019Problem1 {

	public static int numberOfLeapYears(int year1, int year2) {
		int count = 0;
		for(int i = year1; i <= year2; i++) {
			if(isLeapYear(i)) {
				count++;
			}
		}
		return count;
	}

	public static int dayOfWeek(int month, int day, int year) {
		int first = firstDayOfYear(year);
		int offset = dayOfYear(month, day, year) % 7;
		int final1 = first + offset;
		final1 = final1 % 7;
		return final1;
	}

}
