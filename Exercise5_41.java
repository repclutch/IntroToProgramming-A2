package edu.gsu.chapter05assignments;

import java.util.Scanner;

public class Exercise5_41 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int number;
		
		int largestNum = 0;
		
		int occurrence = 0;
		
		System.out.print("Enter numbers: ");
		
		do {
		
			number = input.nextInt();
			
			if (number > largestNum) {
			
				occurrence = 0;
			
				largestNum = number;
		}
		
			if (number == largestNum) {
			
				occurrence++;
		}
		
		} while (number != 0);
		
		System.out.println("The largest number is " + largestNum);
		System.out.println("The occurrence count of the largest number is " + occurrence);
	}

}
