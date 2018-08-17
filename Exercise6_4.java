package edu.gsu.chapter06assignments;

import java.util.Scanner;

public class Exercise6_4 {

	public static void main(String[] args) {
		
		int number;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter an integer: ");
		number = input.nextInt();
		
		reverse(number);
		
	}

	public static void reverse(int number) {
		
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
		System.out.println();
		
	}
}
