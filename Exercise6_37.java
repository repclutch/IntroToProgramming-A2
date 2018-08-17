package edu.gsu.chapter06assignments;

import java.util.Scanner;

public class Exercise6_37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int number;
		int width;
		
		System.out.print("Enter an integer and its width: ");
		number = input.nextInt();
		width = input.nextInt();
		
		System.out.println(number + " is formatted to the width " + width + ": " + format(number, width));

		
	}
	
	public static String format (int number, int width) {
		
		String num = number + "";
		
		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		return num;
	}

}
