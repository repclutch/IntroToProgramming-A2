package edu.gsu.chapter06assignments;

public class Exercise6_12 {

	public static void main(String[] args) {
		
		char ch1 = '1';
		char ch2 = 'Z';
		final int NUMBER_PER_LINE = 10;
		
		System.out.println("Characters per 1 to Z");
		printChars(ch1, ch2, NUMBER_PER_LINE);
		System.out.println();
		
		
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		for (char c = ch1, count = 1; c <= ch2; c++, count++) {
			if (count % numberPerLine == 0) 
				System.out.println(c);
			else 
				System.out.println(c + " ");
		}
		
	}

}
