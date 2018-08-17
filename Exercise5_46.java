package edu.gsu.chapter05assignments;

import java.util.Scanner;

public class Exercise5_46 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		String str, reverse = "";
		
		System.out.print("Enter a string: ");
		str = input.nextLine();
		
		int length = str.length();
		
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			
		System.out.println("The reversed string is " + reverse);
			
		}
	}

}
