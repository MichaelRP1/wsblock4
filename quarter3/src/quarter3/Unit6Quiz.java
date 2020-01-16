package quarter3;

public class Unit6Quiz {
	public static void main(String[] args) {
		// Question 1
		int[] array1 = new int[20];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = i + 10;
		}
		for(int i: array1) {
			System.out.println(i);
		}
		
		// Question 2
		int[] array2 = new int[20];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = i + 2;
		}
		for(int i: array2) {
			System.out.println(i);
		}
		
		// Question 3
		int[] array3 = new int[20];
		for(int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] - array2[i];
		}
		for(int i = array3.length - 1; i >= 0; i--) {
			System.out.println(array3[i]);
		}
		int sum = 0;
		for(int i: array3) {
			sum += i;
		}
		double avg = (int) sum / array3.length;
		System.out.println(sum);
		System.out.println(avg);
		
		/* Output:
		 10
		11
		12
		13
		14
		15
		16
		17
		18
		19
		20
		21
		22
		23
		24
		25
		26
		27
		28
		29
		2
		3
		4
		5
		6
		7
		8
		9
		10
		11
		12
		13
		14
		15
		16
		17
		18
		19
		20
		21
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		8
		160
		8.0
		 */
	}
}
