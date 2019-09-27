package captcha;

import java.util.Random;
import java.util.Scanner;

public class MainCaptcha {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		int newRand = 0;
		int loopCount = 0;
		String captchaString = "";
		
		while (loopCount < 10) {
			newRand = rand.nextInt(58) + 65;
			captchaString = captchaString + ((char)newRand);
			loopCount++;
		}
		
		System.out.println("Welcome to Useless Captcha!");
		System.out.println("The Captcha String is " + captchaString);
		String userInput = input.next();
		
		if (userInput.equals(captchaString)) {
			System.out.println("The captcha is complete! You passed!");
			// Do whatever you want after completing Captcha
		} else {
			System.out.println("You failed robot!");
		}
		
		input.close();
	}
}
