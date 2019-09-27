package firstSampleProject;

public class Problem4 {
	public static void main(String[] args) {
		double subtotal = 33.25;
		double gratuityRate = .15;
		
		double gratuity = subtotal * gratuityRate;
		double orderTotal = gratuity + subtotal;
		
		System.out.println("---------- Problem 4 ------------");
		
		System.out.println("Gratuity: " + gratuity);
		System.out.println("Total: " + orderTotal);
	}
}
