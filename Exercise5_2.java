import java.util.Scanner;

public class Exercise5_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int count = 0;
		final int NUMBER_OF_QUESTIONS = 10;
		int correctAnswer = 0;
		String str = " ";
		long startTime = System.currentTimeMillis();
		
		while (count < NUMBER_OF_QUESTIONS) {
		int num1 = (int)(Math.random() * 15 + 1);
		int num2 = (int)(Math.random() * 15 + 1);
		
		if (num1 < num2) {
			
			int temp = num1;
			num1 = num2;
			num2 = temp;	
		}
		
		System.out.println("What is " + num1 + " + " + num2 + "?");
		int answer = input.nextInt();
		
		if(num1 + num2 == answer) {
			System.out.println("You are correct!");
			correctAnswer++;
		} else 
			System.out.println("That is incorrect. " + num1 + " + " + num2 + " should be " + (num1 + num2));
		
		count++;
		
		str += num1 + "+" + num2 + "=" + answer + ((num1 + num2 == answer) ? " correct" : " wrong");
		
		}
		
		long endTime = System.currentTimeMillis();
		long questionTime = endTime - startTime;
		
		System.out.println("You answered " + correctAnswer + " correctly.");
		System.out.println("You took " + questionTime / 1000 + " seconds to complete the test.");
		
	}

}
