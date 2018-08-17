package edu.gsu.chapter06assignments;

import java.util.Scanner;

public class Exercise6_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter integers to add up (do NOT put a space in between each integer): ");
		
		long num = input.nextLong();
		
		System.out.println("The sum of all the digits is: " + sumDigits(num));
		
	}
	
	public static int sumDigits(long n) {
		
		int temp = (int)Math.abs(n);
		int sum = 0;
		
		while (temp != 0) {
			sum += (temp % 10);
			temp = temp / 10;
			
		}
		
		return sum;
	}

}
