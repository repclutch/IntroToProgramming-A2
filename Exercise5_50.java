package edu.gsu.chapter05assignments;

import java.util.Scanner;

public class Exercise5_50 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)))
				count++;
			
		}

		System.out.println("The number of uppercase letters is " + count);
		
	}

}
