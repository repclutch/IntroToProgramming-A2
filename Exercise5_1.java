import java.util.Scanner;

public class Exercise5_1 {

	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		
		int numbers;
		int positive = 0;
		int negative = 0;
		int count = 0;
		double total = 0;
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		numbers = input.nextInt();
		
		if (numbers == 0) {
			System.out.println("Enter more numbers other than 0");
			
		}
		
		
		while (numbers != 0) {
			if (numbers > 0)
				positive++;
			else 
				negative++;
			total += numbers;
			count++;
			numbers = input.nextInt();
			
		}
		
		
		double average = total / count;
		
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.printf("The average is %.2f", average);
		
		
	}
}
