package edu.gsu.chapter06assignments;

public class Exercise6_10 {

	public static void main(String[] args) {

		int numberOfPrimes = 0;
		
		for (int i = 0; i < 10000; i++) {
			
			if (isPrime (i + 1)) {
				System.out.print((i + 1) + " ");
				numberOfPrimes++;
				
				if (numberOfPrimes % 10 == 0) {
					System.out.println();
				}
			}
			
		}
		
		System.out.println("The number of primes that are less than 10000 are: " + numberOfPrimes);
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
		}
	}
	
	return true;
	
	}
}
